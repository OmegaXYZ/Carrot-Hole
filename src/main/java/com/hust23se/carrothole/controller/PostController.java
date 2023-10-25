package com.hust23se.carrothole.controller;

import com.hust23se.carrothole.entity.Post;
import com.hust23se.carrothole.service.PostServiceImpl;
import com.hust23se.carrothole.service.PublishPostServiceImpl;
import com.hust23se.carrothole.util.ResultMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Post Controller
 *
 * @author MYH
 * @date 2023-10-21
 */
@Slf4j
@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    PublishPostServiceImpl publishPostService;

    @Autowired
    PostServiceImpl postService;

    @PostMapping("/publish")
    public ResultMap publishPost(@RequestBody Map<String,Object> idMap) throws Exception {
        try{
            if(publishPostService.publishPost(String.valueOf(idMap.get("postTitle")),String.valueOf(idMap.get("postContent")),String.valueOf(idMap.get("userId")))){
                return ResultMap.create().setSuccess().setSuccessMsg("publish success");
            }
            return ResultMap.create().setError().setErrorMsg("publish failed");
        }catch (Exception e){
            throw new Exception("publish post error");
        }
    }

    @GetMapping("/get")
    public ResultMap getPost(@RequestBody Map<String,Object> idMap) throws Exception{
        try{
            Post post = postService.getById(String.valueOf(idMap.get("postId")));
            if(post == null){
                return ResultMap.create().setError().setErrorMsg("Not found");
            }else{
                return ResultMap.create().setSuccess().setSuccessMsg("Success").setKeyValue("post",post);
            }
        }catch (Exception e){
            throw new Exception("get post error");
        }
    }

    @GetMapping("/search")
    public ResultMap searchPost(@RequestBody Map<String,Object> idMap) throws Exception {
        try{
            Post post = postService.getPostByTitle(String.valueOf(idMap.get("postTitle")));
            if(post == null){
                return ResultMap.create().setError().setErrorMsg("Not found");
            }else{
                return ResultMap.create().setSuccess().setSuccessMsg("Success").setKeyValue("post",post);
            }
        }catch (Exception e){
            throw new Exception("search post error");
        }
    }

    @GetMapping("/getPostList")
    public ResultMap getPostList() throws Exception{
        try{
            List<Post> postList= postService.list();
            return ResultMap.create().setSuccess().setSuccessMsg("Success").setKeyValue("postList",postList);
        }catch (Exception e){
            throw new Exception("search post list error");
        }
    }

    @GetMapping("/getMyPost")
    public ResultMap getMyPost(@RequestBody Map<String,Object> idMap) throws Exception{
        try{
            List<Post> postList= postService.getPostByUserId(String.valueOf(idMap.get("userId")));
            return ResultMap.create().setSuccess().setSuccessMsg("Success").setKeyValue("postList",postList);
        }catch (Exception e){
            throw new Exception("search post list error");
        }
    }
}
