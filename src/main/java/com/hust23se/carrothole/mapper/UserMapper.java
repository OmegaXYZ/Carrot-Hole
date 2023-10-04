package com.hust23se.carrothole.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hust23se.carrothole.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * User mapper interface
 *
 * @author MYH
 * @date 2023-10-04
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
}
