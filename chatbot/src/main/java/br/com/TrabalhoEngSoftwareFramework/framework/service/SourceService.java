package br.com.TrabalhoEngSoftwareFramework.framework.service;

import br.com.TrabalhoEngSoftwareFramework.framework.dto.SourceDTO;
import br.com.TrabalhoEngSoftwareFramework.framework.entity.NoteEntity;
import br.com.TrabalhoEngSoftwareFramework.framework.entity.SourceEntity;
import br.com.TrabalhoEngSoftwareFramework.framework.exception.FileStorageException;
import br.com.TrabalhoEngSoftwareFramework.framework.exception.ObjectDeletionException;
import br.com.TrabalhoEngSoftwareFramework.framework.exception.ObjectNotFoundException;
import br.com.TrabalhoEngSoftwareFramework.framework.exception.StorageInitializationException;
import br.com.TrabalhoEngSoftwareFramework.framework.exception.UnauthorizedObjectAccessException;
import br.com.TrabalhoEngSoftwareFramework.framework.repository.NoteRepository;
import br.com.TrabalhoEngSoftwareFramework.framework.repository.SourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SourceService {

    @Autowired
    private SourceRepository sourceRepository;

    @Autowired
    private NoteRepository noteRepository; // Para encontrar a nota associada ao arquivo

    // TODO: Configurar o diretório de upload de forma mais robusta (ex: usando propriedades do Spring)
    private final String uploadDir = "./uploads"; // FIXME: Temporário, deve ser configurado corretamente

    public SourceService() {
        // Criar o diretório de upload se não existir
        try {
            Files.createDirectories(Paths.get(uploadDir));
        } catch (IOException e) {
            // Tratamento básico de erro
            e.printStackTrace();
            throw new StorageInitializationException("Failed to initialize storage directory");
        }
    }

    @Transactional
    public SourceDTO uploadSource(Long noteId, Long userId, MultipartFile file) {
        NoteEntity note = noteRepository.findById(noteId)
                .orElseThrow(() -> new ObjectNotFoundException("Note not found"));

        if (!note.getUserEntity().getId().equals(userId)) {
            throw new UnauthorizedObjectAccessException("Unauthorized to add source to this note");
        }

        try {
            String originalFileName = file.getOriginalFilename();
            String uniqueFileName = System.currentTimeMillis() + "_" + originalFileName;
            Path filePath = Paths.get(uploadDir, uniqueFileName);

            Files.copy(file.getInputStream(), filePath);

            SourceEntity source = new SourceEntity();
            source.setFileName(originalFileName);
            source.setFilePath(filePath.toString());
            source.setNoteEntity(note);

            SourceEntity savedSource = sourceRepository.save(source);

            return new SourceDTO(savedSource);

        } catch (IOException e) {
            throw new FileStorageException("Failed to upload file");
        }
    }

    @Transactional(readOnly = true)
    public List<SourceDTO> getSourcesByNoteId(Long noteId, Long userId) {
        NoteEntity note = noteRepository.findById(noteId)
                .orElseThrow(() -> new ObjectNotFoundException("Note not found"));

        if (!note.getUserEntity().getId().equals(userId)) {
            throw new UnauthorizedObjectAccessException("Unauthorized to view sources for this note");
        }

        List<SourceEntity> sources = sourceRepository.findByNoteEntityId(noteId);
        return sources.stream()
                .map(SourceDTO::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public void deleteSource(Long sourceId, Long userId) {
        SourceEntity source = sourceRepository.findById(sourceId)
                .orElseThrow(() -> new ObjectNotFoundException("Source not found"));

        if (!source.getNoteEntity().getUserEntity().getId().equals(userId)) {
            throw new UnauthorizedObjectAccessException("Unauthorized to delete this source");
        }

        try {
            Path filePath = Paths.get(source.getFilePath());
            Files.deleteIfExists(filePath);
            sourceRepository.delete(source);
        } catch (IOException e) {
            throw new ObjectDeletionException("Failed to delete file " + source.getFileName());
        }
    }
}