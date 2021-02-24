package com.gradletutorial.webservice.web;

import com.gradletutorial.webservice.domain.post.PostRepository;
import com.gradletutorial.webservice.dto.PostSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class WebRestController {

    private final PostRepository postRepository;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @GetMapping("/post")
    public Object getPost() {
        return postRepository.findAll();
    }

    @GetMapping("/post/{postId}")
    public Object getPost(@PathVariable Long postId) {
        return postRepository.findById(postId);
    }

    @PostMapping("/post")
    public void savePost(@RequestBody PostSaveRequestDto dto) {
        postRepository.save(dto.toEntity());
    }
}