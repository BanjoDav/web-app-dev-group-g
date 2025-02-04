//Contains boilerplate code for login class - D.Mullen EE417_Group_Project

package com.G_Database.G_Database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // This tells Jakarta JPA to make a table out of this class
public class login {
@Id		// Primary key annotation
private Integer loginid;
private String Username;
private String Pass;

public login() {
	  
}

public login(Integer loginid, String username, String password) {
	  this.loginid = loginid;
	  this.Username = username;
	  this.Pass = password;
}

public Integer getMemberID() {
return loginid;
}

public void setMemberID(Integer membid) {
this.loginid = membid;
}

public String getUserName() {
return Username;
}

public void setName(String name) {
this.Username = name;
}

public String getPassword() {
return Pass;
}

public void setPassword(String sname) {
this.Pass = sname;
}

}