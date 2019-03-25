package com.zxc.user.dao;

import com.zxc.user.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author zhongxiancai
 * @Description
 * @Date: Created in 2019/3/25 11:04.
 * @Modified By:
 */
@Repository
public interface UserDao extends JpaRepository<User,String> {
}
