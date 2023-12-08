package com.hust23se.carrothole.controller;

import com.hust23se.carrothole.entity.Comment;
import com.hust23se.carrothole.service.CommentServiceImpl;
import com.hust23se.carrothole.util.ResultMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Comment Controller
 *
 * @author MYH
 * @date 2023-10-25
 */
@Slf4j
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    CommentServiceImpl commentService;

    @PostMapping("/publish")
    public ResultMap publishComment(@RequestBody Map<String,Object> idMap) throws Exception {
        try{
            if(commentService.publishComment(String.valueOf(idMap.get("postId")),String.valueOf(idMap.get("userId")),String.valueOf(idMap.get("commentContent")))){
                return ResultMap.create().setSuccess().setSuccessMsg("publish success");
            }
            return ResultMap.create().setError().setErrorMsg("publish failed");
        }catch (Exception e){
            throw new Exception("publish comment error");
        }
    }

    @PostMapping("/getPostComment")
    public ResultMap getPostComment(@RequestBody Map<String,Object> idMap) throws Exception{
        try{
            List<Comment> commentList = commentService.getCommentsByPostId(String.valueOf(idMap.get("postId")));
            return ResultMap.create().setSuccess().setSuccessMsg("Success").setKeyValue("postId",String.valueOf(idMap.get("postId"))).setKeyValue("commentList",commentList);
        }catch (Exception e){
            throw new Exception("get comment error");
        }
    }
}
