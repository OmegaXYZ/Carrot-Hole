package com.hust23se.carrothole.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hust23se.carrothole.entity.Post;
import com.hust23se.carrothole.mapper.PostMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * post service implementation
 *
 * @author MYH
 * @date 2023-10-17
 */
@Service("PostServiceImpl")
@Slf4j
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements PostService{
}
