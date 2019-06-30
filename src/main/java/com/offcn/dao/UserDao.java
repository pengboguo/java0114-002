package com.offcn.dao;

import com.offcn.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {
//***************************************************
    //xinzengfangfa1
    public User findByNameContaining(String keyword);

    //开发者2 新增方法
    public void demo3(String name);
	
	//开发者1新增方法
	public void demo1();
	
	//开发者1新增方法demo5
	public void demo5();
	
}
