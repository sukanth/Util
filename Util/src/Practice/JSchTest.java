package Practice;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class JSchTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	        JSch jsch = new JSch();
	       // JSch.setLogger(new MyLogger());

	        try {
	            jsch.addIdentity("/Users/sukanthgunda/.ssh/id_rsa");
	        } catch (JSchException e) {
	            e.printStackTrace();
	            System.exit(1);
	        }

	        Session session = null;
	        try {
	            session = jsch.getSession("root", "66.118.164.210");
	        } catch (JSchException e) {
	            e.printStackTrace();
	            System.exit(1);
	        }

	       // Properties properties = new Properties();
	        //properties.put("StrictHostKeyChecking", "no");
	        session.setConfig("StrictHostKeyChecking", "no");

	        try {
	            session.connect();
	            System.out.println("Connected!");
	        } catch (JSchException e) {
	            e.printStackTrace();
	            System.exit(1);
	        }

	        System.exit(0);
	    }
    }

