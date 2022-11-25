package com.company.employeemanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.company.employeemanagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	List<User> findUsersByRolesId(Long roleId);
	@Query("SELECT u FROM User u WHERE u.username = ?1")
	Optional<User> findByUsername(String username);

}