package org.zuoyu.h2test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.zuoyu.h2test.model.User;

/**
 * @author : zuoyu
 * @project : h2-test
 * @description : 用户库
 * @date : 2020-01-17 16:22
 **/
public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {

}
