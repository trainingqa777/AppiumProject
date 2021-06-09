package functions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Calculator extends Base {
	//POM
	WebElement seven() {
		return driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
	}
	
	WebElement plusButton() {
		return driver.findElement(By.id("com.google.android.calculator:id/op_add"));
	}
	
	WebElement resultArea() {
		return driver.findElement(By.id("com.google.android.calculator:id/result_preview"));
	}
	
	public void addition() {
		try {
			Repo repo = new Repo("build.properties");
			InitilizeAndOpenAppliction(repo.getValue("ApplocationCalculator"));
			System.out.println("Calculator app Opend.");
			
			seven().click();
			plusButton().click();
			seven().click();
			
			String sum = resultArea().getText();
			System.out.println("The result from result Area is : "+sum);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.addition();	
	}
	

}
