package org.fi.finalapp.repository;

import java.util.List;

import org.fi.finalapp.entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

	//Stander Quarry On Based On Properties:-
	
	//	public UserEntity findByEmail(String email);
		public List<UserEntity> findByEmail(String email);

		public UserEntity findByName(String name);
		
		//JPA-QL (HQL):-
		@Query(value="select objUser from UserEntity objUser where objUser.userName=:uname and objUser.password=:pwd")
		public UserEntity authenticateUser(@Param("uname")String userName,@Param("pwd")String password);
		
		//JPA-QL (HQL):-
		@Query(value="select objUser from UserEntity objUser")
		public List<UserEntity> getAllUser();
		
		//Native Query:-Decided on nativeQuery=true
		@Query(value="select * from users_0013 order by userName DESC" ,nativeQuery =true)
		public List<UserEntity> getAllRecordsByDescending();
		
		//Native Query:-Decided on nativeQuery=true
		@Query(value="select * from users_0013 order by userName" ,nativeQuery =true)
		public List<UserEntity> getAllRecordsByAscending();
}
