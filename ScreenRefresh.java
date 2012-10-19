package Japplet;

import java.applet.Applet;

public class ScreenRefresh extends Applet implements Runnable{

private int period;	

Japplet master = new Japplet();
	
public ScreenRefresh(int t){
	
	period = t;	
	
}

	
	
public void test(){
	
}
	
	
	
	
	
	
public void run() {
		
	while (true){
			
	
	try {
		master.repaint();
		Thread.sleep(period);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
			
	}
		
	}

}
