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
 * comment entity
 *
 * @author MYH
 * @date 2023-10-17
 */
@Data
@NoArgsConstructor
@TableName("comment")
public class Comment implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId("comment_id")
    private String commentId;

    @TableField("post_id")
    private String postId;

    @TableField("comment_content")
    private String commentContent;

    @TableField("comment_date")
    private LocalDateTime commentDate;

    @TableField("comment_like")
    private int commentLike;

    @TableField("user_id")
    private String userId;
}
