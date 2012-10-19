package Japplet;

import java.applet.Applet;
import java.awt.*;
import java.lang.Math;
import java.awt.event.*;
import java.util.*;

public class Japplet extends Applet {



int width, height;
int i = 0;
Thread thr = null;
boolean threadSuspended;


String str = "fsdfs";
char[] ArrayAA = str.toCharArray();


int Ns = ArrayAA.length;
// Executed when the applet is first created.
public void init() {
   System.out.println("init(): begin");
   width = 800;
   height = 600;
   setBackground( Color.black );
   System.out.println("init(): end");
}











// Executed when the applet is destroyed.
public void destroy() {
   System.out.println("destroy()");
}




// Executed after the applet is created; and also whenever
// the browser returns to the page containing the applet.
public void start() {
   
	
      thr = new Thread( new ScreenRefresh(1000) );
      threadSuspended = false;
      thr.start();
   
   
   }
   








// Executed whenever the browser leaves the page containing the applet.
public void stop() {
   System.out.println("stop(): begin");
   threadSuspended = true;
   
   
}










// Executed whenever the applet is asked to redraw itself.
public void paint( Graphics g ) {
  
	for(i=0;i<Ns;i++){
		g.setColor( Color.green );
		String l = String.valueOf(ArrayAA, i, 1);
		g.drawString(l,50+(i*10),50+(i*10) );
		

	}
}
}