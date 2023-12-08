package com.hust23se.carrothole.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hust23se.carrothole.entity.Comment;
import com.hust23se.carrothole.mapper.CommentMapper;
import com.hust23se.carrothole.util.UniqueKeyGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


/**
 * comment service implementation
 *
 * @author MYH
 * @date 2023-10-17
 */
@Service("CommentServiceImpl")
@Slf4j
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService{

    @Override
    public boolean publishComment(String postId, String userId, String commentContent) {
        Comment comment = new Comment();
        comment.setCommentId(UniqueKeyGenerator.generateUniqueKey());
        comment.setCommentContent(commentContent);
        comment.setCommentLike(0);
        comment.setCommentDate(LocalDateTime.now());
        comment.setUserId(userId);
        comment.setPostId(postId);
        return this.save(comment);
    }

    @Override
    public List<Comment> getCommentsByPostId(String postId) {
        QueryWrapper<Comment> commentQueryWrapper = new QueryWrapper<>();
        commentQueryWrapper.eq("post_id",postId);
        return this.list(commentQueryWrapper);
    }
}
