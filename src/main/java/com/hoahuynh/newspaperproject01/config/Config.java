package com.hoahuynh.newspaperproject01.config;

import com.hoahuynh.newspaperproject01.entity.AuthorEntity;
import com.hoahuynh.newspaperproject01.entity.PostEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {
    @Bean
    public List<AuthorEntity> getListAuthor(){
        return new ArrayList<AuthorEntity>();
    }
    @Bean
    public AuthorEntity authorEntity(){
        return new AuthorEntity();
    }
    @Bean
    public List<PostEntity> getListPost(){
        return new ArrayList<PostEntity>();
    }
}
