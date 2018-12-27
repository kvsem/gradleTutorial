package com.gradletutorial.webservice.web;

import com.gradletutorial.webservice.domain.post.PostRepository;
import com.gradletutorial.webservice.dto.PostSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostRepository postRepository;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public void savePost(@RequestBody PostSaveRequestDto dto) {
        postRepository.save(dto.toEntity());
    }
}