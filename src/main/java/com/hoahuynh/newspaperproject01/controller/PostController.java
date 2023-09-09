package com.hoahuynh.newspaperproject01.controller;

import com.hoahuynh.newspaperproject01.entity.AuthorEntity;
import com.hoahuynh.newspaperproject01.entity.PostEntity;
import com.hoahuynh.newspaperproject01.repository.PostRepository;
import com.hoahuynh.newspaperproject01.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService postService;
    @Autowired
    List<PostEntity> listPost;

    @GetMapping
    public ResponseEntity<?> getListPost() {
        listPost = postService.findAll();
        return new ResponseEntity<>(listPost, HttpStatus.OK);
    }

    @PostMapping("add")
    public ResponseEntity<?> addPost(@RequestBody PostEntity postEntity) {
        postService.save(postEntity);
        return new ResponseEntity<>("Đã Thêm" + postEntity, HttpStatus.OK);
    }

    @DeleteMapping("delete")
    public ResponseEntity<?> deletePost(@RequestParam int id) {
        postService.deleteById(id);
        return new ResponseEntity<>("Đã Xóa", HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<?> updatePost(@RequestBody PostEntity postEntity) {
        postService.save(postEntity);
        return new ResponseEntity<>("Đã Sửa", HttpStatus.OK);
    }
}
