package Practice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class emailExtractor {
    public static List<String> emails = null;
    public static List<String> names = null;
	public static void main(String[] args) {

		BufferedReader br = null;
		FileWriter fileWriter = null;

		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader("/Users/sukanthgunda/Downloads/0210-0000050.txt"));
			emails = new ArrayList<String>();
			names = new ArrayList<String>();
			fileWriter = new FileWriter("/Users/sukanthgunda/Downloads/1.txt");
			while ((sCurrentLine = br.readLine()) != null) {
				//System.out.println(sCurrentLine);
				int index = sCurrentLine.indexOf("@");
				String data =  sCurrentLine.substring(0, sCurrentLine.indexOf(",",index));				
				String name = data.substring(0, data.lastIndexOf(","));
				fileWriter.append(name);
				
				fileWriter.append(data.substring(data.lastIndexOf(",")+1));
				fileWriter.append("\n");				
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
				fileWriter.flush();
				fileWriter.close();

			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}