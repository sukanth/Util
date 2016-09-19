package Practice;
 
/*------------------------------------------------------------------------------------------------------------------------------
* DB Comparision Tool
* Author : Sukanth Gunda
* Description: DB Comparision Tool is used to compare two different schemas and tells you whether they are in sync or not if not they will give the differentiaion.
* Usage : Fill In the properities Files and run the program Rest of it is done by the program for you.
*------------------------------------------------------------------------------------------------------------------------------
* */
 
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
 
public class DBComparisionTool {
 
/**
* @param args
* @author sukanth Gunda
* @see Date - 5th july 2014
*/
private static Connection devConn = null;
private static Connection qaConn = null;
private static Properties prop = null;
private static InputStream input = null;
private static String db1 = "DB1";
private static String db2 = "DB2";
private static String devSchema = null;
private static String qaSchema = null;
private static ResultSet devTables ,qaTables = null;
private static PreparedStatement psmt = null;
private static ArrayList<String> missingTables = null;
private static String SUPPORT="SUPPORT";
private static String GRNHILLS="GRNHILLS";
private static String tableQuery = "SELECT TABLE_NAME FROM information_schema.TABLES WHERE TABLE_SCHEMA = ?";
 
 
// DB Connection
public static void main(String[] args) throws IOException
{
// TODO Auto-generated method stub
try
{
                connectToDb1(db1);
                connectToDb2(db2);
               
                psmt = devConn.prepareStatement(tableQuery);
                psmt.setString(1,devSchema);
                devTables = psmt.executeQuery();
                System.out.println("Reading Tables In Dev(Support)");
               
                psmt = qaConn.prepareStatement(tableQuery);
                psmt.setString(1,qaSchema);
                qaTables = psmt.executeQuery();
                System.out.println("Reading Tables In GrnHills(QA)");
                missingTables = new ArrayList<String>();
                while(devTables.next())
                {
                       missingTables.add(devTables.getString(1));                       
                               
                }
                System.out.println("Comparing Dev(Support) Over GrnHills(QA) Please Wait.........");
                while(qaTables.next())
                {
                     missingTables.remove(qaTables.getString(1));                  
                }
               
                for(String missinTables : missingTables)
                {
                                System.out.println("Missing tables in GrnHills(QA) over Dev(Support) are as follows");
                                System.out.println("--------------------------------------------------------------");
                                System.out.println(missinTables);
                                System.out.println("--------------------------------------------------------------");
                }
}
catch(ArithmeticException arithmeticException){
    
}
catch (Exception e)
{
e.printStackTrace();
}
finally
{
                try
                {
                                devConn.close();
                                qaConn.close();
                               
                }
                catch (SQLException e)
                {
                                e.printStackTrace();
                }
}
}
 
public static Connection getDBConnection(String driver,String dataBaseURL,String username,String password) throws ClassNotFoundException, SQLException
{
                Connection con = null;
                Class.forName(driver);
                con = (Connection) DriverManager.getConnection(dataBaseURL, username, password);
                if(con.getCatalog().equalsIgnoreCase(SUPPORT)){
                                System.out.println("Connected to Dev(Support) Server");
                }
                else if(con.getCatalog().equalsIgnoreCase(GRNHILLS)){
                                System.out.println("Connected to GrnHills(QA)");
                }
                return con;
}
               
public static void connectToDb1(String db1) throws IOException,
                SQLException, ClassNotFoundException
                {
                                prop = new Properties();
                                input = new FileInputStream("config.properties");
                                prop.load(input);
                                String driver = prop.getProperty("tool-dbdriver1");
                                String dataBaseURL = prop.getProperty("tool-dbanme1");
                                String username = prop.getProperty("tool-dbusername1");
                                String password = prop.getProperty("tool-dbpassword1");
                                devSchema = prop.getProperty("tool-schema1");
                                devConn = getDBConnection(driver, dataBaseURL, username, password);
                }
 
                public static void connectToDb2(String db2) throws IOException, ClassNotFoundException, SQLException
                {
                                prop = new Properties();
                                input = new FileInputStream("config.properties");
                                prop.load(input);
                                String driver = prop.getProperty("tool-dbdriver2");
                                String dataBaseURL = prop.getProperty("tool-dbanme2");
                                String username = prop.getProperty("tool-dbusername2");
                                String password = prop.getProperty("tool-dbpassword2");
                                qaSchema = prop.getProperty("tool-schema2");
                                qaConn = getDBConnection(driver, dataBaseURL, username, password);
                }
               
}
 