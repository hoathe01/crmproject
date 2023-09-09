package com.hoahuynh.newspaperproject01.controller;

import com.hoahuynh.newspaperproject01.entity.AuthorEntity;
import com.hoahuynh.newspaperproject01.repository.AuthorRepository;
import com.hoahuynh.newspaperproject01.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("author")
public class AuthorController {
    @Autowired
    AuthorService authorService;
    @Autowired
    List<AuthorEntity> listAuthor;

    @GetMapping
    public ResponseEntity<?> getListAuthor() {
        listAuthor = authorService.findAll();
        return new ResponseEntity<>(listAuthor, HttpStatus.OK);
    }

    @PostMapping("add")
    public ResponseEntity<?> addAuthor(@RequestBody AuthorEntity authorEntity) {
        authorService.save(authorEntity);
        return new ResponseEntity<>("Đã Thêm", HttpStatus.OK);
    }

    @DeleteMapping("delete")
    public ResponseEntity<?> deleteAuthor(@RequestParam int id) {
        authorService.deleteById(id);
        return new ResponseEntity<>("Đã Xóa", HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<?> updateAuthor(@RequestBody AuthorEntity authorEntity) {
        authorService.save(authorEntity);
        return new ResponseEntity<>("Đã Sửa", HttpStatus.OK);
    }
}
