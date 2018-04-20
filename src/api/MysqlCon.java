package api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement; 

public class MysqlCon {

	
    
 
    public String getSize(double gurt){  
	    try{  
		    Class.forName("com.mysql.jdbc.Driver");  
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Datenbank","root","Kiffen9!!");   
		    Statement stmt=con.createStatement();  
		    ResultSet rs=stmt.executeQuery("select distinct size from Paket where min <= " + gurt + " and max >= " + gurt);  
		    rs.next();
		    String size =rs.getString(1);  
		    con.close();  
		    return size;
	    }catch(Exception e){ System.out.println(e);} 
	    	return "";
    }  
  
}
