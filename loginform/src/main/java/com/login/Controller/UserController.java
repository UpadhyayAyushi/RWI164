package com.login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.login.Entities.User;
import com.login.Repository.UserRepo;

	@Controller
	public class UserController {

		@Autowired
		UserRepo userRepo;

		@GetMapping("/")
		public String login(Model model) {

			User user = new User();
			model.addAttribute("user", user);
			return "login";
		}

		@PostMapping("/userLogin")
		public String loginUser(@ModelAttribute("user") User user) {
			System.out.println(user.getUserId());
			System.out.println(user.getPassword());
			userRepo.save(user);
			return "home";

		}		
	}