package com.example.apiexemplo.feign;

import com.example.apiexemplo.domain.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "book-api", url = "https://books-api-exemplo.s3.sa-east-1.amazonaws.com")
public interface BookClient {
    @GetMapping("/books.json")
    List<Book> getBooks();
}
