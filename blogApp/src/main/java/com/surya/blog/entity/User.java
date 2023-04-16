package com.surya.blog.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Create the User table in the db
@Entity		
//to rename table as an users
@Table(name="users")	
@NoArgsConstructor	//for creating no-arg constructor
@Getter				//for creating getter
@Setter				//for creating setter
public class User {
	//to declare id as a primary key
	@Id 	
	//to autoIncrement the id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	//to rename field name as user_name applying any constraints
	@Column(name="user_name", nullable=false,length=100)
	private String name;
	private String email;
	private String password;

	private String about;

}
