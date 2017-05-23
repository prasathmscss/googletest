package googletest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class sample {
	public WebDriver wb;
	@Test
	public void webload(){
	wb=new FirefoxDriver();
	wb.manage().window().maximize();
	wb.get("https://www.google.co.in/?gws_rd=ssl");
		
	}
	@AfterMethod
	public void teardown() throws IOException
	{
		File src =((TakesScreenshot)wb).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\WORKSPACE\\googlebdd-test\\src\\Output\\google.png"));
	}

}
