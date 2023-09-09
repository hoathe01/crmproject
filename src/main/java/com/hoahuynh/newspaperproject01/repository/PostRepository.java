package com.hoahuynh.newspaperproject01.repository;

import com.hoahuynh.newspaperproject01.entity.PostEntity;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Integer> {
}
