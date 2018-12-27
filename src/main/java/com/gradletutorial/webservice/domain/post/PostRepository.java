package com.gradletutorial.webservice.domain.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


public interface PostRepository extends JpaRepository<Post, Long> {
    @Transactional
    void deleteByTitle(String title);
}