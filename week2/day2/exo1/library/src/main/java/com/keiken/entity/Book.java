package com.keiken.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    private String bookId;
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    @ManyToOne
    private Librarian librarian;

}
