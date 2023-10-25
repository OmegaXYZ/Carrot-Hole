package com.hust23se.carrothole.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hust23se.carrothole.entity.Comment;

import java.util.List;

/**
 * Comment Service
 *
 * @author MYH
 * @date 2023-10-17
 */
public interface CommentService extends IService<Comment> {

    public boolean publishComment(String postId,String userId ,String commentContent);

    public List<Comment> getCommentsByPostId(String postId);
}
