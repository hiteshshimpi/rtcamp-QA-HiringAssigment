package TestScript;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;



public class DriverManager  extends Keywords{
	

	static FileInputStream f1;
	static XSSFWorkbook b1;
	static XSSFSheet s1;
	static DriverManager dm;
	static ArrayList data;
static {
      try {
		f1= new FileInputStream("C:\\Users\\Hitesh\\Documents\\rtCamp.xlsx");
		b1=new XSSFWorkbook(f1);
		s1=b1.getSheetAt(0);
		data=new ArrayList();
		dm=new DriverManager();
//row iterator
		Iterator rowitr=s1.iterator();
		while(rowitr.hasNext()) {
		Row row=(Row)rowitr.next();
		//column iterator
		Iterator cellitr=row.cellIterator();
		while(cellitr.hasNext()) {
			Cell c1=(Cell)cellitr.next();
			if (c1.getCellTypeEnum()==CellType.STRING) {
			    data.add(c1.getStringCellValue());
		}
			if (c1.getCellTypeEnum()==CellType.BOOLEAN) {
			    data.add(c1.getBooleanCellValue());
		}
			if (c1.getCellTypeEnum()==CellType.NUMERIC) {
			    data.add(c1.getNumericCellValue());
		}//if	
		}//while1
		}//while2
	} catch (Exception e) {
}
}//static
@Test
public  void Test() throws Exception {
	
	for(int i =0;i<data.size();i++) {
		
		if(data.get(i).equals("OpenBrowser")) {
			String Keyword=(String) data.get(i);
			String testData=(String) data.get(i+1);
			String Objectname=(String) data.get(i+2);
			String runMode=(String) data.get(i+3);
			if(runMode.equals("yes")){
				System.out.println(Keyword +" "+testData+" "+Objectname+" "+runMode);
				dm.OpenBrowser();
			}//if
		}//if
		
		if(data.get(i).equals("Navigate")) {
			String Keyword=(String) data.get(i);
			String testData=(String) data.get(i+1);
			String Objectname=(String) data.get(i+2);
			String runMode=(String) data.get(i+3);
			if(runMode.equals("yes")){
				System.out.println(Keyword +" "+testData+" "+Objectname+" "+runMode);
				dm.Navigate(testData);
			}//if
		}//if
		
		if(data.get(i).equals("Input")) {
			String Keyword=(String) data.get(i);
			String testData=(String) data.get(i+1);
			String Objectname=(String) data.get(i+2);
			String runMode=(String) data.get(i+3);
			if(runMode.equals("yes")){
				System.out.println(Keyword +" "+testData+" "+Objectname+" "+runMode);
				dm.Input(Objectname, testData);
			}//if
		}//if
		
		if(data.get(i).equals("Click")) {
			String Keyword=(String) data.get(i);
			String testData=(String) data.get(i+1);
			 String Objectname=(String) data.get(i+2);
			String runMode=(String) data.get(i+3);
			if(runMode.equals("yes")){
				System.out.println(Keyword +" "+testData+" "+Objectname+" "+runMode);
				dm.Click(Objectname);
			}//if
		}//if
	
		if(data.get(i).equals("Select")) {
			String Keyword=(String) data.get(i);
			String testData=(String) data.get(i+1);
			 String Objectname=(String) data.get(i+2);
			String runMode=(String) data.get(i+3);
			if(runMode.equals("yes")){
				System.out.println(Keyword +" "+testData+" "+Objectname+" "+runMode);
				dm.Select(Objectname, testData);
				
			}//if
	}//if
		
		if(data.get(i).equals("Type")) {
			String Keyword=(String) data.get(i);
			String testData=(String) data.get(i+1);
			 String Objectname=(String) data.get(i+2);
			String runMode=(String) data.get(i+3);
			if(runMode.equals("yes")){
				System.out.println(Keyword +" "+testData+" "+Objectname+" "+runMode);
				dm.Type(testData,Objectname);
			}//if
		}//if

		if(data.get(i).equals("Close")) {
			String Keyword=(String) data.get(i);
			String testData=(String) data.get(i+1);
			 String Objectname=(String) data.get(i+2);
			String runMode=(String) data.get(i+3);
			if(runMode.equals("yes")){
				System.out.println(Keyword +" "+testData+" "+Objectname+" "+runMode);
				dm.Close();
			}//if
		}//if

		if(data.get(i).equals("VerifyTitle")) {
			String Keyword=(String) data.get(i);
			String testData=(String) data.get(i+1);
			 String Objectname=(String) data.get(i+2);
			String runMode=(String) data.get(i+3);
			if(runMode.equals("yes")){
				System.out.println(Keyword +"  "+testData+"  "+Objectname+"  "+runMode);
			WebElement	Actualvalue=dm.VerifyTitle(testData,Objectname);
				if(Actualvalue.isDisplayed()) {
		       	Assert.assertEquals(testData, Actualvalue.getAttribute("Title"));
		       	System.out.println("The Image Title is  "+" " +Actualvalue.getAttribute("Title"));
				
				}
				
			}//if
		}//if
		
			
		if(data.get(i).equals("Check")) {
			String Keyword=(String) data.get(i);
			String testData=(String) data.get(i+1);
			 String Objectname=(String) data.get(i+2);
			String runMode=(String) data.get(i+3);
			if(runMode.equals("yes")){
				System.out.println(Keyword +"  "+testData+"  "+Objectname+"  "+runMode);
				WebElement	Actualvalue=dm.Check(testData,Objectname);
				//if(Actualvalue.isDisplayed()) {
					System.out.println("The Text is  "+" " +Actualvalue.getText());
				
		       	Assert.assertEquals(testData, Actualvalue.getText());
				//}
		
			}//if
	
		}//if
	
	}//for
	
	
}//main

}//class

