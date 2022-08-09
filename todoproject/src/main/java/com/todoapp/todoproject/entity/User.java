package com.todoapp.todoproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "username", unique = true)
    private String username;
    private String password;
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.username;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}
}