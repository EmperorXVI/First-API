package com.example.apiexemplo.controllers;

import com.example.apiexemplo.domain.Book;
import com.example.apiexemplo.services.BookServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/books")
@RestController
public class BookController {

    private final BookServices services;

    public BookController(BookServices services) {
        this.services = services;
    }

    @GetMapping("")
    public ResponseEntity<List<Book>> getBooks(){
        List<Book> books = this.services.getBooksFromLibrary();
        System.out.println(books);
        return ResponseEntity.ok().body(books);
    }
}
