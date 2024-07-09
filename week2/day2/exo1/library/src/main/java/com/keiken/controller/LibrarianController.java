package com.keiken.controller;

import com.keiken.entity.Librarian;
import com.keiken.service.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/librarians")
public class LibrarianController {

    @Autowired
    private LibrarianService librarianService;

    @PostMapping
    public Librarian addLibrarian(@RequestBody Librarian librarian) {
        return librarianService.addLibrarian(librarian);
    }

    @GetMapping
    public List<Librarian> getAllLibrarians() {
        return librarianService.getAllLibrarians();
    }

    @DeleteMapping("/{librarianId}")
    public void deleteLibrarian(@PathVariable String librarianId) {
        librarianService.deleteLibrarian(librarianId);
    }
}