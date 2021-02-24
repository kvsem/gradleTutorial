package com.gradletutorial.webservice.web;

import com.gradletutorial.webservice.domain.post.Post;
import com.gradletutorial.webservice.domain.post.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class WebController {
    private final PostRepository postRepository;

    @GetMapping
    public String hello(Model model) {
        List<Post> postList = postRepository.findAll();
        model.addAttribute("postList", postList);
        return "main";
    }
}