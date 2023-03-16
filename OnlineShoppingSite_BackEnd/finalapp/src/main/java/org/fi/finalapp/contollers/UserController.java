package org.fi.finalapp.contollers;




import java.util.List;

import org.fi.finalapp.dto.UserDTO;



import org.fi.finalapp.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

	
	@Autowired
	UserService userService;
	
	@GetMapping("/getAllUsers/{pageNo}")
	public List<UserDTO> getAllUsers(@PathVariable("pageNo")int pageNo,@RequestParam("pageSize")int pageSize){
		return userService.getAllUsers(pageNo, pageSize);
	}
	
	@GetMapping("/getAllUsers/{pageNo}/{pageSize}")
	public List<UserDTO> getAllUsersSort(@PathVariable("pageNo")int pageNo,@PathVariable("pageSize")int pageSize,
			@RequestParam("property") String property,@RequestParam("asending") boolean asending){
		return userService.getAllUsersSort(pageNo, pageSize, property, asending);
	}
	@GetMapping("byEmail")
	public List<UserDTO> getUserByEmail(@RequestParam("email") String email)
	{
		return userService.getUserByEmail(email);
	}

	@GetMapping("/user")
	public UserDTO getUser(@RequestParam("name") String name) {
		return userService.getUser(name);
	}
	
	@GetMapping("allByDesending")
	public List<UserDTO> getAllByDescending(){
		return userService.getAllByDescending();
	}
	
	@GetMapping("allByAsending")
	public List<UserDTO> getAllByAscending(){
		return userService.getAllByAscending();
	}
	
	@PostMapping("authenticate")
	public UserDTO authenticateUser(@RequestParam("userName")String userName,@RequestParam("password")String password) {
		return userService.authenticateUser(userName, password);
		
	}
	
	@GetMapping("/allUsers")
	public List<UserDTO> allUsers() {
	return userService.allUsers();
		
	}
}
