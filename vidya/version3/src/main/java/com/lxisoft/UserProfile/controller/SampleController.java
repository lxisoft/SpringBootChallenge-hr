package com.lxisoft.UserProfile.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.lxisoft.UserProfile.model.User;
import com.lxisoft.UserProfile.repository.UserRepository;

@RestController
public class SampleController {

		@Autowired
		UserRepository userRepo;
	
		@RequestMapping("/user_home_page")
		public ModelAndView showUsers(){
			
			ModelAndView mav=new ModelAndView("HomePage");
			return mav;
		}
		@RequestMapping(value = "home", method = RequestMethod.GET)
		public ModelAndView findAllTask(ModelMap m) {

			ModelAndView mav=null;
			List<User> list = userRepo.findAll();
			for(int i=0;i<list.size();i++){
			
			m.put("name", list.get(i).getName());
			mav=new ModelAndView("ShowUsers");
			}
			
			
			return mav;

		}

	

		@RequestMapping("/registration")
		public ModelAndView RegisterUser(){
			
			ModelAndView mav=new ModelAndView("Register");
			return mav;
		}
		
		@RequestMapping("/registerSucessfully")
		
		
			public User saveUser(MultipartFile photo, MultipartFile resumePdf,@RequestParam String name,@RequestParam String email,@RequestParam long phoneNumber,@RequestParam String username,@RequestParam String password) throws IOException {
				
			User user=new User(name, email, phoneNumber,username, password);
				user.setPhoto(photo.getBytes());
				user.setResumePdf(resumePdf.getBytes());
				
				userRepo.save(user);
				return user;
				
				
		}
		

		@RequestMapping("/login")
		public ModelAndView loginUser(){
		
			ModelAndView mav=new ModelAndView("Login");
			return mav;
		
		}
		@RequestMapping("/loginSuccessfully")
		public void checkUserLogin(@RequestParam String username,@RequestParam String password,ModelMap m){
			
			
			
			
		}
		
		
		
		
		@RequestMapping("/viewHome")
		public ModelAndView viewUserHome(){
			
			ModelAndView mav=new ModelAndView("ViewHome");
			return mav;
		}
	
}
