package org.fi.finalapp.services;

import java.util.List;

import org.fi.finalapp.dto.UserDTO;




public interface UserService {

	public List<UserDTO> getAllUsers(int pageNo,int pageSize);
	
	public List<UserDTO> getAllUsersSort(int pageNo,int pageSize,
			String property,boolean asending);
	
	public List<UserDTO> getUserByEmail(String email);
	
	public UserDTO getUser( String name);
	
	public List<UserDTO> getAllByDescending();
	
	public List<UserDTO> getAllByAscending();
	
	public UserDTO authenticateUser(String userName,String password);
	
	public List<UserDTO> allUsers(); 
	
	
}
