package com.gradletutorial.webservice.domain.post;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @After
    public void cleanup() {
        /**
         이후 테스트 코드에 영향을 끼치지 않기 위해
         테스트 메소드가 끝날때 마다 respository 전체 비우는 코드
         **/
        postRepository.deleteByTitle("test");
    }

    @Test
    public void load_post() {
        //given
        postRepository.save(Post.builder()
                .title("test")
                .context("test")
                .user_id(2)
                .build());

        //when
        List<Post> postsList = postRepository.findAll();

        //then
        Post posts = postsList.get(postsList.size() - 1);
        assertThat(posts.getTitle(), is("test"));
        assertThat(posts.getContext(), is("test"));
    }
}