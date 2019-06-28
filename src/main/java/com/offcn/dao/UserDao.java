package com.offcn.dao;

import com.offcn.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {
//***************************************************
    //xinzengfangfa1
    public User findByNameContaining(String keyword);

}
