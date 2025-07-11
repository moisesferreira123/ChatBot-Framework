package br.com.TrabalhoEngSoftwareFramework.framework.dto;

import java.time.LocalDateTime;

import br.com.TrabalhoEngSoftwareFramework.framework.entity.SourceEntity;

public class SourceDTO {

    private Long id;
    private String fileName;
    //private String filePath;
    private LocalDateTime createdAt;

    // Constructor from Entity
    public SourceDTO(SourceEntity source) {
        this.id = source.getId();
        this.fileName = source.getFileName();
        // this.filePath = source.getFilePath(); // Considerar se você quer expor o caminho completo ou uma URL para download
        this.createdAt = source.getCreatedAt();
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getFileName() {
        return fileName;
    }

    /* public String getFilePath() {
        return filePath;
    } */

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
