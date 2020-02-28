package org.zuoyu.h2test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import org.zuoyu.h2test.model.User;
import org.zuoyu.h2test.service.UserService;

import java.util.Collections;
import java.util.List;

/**
 * @author : zuoyu
 * @project : h2-test
 * @description : 视图
 * @date : 2020-01-17 17:33
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Integer> save(User user){
        int userId = userService.save(user);
        return ResponseEntity.ok(userId);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        userService.deleteById(id);
        return ResponseEntity.ok("删除成功！");
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<User> update(@PathVariable Integer id, User user){
        User userDTO = userService.updateById(user.setId(id));
        return ResponseEntity.ok(userDTO);
    }

    @GetMapping
    public ResponseEntity<List<User>> select(){
        List<User> users = userService.listAll();
        if (CollectionUtils.isEmpty(users)){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok(users);
    }
}
