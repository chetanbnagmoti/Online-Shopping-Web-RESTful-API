package org.fi.finalapp.services;

import java.util.ArrayList;
import java.util.List;

import org.fi.finalapp.dto.UserDTO;
import org.fi.finalapp.entity.UserEntity;
import org.fi.finalapp.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService {

	@Autowired
	UserRepository repositoryUser;
	
	@Override
	public List<UserDTO> getAllUsers(int pageNo, int pageSize) {
		Pageable page =PageRequest.of(pageNo, pageSize);
		List<UserEntity>dataList =repositoryUser.findAll(page).toList();
		ArrayList<UserDTO> list =new ArrayList<>();
		for(UserEntity user : dataList) {
			UserDTO dto =new UserDTO();
			BeanUtils.copyProperties(user, dto);
			list.add(dto);
		}
		return list;
	}

	@Override
	public List<UserDTO> getAllUsersSort(int pageNo, int pageSize, String property, boolean asending) {
		Sort sorting =null;
		if(asending)
			sorting= Sort.by(property).ascending();
		else
			sorting= Sort.by(property).descending();
		Pageable page =PageRequest.of(pageNo, pageSize,sorting);
		List<UserEntity>dataList =repositoryUser.findAll(page).toList();
		ArrayList<UserDTO> list =new ArrayList<>();
		for(UserEntity user : dataList) {
			UserDTO dto =new UserDTO();
			BeanUtils.copyProperties(user, dto);
			list.add(dto);
		}
		return list;
	}

	@Override
	public List<UserDTO> getUserByEmail(String email) {
		List<UserEntity> dataList = repositoryUser.findByEmail(email);
		ArrayList<UserDTO> list = new ArrayList<>();
		for(UserEntity user : dataList)
		{
			UserDTO dto = new UserDTO();
			BeanUtils.copyProperties(user, dto);
			list.add(dto);			
		}
		
		return list;
	}

	@Override
	public UserDTO getUser(String name) {
		UserEntity user =repositoryUser.findByName(name);
		System.out.println(name);
		System.out.println(user);
		UserDTO dto =new UserDTO();
		BeanUtils.copyProperties(user, dto);
		return dto;
	}

	@Override
	public List<UserDTO> getAllByDescending() {
		List<UserEntity> dataList = repositoryUser.getAllRecordsByDescending();
		ArrayList<UserDTO> list =new ArrayList<>();
		for(UserEntity user :dataList) {
			UserDTO dto =new UserDTO();
			BeanUtils.copyProperties(user, dto);
			list.add(dto);
		}
		return list;
	}

	@Override
	public List<UserDTO> getAllByAscending() {
		List<UserEntity> dataList = repositoryUser.getAllRecordsByAscending();
		ArrayList<UserDTO> list =new ArrayList<>();
		for(UserEntity user :dataList) {
			UserDTO dto =new UserDTO();
			BeanUtils.copyProperties(user, dto);
			list.add(dto);
		}
		return list;
	}

	@Override
	public UserDTO authenticateUser(String userName, String password) {
		UserEntity user= repositoryUser.authenticateUser(userName, password);
		UserDTO dto =new UserDTO();
		BeanUtils.copyProperties(user, dto);
	//	dto.setPassword("*********");
		return dto;
	}

	@Override
	public List<UserDTO> allUsers() {
		List<UserEntity> dataList= repositoryUser.getAllUser();
		ArrayList<UserDTO> list =new ArrayList<>();
		for(UserEntity user :dataList) {
			UserDTO dto =new UserDTO();
			BeanUtils.copyProperties(user, dto);
			list.add(dto);
		}
		return list;
	}

}
