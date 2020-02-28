package org.zuoyu.h2test.service;

import org.zuoyu.h2test.model.User;

import java.util.List;

/**
 * @author : zuoyu
 * @project : h2-test
 * @description : 用户服务
 * @date : 2020-01-17 16:43
 **/
public interface UserService {

    /**
     * 添加用户
     * @param user -
     * @return - id
     */
    int save(User user);

    /**
     * 修改用户
     * @param user -
     * @return -
     */
    User updateById(User user);


    /**
     * 删除用户
     * @param id -
     */
    void deleteById(Integer id);

    /**
     * 查询全部
     * @return -
     */
    List<User> listAll();
}
