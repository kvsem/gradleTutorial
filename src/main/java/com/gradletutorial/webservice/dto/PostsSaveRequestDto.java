package com.gradletutorial.webservice.dto;

import com.gradletutorial.webservice.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String context;
    private String user_id;

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .context(context)
                .user_id(user_id)
                .build();
    }
}
