import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Moajep alagaleen
 * @see: 28th April 2016
 * @version:1.0
 * @see: Name of the assignment is Unit -7 System Time Calculation
 * @see: The objective of this assignment is to get used to the system time
 *       information in Linux. You will do that by writing a small program (in
 *       either C, C++ or Java) that will access system time information
 *       available from the Linux /proc/uptime directory.
 */
public class linuxtime {
    // main program starts here
    public static void main(String[] args) throws IOException {
	String totalTimeAndIdealTime = null;
	String totalTimeAndIdealEndTime = null;
	linuxtime obj = new linuxtime();
	File file1 = new File("/proc");
	File[] files1 = file1.listFiles();
	for (File currentFile : files1) {
	    if (currentFile.getName().equalsIgnoreCase("uptime")) {
		BufferedReader br = new BufferedReader(new FileReader(currentFile));
		totalTimeAndIdealTime = br.readLine();
	    }
	}
	String[] splited = totalTimeAndIdealTime.trim().split(" ");
	String beginTotaltime = splited[0];
	String beginIdletime = splited[1];
	work();
	File file2 = new File("/proc");
	File[] files2 = file2.listFiles();
	for (File currentFile : files1) {
	    if (currentFile.getName().equalsIgnoreCase("uptime")) {
		BufferedReader br = new BufferedReader(new FileReader(currentFile));
		totalTimeAndIdealEndTime = br.readLine();
	    }
	}
	String[] splitted1 = totalTimeAndIdealEndTime.trim().split(" ");
	String endTotaltime = splitted1[0];
	String endIdletime = splited[1];
	double programTotalTime = Double.parseDouble(endTotaltime) - Double.parseDouble(beginTotaltime);
	double programIdleTime = Double.parseDouble(endIdletime) - Double.parseDouble(beginIdletime);
	double programWorkTime = programTotalTime - programIdleTime;
	double percentage = (programWorkTime / programTotalTime)* 100;
	System.out.println("CPU was busy in time Percentage is "+ percentage + " %");
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

    /**
     * 
     */
    private static void work() {
	double y = 0;
	double x = 3.0;
	double e = 2.0;
	int i, j;
	for (i = 0; i < 5; i++) {
	    for (j = 0; j < 400000; j++) {
		y = Math.pow(x, e);
	    }
	    // pausing for one second between loops so that the work cycle takes
	    // a little time.
	    try {
		Thread.sleep(1000);
	    } catch (InterruptedException e1) {
		e1.printStackTrace();
	    }
	}

    }
}
