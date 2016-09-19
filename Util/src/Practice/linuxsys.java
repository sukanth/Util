package Practice;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Moajep alagaleen
 * @see: 24th April 2016
 * @version:1.0
 * @see: Name of the assignment is Unit -6 Displaying the system information
 * @see: This is program is used to run linux commands , store the information
 *       and print it in the console
 * 
 *
 */
public class linuxsys {
    // main program starts here
    public static void main(String[] args) throws IOException {
	// executes all the linux commands one by one stores the out put  and prints it .	
	linuxsys obj = new linuxsys();
	String totalTimeAndIdealTime = "uptime";
	String output1 = obj.executeCommand(totalTimeAndIdealTime);
	System.out.println(
		"****** Totaltime and Idletime is ******   " + output1);
	String hostName = "hostname";
	String output2 = obj.executeCommand(hostName);
	System.out.println("****** HostName is ******  " + output2);

	File file = new File("/proc");
	File[] files = file.listFiles();
	for(File currentFile : files){
	    if(currentFile.getName().equalsIgnoreCase("version")){
		BufferedReader br = new BufferedReader(new FileReader(currentFile));
		 String line = null;
		 while ((line = br.readLine()) != null) {
		   System.out.println("****** Version Name is ******   "+line);
		 }
	    }
	    else if(currentFile.getName().equalsIgnoreCase("meminfo")){
		BufferedReader br = new BufferedReader(new FileReader(currentFile));
		 String line = null;
		 while ((line = br.readLine()) != null) {
		     System.out.println("****** Memory Information is ******   " + line);
		 }
	    }
	}
	File rtc = new File("/proc/driver/");
	File[] noOfFiles = rtc.listFiles();
	for(File currFile :noOfFiles){
	    if(currFile.getName().equalsIgnoreCase("rtc")){
		BufferedReader br = new BufferedReader(new FileReader(currFile));
		 String line = null;
		 while ((line = br.readLine()) != null) {
		     System.out.println("****** Time And Date is ******   " + line);
		 }
	    }
	}
    }

    /**
     * 
     * @param command
     * @return
     * @see: This Method takes the String command name as input executes the
     *       command on the command line and returns the output
     */
    private String executeCommand(String command) {
	StringBuffer output = new StringBuffer();
	Process p;
	try {
	    p = Runtime.getRuntime().exec(command);
	    p.waitFor();
	    BufferedReader reader = new BufferedReader(
		    new InputStreamReader(p.getInputStream()));

	    String line = "";
	    while ((line = reader.readLine()) != null) {
		output.append(line + "\n");
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return output.toString();
    }
}
