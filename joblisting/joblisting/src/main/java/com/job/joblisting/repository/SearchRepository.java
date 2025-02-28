package com.job.joblisting.repository;

import com.job.joblisting.models.Post;
import org.springframework.stereotype.Component;

import java.util.List;


public interface SearchRepository {
    List<Post> findByText(String text);
}
