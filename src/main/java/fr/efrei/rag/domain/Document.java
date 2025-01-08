package fr.efrei.rag.domain;

import jakarta.persistence.*;

@Entity
public class Document
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Long id;
    private String title;

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
