package Firstproproject;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class specificheckbox {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("http://www.google.com");
		//dr.findElement(By.id("APjFqb")).sendKeys("amdocs");
		//dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
     dr.get("http://localhost:8080");
     Thread.sleep(2000);
     dr.findElement(By.id("j_username")).sendKeys("admin");
     dr.findElement(By.name("j_password")).sendKeys("a4b25f856059493cac2d3a12fc555da2");
     Thread.sleep(2000);
     dr.findElement(By.xpath("/html/body/div/div/form/div[4]/button")).click();
	}



	}



