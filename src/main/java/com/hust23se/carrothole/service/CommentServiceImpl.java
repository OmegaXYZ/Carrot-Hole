package com.hust23se.carrothole.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hust23se.carrothole.entity.Comment;
import com.hust23se.carrothole.mapper.CommentMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


/**
 * comment service implementation
 *
 * @author MYH
 * @date 2023-10-17
 */
@Service("CommentServiceImpl")
@Slf4j
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService{
}
