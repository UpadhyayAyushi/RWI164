package com.login.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.login.Entities.User;


public interface UserRepo extends JpaRepository<User,String> {
	User findByuserId(String userId);


}
