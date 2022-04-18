package com.imooc.bilibili.dao;

import com.alibaba.fastjson.JSONObject;
import com.imooc.bilibili.domain.User;
import com.imooc.bilibili.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Mapper
public interface UserDao {

    Integer addUser(User user);

    User getUserByPhone(@Param("phone") String phone);

    Integer addUserInfo();

    User getUserById(@Param("userId") Long userId);

    UserInfo getUserInfoById(@Param("userId") Long userId);

    Integer updateUserInfos(@Param("userInfo") UserInfo userInfo);

    // 这里重命名了
    List<UserInfo> getUserInfoByIds(@Param("userIdList") Set<Long> followingIdSet);

    Integer pageCountUserInfos(Map<String, Object> params);

    List<UserInfo> pageListUserInfos(Map<String, Object> params);
}
