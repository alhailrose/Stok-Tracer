package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Staff extends User {
	
	public Integer ID;
	public String Username;
	public String Password;
	public String Position;

	public void Edit() {
		throw new UnsupportedOperationException();
	}

	public void Delete() {
		throw new UnsupportedOperationException();
	}
}