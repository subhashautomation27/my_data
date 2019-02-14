package com.pack.sikuli;



import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.BaseTestClass;
import com.utils.TestUtils;

public class YoutubeVideoSikuliTest  extends BaseTestClass{
	public static BaseTestClass basetest;
	
	@Test
	public static void youtubeTest() throws InterruptedException, FindFailed
	{    
		 basetest=new BaseTestClass();
		 basetest.intiailaztion();
		 driver.get("https://www.youtube.com/watch?v=5xSBfcw4ZVg");
			String title= driver.getTitle();
			System.out.println("freecrm title---->" + title);
			
			
			
			
			
			
			Screen sc1=new Screen();
			Pattern p1=new Pattern("E:\\PracticeWorkspace\\MyAllMvnProj\\images\\YT_Pause.png");
			sc1.wait(p1,3000);
			sc1.click();
			
			Screen sc2=new Screen();
			Pattern p2=new Pattern("E:\\PracticeWorkspace\\MyAllMvnProj\\images\\YT_Play.png");
			sc2.wait(p2,3000);
			sc2.click();
			
			Screen sc=new Screen();
			Pattern p=new Pattern("E:\\PracticeWorkspace\\MyAllMvnProj\\images\\YT_Maximize.png");
			sc.wait(p,3000);
			sc.doubleClick();
			
			
			try {
				TestUtils.takeScreenShot("hello");
			} catch (IOException e) {
				e.printStackTrace();
			}
			

	
	

}}
