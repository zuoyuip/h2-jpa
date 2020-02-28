package org.zuoyu.h2test.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.zuoyu.h2test.model.User;
import org.zuoyu.h2test.repository.UserRepository;
import org.zuoyu.h2test.service.UserService;

import java.util.List;

/**
 * @author : zuoyu
 * @project : h2-test
 * @description : 实现
 * @date : 2020-01-17 16:54
 **/
@Service
class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public int save(User user) {
        User entity = userRepository.save(user);
        Assert.notNull(entity, "user's save is fail");
        return entity.getId();
    }

    @Override
    public User updateById(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> listAll() {
        return userRepository.findAll();
    }
}
