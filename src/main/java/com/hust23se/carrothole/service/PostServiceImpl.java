package com.hust23se.carrothole.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hust23se.carrothole.entity.Post;
import com.hust23se.carrothole.mapper.PostMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.List;

/**
 * post service implementation
 *
 * @author MYH
 * @date 2023-10-17
 */
@Service("PostServiceImpl")
@Slf4j
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements PostService{

    @Override
    public Post getPostByTitle(String title) {
        QueryWrapper<Post> postQueryWrapper = new QueryWrapper<>();
        postQueryWrapper.eq("post_title",title);
        return this.getOne(postQueryWrapper);
    }

    @Override
    public List<Post> getPostByUserId(String userId) {
        QueryWrapper<Post> postQueryWrapper = new QueryWrapper<>();
        postQueryWrapper.eq("user_id",userId);
        return this.list(postQueryWrapper);
    }
}
