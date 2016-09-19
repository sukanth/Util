package Practice;

import java.util.TimerTask;

public class TimerScheduleDelay extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("job running");
		StringReverse reverseString=new StringReverse();
		reverseString.main(null);
		
	}

}
