package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Stock extends Model {
 	
	public Integer ID_Barang;
	public String Nama_Barang;
	public String Jenis;
 	public String Tersedia;
}