package com.hust23se.carrothole.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hust23se.carrothole.entity.Post;

/**
 * Post Service
 *
 * @author MYH
 * @date 2023-10-17
 */
public interface PostService extends IService<Post> {

    public Post getPostByTitle(String title);
}
