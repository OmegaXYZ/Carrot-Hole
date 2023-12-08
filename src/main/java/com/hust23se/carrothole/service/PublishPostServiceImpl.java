package com.hust23se.carrothole.service;

import com.hust23se.carrothole.entity.Post;
import com.hust23se.carrothole.util.UniqueKeyGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * publish post service implementation
 *
 * @author MYH
 * @date 2023-10-21
 */
@Service
@Slf4j
public class PublishPostServiceImpl implements PublishPostService{

    @Autowired
    PostServiceImpl postService;

    @Override
    public boolean publishPost(String postTitle, String postContent,String userId) {
        Post post = new Post();
        post.setPostId(UniqueKeyGenerator.generateUniqueKey());
        post.setPostDate(LocalDateTime.now());
        post.setPostLike(0);
        post.setPostTitle(postTitle);
        post.setPostContent(postContent);
        post.setUserId(userId);
        return postService.save(post);
    }
}
