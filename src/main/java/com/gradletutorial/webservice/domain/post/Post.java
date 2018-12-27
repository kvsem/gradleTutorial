package com.gradletutorial.webservice.domain.post;

import com.gradletutorial.webservice.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Post extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String context;

    private Integer user_id;

    @Builder
    public Post(String title, String context, Integer user_id) {
        this.title = title;
        this.context = context;
        this.user_id = user_id;
    }
}
