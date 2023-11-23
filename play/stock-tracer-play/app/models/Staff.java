package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Staff extends Model {
 	
	public String ID;
	public String Username;
	public String Password;
	public String Position;
 	
}