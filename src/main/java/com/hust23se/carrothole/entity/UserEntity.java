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
 * User entity
 *
 * @author MYH
 * @date 2023-10-04
 */
@Data
@NoArgsConstructor
@TableName("user")
public class UserEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id")
    private String userId;

    @TableField("user_name")
    private String userName;

    @TableField("password")
    private String password;

    /**
     * user level
     * 0 represents administrator level
     * 1 represents common user level
     */
    @TableField("level")
    private int level;

    @TableField("register_date")
    private LocalDateTime registerDate;

    @TableField("login_date")
    private LocalDateTime loginDate;

}
