package handling_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Auto_It_Example extends BaseClass{

public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	
	driver.get("http://localhost/login.do");
    Thread.sleep(3000);	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_CONTROL);
	
	Runtime run = Runtime.getRuntime();
	run.exec("C:\\Program Files (x86)\\AutoIt3\\SciTE\\..\\aut2exe\\aut2exe.exe");
	driver.close();
}
}
