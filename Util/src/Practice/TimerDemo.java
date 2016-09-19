package Practice;

import java.util.*;


public class TimerDemo {
	   public static void main(String[] args) {
	      // creating timer task, timer
	      TimerTask tasknew = new TimerScheduleDelay();
	      Timer timer = new Timer();
	      
	      // scheduling the task at interval
	      timer.schedule(tasknew, 6000); 
	   } 
	}