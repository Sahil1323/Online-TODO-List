package com.todoapp.todoproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "courses_table")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String description;
    private String status;
   

    @Column(name = "username")
    private String username;


	public Integer getId() {
		// TODO Auto-generated method stub
		return this.id;
	}


	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}


	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		
	}


	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}


	public void setDescription(String description) {
		// TODO Auto-generated method stub
		this.description = description;
		
	}


	public String getStatus() {
		// TODO Auto-generated method stub
		return this.status;
	}


	public void setStatus(String status) {
		// TODO Auto-generated method stub
		this.status = status;
	}
}
