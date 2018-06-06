package tests;

import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class MainTests {
	
    WebDriver driver;
      
	// Perform the login or throw an Exception
    public void ImperiumLogin() throws Exception{
    	
    }
	
	public  void TestRole() {
		
	}
    
	public void TestCategory() {
		
	}
	
	public void TestPlaces() {
		
	}
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.imperiumpf.me");
        
        //*****************************************************************************
		//Iniciar Sessão
		//*****************************************************************************
		//driver.get( "http://127.0.0.1:8000" );
    	WebElement NavbarLogin = driver.findElement(By.partialLinkText("Iniciar Sessão"));
    	NavbarLogin.click();
    	WebElement formEmail = driver.findElement(By.id("email"));
        formEmail.sendKeys("");
        WebElement formPassword = driver.findElement(By.id("password"));
        formPassword.sendKeys("");
        WebElement Login = driver.findElement(By.id("login"));
        Login.click();
        WebElement NavbarAdminPanel = driver.findElement(By.partialLinkText("Admin Panel"));
        NavbarAdminPanel.click();
        
        //*****************************************************************************
		//Criar/Editar/Eliminar Cargo
        //*****************************************************************************
       
        Roles r = new Roles(driver);
		r.Create();
		r.Edit();
		r.Delete();

        //*****************************************************************************
  		//Criar/Editar/Eliminar Categoria
        //*****************************************************************************
  		
		Categorys c = new Categorys(driver);
		c.Create();
		c.Edit();
		c.Delete();

        //*****************************************************************************
	    //Criar/Editar/Eliminar Local
        //*****************************************************************************
		Locals l = new Locals(driver);
		l.Create();
		l.Edit();
		l.Delete();
		
        driver.quit();
		
	}
}
