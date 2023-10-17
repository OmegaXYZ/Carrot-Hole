package com.hust23se.carrothole.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Post entity
 *
 * @author MYH
 * @date 2023-10-17
 */
@Data
@NoArgsConstructor
@TableName("post")
public class Post implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId("post_id")
    private String postId;

    @TableField("post_title")
    private String postTitle;

    @TableField("post_content")
    private String postContent;

    @TableField("post_date")
    private LocalDateTime postDate;

    @TableField("post_like")
    private int postLike;

    @TableField("user_id")
    private String userId;
}
