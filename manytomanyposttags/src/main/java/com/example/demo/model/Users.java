package com.example.demo.model;

import java.util.Collection;

import javax.persistence.*;

@Entity
public class Users {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    String password;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "roles_Users", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "rid"))
    private Collection<Role> roles;

}
