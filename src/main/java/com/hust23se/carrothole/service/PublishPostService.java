package com.hust23se.carrothole.service;

import com.hust23se.carrothole.entity.Post;

/**
 * Publish post service interface
 *
 * @author MYH
 * @date 2023-10-21
 */
public interface PublishPostService {

    public boolean publishPost(String postTitle,String PostContent,String userId);

}
