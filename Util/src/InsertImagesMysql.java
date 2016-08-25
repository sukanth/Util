
import java.sql.*;
import java.io.*;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class InsertImagesMysql{
	public static Connection con = null;
	public static Statement st = null;
	public static ResultSet rs = null;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost/test", "root", "sukanth");
			 System.out.println("connection established to DB successfully");
			 System.out.println("----------------------------");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public static boolean insertImage(){
		try{
			   String imgpath="/Users/sukanthgunda/Pictures/sukanth hdd recovered/sukanth pics/DSC_9998.JPG";
			   File imgfile = new File(imgpath);
			  
			  FileInputStream fin = new FileInputStream(imgfile);
			 
			   PreparedStatement pre =con.prepareStatement("insert into admin (username,password,role,status_cd,joining_dt,profilepic) values(?,?,?,?,?,?)");
			 
			   pre.setString(1,"image");
			   pre.setString(2,"test");
			   pre.setString(3, "user");
			   pre.setString(4, "A");
			   pre.setString(5, "2014-08-29");
			   pre.setBinaryStream(6,(InputStream)fin,(int)imgfile.length());
			   pre.executeUpdate();
			   System.out.println("Successfully inserted the file into the database!");
			   pre.close();
			   con.close(); 
			}catch (Exception e1){
				System.out.println(e1.getMessage());
			}
		
		return true;
	}
/*	public static boolean retrieveImage(){
		try{
		st = (Statement) con.createStatement();
		 rs = st.executeQuery("select profilepicture from admin where username='test'");
		int i = 0;
		while (rs.next()) {
			InputStream in = rs.getBinaryStream(1);
			OutputStream f = new FileOutputStream(new File("test"+i+".jpg"));
			i++;
			int c = 0;
			while ((c = in.read()) > -1) {
				f.write(c);
			}
			f.close();
			in.close();
		}
	}catch(Exception ex){
		System.out.println(ex.getMessage());
	}
		return true;
	}*/
	
	public static void main(String[] args){
		getConnection();
		System.out.println("Insert Image Example!");
		insertImage();
		//retrieveImage();
		
	}
}
