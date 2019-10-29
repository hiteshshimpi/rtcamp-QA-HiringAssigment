package TestScript;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class Keywords {
	static ChromeDriver driver;
	static Properties prop;
	static FileInputStream file;
	static Robot robot;
	static Select select;
	  
	public void OpenBrowser() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hitesh\\Desktop\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		prop=new Properties();
		file= new FileInputStream("C:\\Users\\Hitesh\\Eworkspace\\RtCamp\\src\\ObjectRepository\\Objectrfepository.properties");
		prop.load(file);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		

	}
	public void Navigate(String testData) {
	
		driver.get(testData);
		
		
	}
	public void Close() {

		driver.close();
	}
	
	public void Input( String Objectname,String testData) {
	
		driver.findElement(By.xpath(prop.getProperty(Objectname))).sendKeys(testData);
		
	}
	public void Click(String Objectname) throws Exception {
		
		driver.findElement(By.xpath(prop.getProperty(Objectname))).click();
		Thread.sleep(5000);
	}
	public void Select(String Objectname,String testData) throws Exception {
		
		WebElement web=driver.findElement(By.xpath(prop.getProperty(Objectname)));
		select=new Select(web);
		Thread.sleep(2000);
		select.selectByIndex(0);
		java.util.List<WebElement> dropdownvalue= select.getOptions();
		if(dropdownvalue.get(0).getText().equalsIgnoreCase("Private")) {
			System.out.println("The Privacy is Set to"+dropdownvalue.get(0).getText());
	       	
		
		}
			
}
	public void Type( String testData ,String objectname)  throws Exception {
		
	if(testData.equals("Image1")) {
		Thread.sleep(5000);
		 robot =new Robot();   
	StringSelection str = new StringSelection("C:\\Users\\Hitesh\\12.png");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.setAutoDelay(2000);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		}
	if(testData.equals("Image2")) {
		Thread.sleep(5000);
		 robot =new Robot();   
	StringSelection str = new StringSelection("C:\\Users\\Hitesh\\123.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.setAutoDelay(2000);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		}
	if(testData.equals("Image3")) {
		
		Thread.sleep(5000);
		 robot =new Robot();   
	StringSelection str = new StringSelection("C:\\Users\\Hitesh\\1234.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.setAutoDelay(2000);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		}
	if(testData.equals("Image4")) {
		Thread.sleep(5000);
		 robot =new Robot();   
	StringSelection str = new StringSelection("C:\\Users\\Hitesh\\12345.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.setAutoDelay(2000);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		}
	if(testData.equals("Image5")) {
		Thread.sleep(5000);
		 robot =new Robot();   
	StringSelection str = new StringSelection("C:\\Users\\Hitesh\\LikedImage.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.setAutoDelay(2000);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);	
		}
	if(testData.equals("Image6")) {
		Thread.sleep(5000);
		 robot =new Robot();   
	StringSelection str = new StringSelection("C:\\Users\\Hitesh\\1234567.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.setAutoDelay(2000);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);	
		}
	}
	
	public WebElement VerifyTitle( String testData ,String Objectname)  throws Exception{
		WebElement Actualvalue =driver.findElement(By.xpath(prop.getProperty(Objectname)));
	return Actualvalue;	
}

public WebElement Check(String testData ,String Objectname) {
	
	WebElement Actualvalue =driver.findElement(By.xpath(prop.getProperty(Objectname)));
	return Actualvalue;
}

}
