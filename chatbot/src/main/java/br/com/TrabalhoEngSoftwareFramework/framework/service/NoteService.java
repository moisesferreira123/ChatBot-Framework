package br.com.TrabalhoEngSoftwareFramework.framework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.TrabalhoEngSoftwareFramework.framework.dto.NoteDTO;
import br.com.TrabalhoEngSoftwareFramework.framework.dto.NoteSummaryDTO;
import br.com.TrabalhoEngSoftwareFramework.framework.dto.NoteUpdateDTO;
import br.com.TrabalhoEngSoftwareFramework.framework.entity.NoteEntity;
import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
import br.com.TrabalhoEngSoftwareFramework.framework.exception.InvalidObjectDataException;
import br.com.TrabalhoEngSoftwareFramework.framework.exception.ObjectNotFoundException;
import br.com.TrabalhoEngSoftwareFramework.framework.exception.UnauthorizedObjectAccessException;
import br.com.TrabalhoEngSoftwareFramework.framework.repository.NoteRepository;
import br.com.TrabalhoEngSoftwareFramework.framework.specification.NoteSpecificationBuilder;

@Service
public class NoteService {
	
	@Autowired
	private NoteRepository noteRepository;
	
	public NoteService(NoteRepository noteRepository) {
		this.noteRepository = noteRepository;
	}
	
	@Transactional
	public Long createNote(NoteDTO noteDTO, Long userId) {
		NoteEntity note = new NoteEntity();
		if(noteDTO.getTitle() == null || noteDTO.getTitle().trim().isEmpty()) {
			throw new InvalidObjectDataException("Note title can't be empty");
		}
		note.setTitle(noteDTO.getTitle());
		note.setSubtitle(noteDTO.getSubtitle());
		note.setContent(noteDTO.getContent());
		note.setUserEntity(new UserEntity(userId));
		return noteRepository.save(note).getId();
	}
	
	public Page<NoteSummaryDTO> listNotes(String title, Long userId, String sortType, Pageable pageable) {
		NoteSpecificationBuilder builder = new NoteSpecificationBuilder(title);

		builder.addDesiredSpecification("filterByTitle");
		
		if(sortType != null && !sortType.trim().isEmpty()) {
      builder.addDesiredSpecification(sortType); // Adiciona a ordenação nomeada
    }
		
		Specification<NoteEntity> specification = builder.build(userId, "userEntity");
		
		return noteRepository.findAll(specification, pageable).map(NoteSummaryDTO::new);
	}
	
	@Transactional
	public NoteDTO updateNote(Long noteId, NoteUpdateDTO updateDTO, Long userId) {
		NoteEntity note = noteRepository.findById(noteId).orElseThrow(() -> new ObjectNotFoundException("Note not found"));
		
		if(!note.getUserEntity().getId().equals(userId)) {
			throw new UnauthorizedObjectAccessException("Unauthorized to edit this note");
		}
		
		if (updateDTO.getTitle() != null) {
			if(updateDTO.getTitle().trim().isEmpty()) {
				throw new InvalidObjectDataException("Title can't be empty");
			}
	        note.setTitle(updateDTO.getTitle());
	    }

	    if (updateDTO.getContent() != null) {
	        note.setContent(updateDTO.getContent());
	    }

	    if (updateDTO.getSubtitle() != null) {
	        note.setSubtitle(updateDTO.getSubtitle());
	    }
	    
		return new NoteDTO(noteRepository.save(note));
	}
	
	@Transactional
	public void deleteNote(Long noteId, Long userId) {
		NoteEntity note = noteRepository.findById(noteId).orElseThrow(() -> new ObjectNotFoundException("Note not found"));
		if(!note.getUserEntity().getId().equals(userId)) {
			throw new UnauthorizedObjectAccessException("Unauthorized to delete this note");
		}
		noteRepository.delete(note);
	}
	
	@Transactional(readOnly = true)
	public NoteDTO getNoteById(Long noteId, Long userId) {
		NoteEntity note = noteRepository.findById(noteId).orElseThrow(() -> new ObjectNotFoundException("Note not found"));
		if(!note.getUserEntity().getId().equals(userId)) {
			throw new UnauthorizedObjectAccessException("Unauthorized to view this note");
		}
		return new NoteDTO(note);
	}
	
}
