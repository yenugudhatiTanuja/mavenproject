package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Role {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rid;
    private String name;
    
    @ManyToMany(cascade = CascadeType.ALL) 
    @JoinTable(name = "User_Roles",
    joinColumns = { @JoinColumn(name = "User_id") },
    inverseJoinColumns = { @JoinColumn(name = "Role_id") })
	private Set Users = new HashSet<>();
    

}
