package com.gradletutorial.webservice.domain.posts;

import com.gradletutorial.webservice.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Posts extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String context;

    private String user_id;

    @Builder
    public Posts(String title, String context, String user_id) {
        this.title = title;
        this.context = context;
        this.user_id = user_id;
    }
}
