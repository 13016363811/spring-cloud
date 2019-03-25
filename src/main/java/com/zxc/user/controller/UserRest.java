package com.zxc.user.controller;

import com.zxc.user.dao.UserDao;
import com.zxc.user.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhongxiancai
 * @Description
 * @Date: Created in 2019/3/25 11:13.
 * @Modified By:
 */
@RestController
public class UserRest {
    @Autowired private UserDao userDao;

    @GetMapping("/{id}")
    public User findById(@PathVariable String id){
        return this.userDao.findOne(id);
    }


}
