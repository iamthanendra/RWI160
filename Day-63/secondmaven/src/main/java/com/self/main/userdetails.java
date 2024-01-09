package com.self.main;

import javax.persistence.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
public class userdetails { 
	 @Id
	 @GeneratedValue
private int id;  
private String firstName,lastName;  
 public userdetails() {}
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
public String getFirstName() {  
    return firstName;  
}  
public void setFirstName(String firstName) {  
    this.firstName = firstName;  
}  
public String getLastName() {  
    return lastName;  
}  
public void setLastName(String lastName) {  
    this.lastName = lastName;  
}  
  
  
}  