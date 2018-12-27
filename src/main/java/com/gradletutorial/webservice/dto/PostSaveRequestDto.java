package com.gradletutorial.webservice.dto;

import com.gradletutorial.webservice.domain.post.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostSaveRequestDto {

    private String title;
    private String context;
    private Integer user_id;

    public Post toEntity() {
        return Post.builder()
                .title(title)
                .context(context)
                .user_id(user_id)
                .build();
    }
}
