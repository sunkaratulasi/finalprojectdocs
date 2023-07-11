package Firstproproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("https://itera-qa.azurewebsites.net/home/automation");
		//1) select specific check box
		//dr.findElement(By.xpath("//input[@id='monday']")).click();
		//select all the check boxes
		List<WebElement>checkboxes=dr.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println("Total No of check boxes:"+checkboxes.size());
		//using for loop
		for(int i=0;i<checkboxes.size();i++)	
		{
			checkboxes.get(i).click();
		}
	}
	

}
 