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
		//driver.get("http://www.imperiumpf.me");
        
        //*****************************************************************************
		//Iniciar Sessão
		//*****************************************************************************
		driver.get( "http://127.0.0.1:8000" );
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
        WebElement role = driver.findElement(By.id("role"));
        role.click();
        WebElement createRole = driver.findElement(By.id("createRole"));
        createRole.click();
        
        //*******************
        //Criar o Cargo
        WebElement formName = driver.findElement(By.id("name"));
		formName.sendKeys("Novo Cargo");
        WebElement formDescription = driver.findElement(By.id("description"));
        formDescription.sendKeys("Descrição do Cargo");
        WebElement submitCategory = driver.findElement(By.id("submit"));
        submitCategory.click();
        
        //Ver se gerou o alerta positivo para a criação do cargo
        boolean exists = driver.findElements( By.id("alertSuccess") ).size() != 0;
        System.out.println(exists);
        
        //No.of Columns
        //List  col = driver.findElements(By.xpath("/html/body/div/div[1]/section[2]/div[2]/div[2]/table/thead/tr/th"));
        //System.out.println("No of cols are : " +col.size()); 
        //No.of rows 
        //List  rows = driver.findElements(By.xpath("/html/body/div/div[1]/section[2]/div[2]/div[2]/table/thead/tr/th")); 
        //System.out.println("No of rows are : " + rows.size());
        
        
        //Encontrar o id da ultima entrada da tabela
        WebElement idLastRow = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div[2]/div[2]/table/tbody/tr[last()]/td[1]"));
        String valueIneed = idLastRow.getText();
        System.out.println("Cell value is : " + valueIneed);
        WebElement editBotton = driver.findElement(By.id(valueIneed));
        editBotton.click();
        
        //*******************
        //Editar o Cargo
        formName = driver.findElement(By.id("name"));
		formName.sendKeys("Novo Cargo");
        formDescription = driver.findElement(By.id("description"));
        formDescription.sendKeys("Descrição do Cargo");
        submitCategory = driver.findElement(By.id("submit"));
        submitCategory.click();
        //Ver se gerou o alerta positivo para a edição do cargo
        exists = driver.findElements( By.id("alertSuccess") ).size() != 0;
        System.out.println(exists);
        
        //*******************
        //Eliminar Cargo
        //System.out.println("Cell value is : " + valueIneed);
        WebElement deleteBotton = driver.findElement(By.id("D"+valueIneed));
        deleteBotton.click();
        deleteBotton = driver.findElement(By.id("delete-btn"));
        deleteBotton.click();
        System.out.println("Done Successfully");
        
        
        //*****************************************************************************
  		//Criar/Editar/Eliminar Categoria
        //*****************************************************************************
  		WebElement category = driver.findElement(By.id("category"));
  		category.click();
        WebElement createCategory = driver.findElement(By.id("createCategory"));
        createCategory.click();
        
        //*******************
        //Criar Categoria 
        formName = driver.findElement(By.id("name"));
  		formName.sendKeys("Nova Categoria");
        formDescription = driver.findElement(By.id("description"));
        formDescription.sendKeys("Descrição da Categoria");
        submitCategory = driver.findElement(By.id("submit"));
        submitCategory.click();
        //Ver se gerou o alerta positivo para a criação do cargo
        exists = driver.findElements( By.id("alertSuccess") ).size() != 0;
        System.out.println(exists);
          
        idLastRow = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div[2]/div[2]/table/tbody/tr[last()]/td[1]"));
        valueIneed = idLastRow.getText();
        System.out.println("Cell value is : " + valueIneed);
        editBotton = driver.findElement(By.id(valueIneed));
        editBotton.click();
        
        //*******************
        //Editar Categoria 
        formName = driver.findElement(By.id("name"));
  		formName.sendKeys("Nova Categoria");
        formDescription = driver.findElement(By.id("description"));
        formDescription.sendKeys("Descrição da Categoria");
        submitCategory = driver.findElement(By.id("submit"));
        submitCategory.click();
          
        //Ver se gerou o alerta positivo para a criação do cargo
        exists = driver.findElements( By.id("alertSuccess") ).size() != 0;
        System.out.println(exists);
        
        //*******************
        //Eliminar Categoria   
        System.out.println("Cell value is : " + valueIneed);
        deleteBotton = driver.findElement(By.id("D"+valueIneed));
        deleteBotton.click();
        deleteBotton = driver.findElement(By.id("delete-btn"));
        deleteBotton.click();
        System.out.println("Done Successfully");
        
        //*****************************************************************************
	    //Criar/Editar/Eliminar Local
        //*****************************************************************************
		role = driver.findElement(By.id("place"));
        role.click();
        createRole = driver.findElement(By.id("createPlace"));
        createRole.click();
        
        //*******************
        //Criar Local 
        formName = driver.findElement(By.id("name"));
		formName.sendKeys("Novo Local");
        formDescription = driver.findElement(By.id("description"));
        formDescription.sendKeys("Descrição do Local");
        WebElement formPrice = driver.findElement(By.id("price"));
        formPrice.sendKeys("1");
        WebElement formSchedule = driver.findElement(By.id("schedule"));
        formSchedule.sendKeys("1");
        WebElement formVisitationTime = driver.findElement(By.id("visitationTime"));
        formVisitationTime.sendKeys("1");
        WebElement formCoordinates = driver.findElement(By.id("coordinates"));
        formCoordinates.sendKeys("123");
        WebElement formImages = driver.findElement(By.id("images"));
        formImages.sendKeys("1");
        WebElement submitLocal = driver.findElement(By.id("submit"));
        submitLocal.click();
        //Ver se gerou o alerta positivo para a criação do cargo
        exists = driver.findElements( By.id("alertSuccess") ).size() != 0;
        System.out.println(exists);
        
        idLastRow = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div[2]/div[2]/table/tbody/tr[last()]/td[1]"));
        valueIneed = idLastRow.getText();
        System.out.println("Cell value is : " + valueIneed);
        editBotton = driver.findElement(By.id(valueIneed));
        editBotton.click();
        
        //*******************
        //Editar Local 
        formName = driver.findElement(By.id("name"));
		formName.sendKeys("Nova Categoria");
        formDescription = driver.findElement(By.id("description"));
        formDescription.sendKeys("Descrição da Categoria");
        formPrice = driver.findElement(By.id("price"));
        formPrice.sendKeys("1");
        formSchedule = driver.findElement(By.id("schedule"));
        formSchedule.sendKeys("1");
        formVisitationTime = driver.findElement(By.id("visitationTime"));
        formVisitationTime.sendKeys("1");
        formCoordinates = driver.findElement(By.id("coordinates"));
        formCoordinates.sendKeys("123");
        formImages = driver.findElement(By.id("images"));
        formImages.sendKeys("1");
        submitLocal = driver.findElement(By.id("submit"));
        submitLocal.click();
        
        //Ver se gerou o alerta positivo para a criação do cargo
        exists = driver.findElements( By.id("alertSuccess") ).size() != 0;
        System.out.println(exists);
        
        //*******************
        //Eliminar Local 
        System.out.println("Cell value is : " + valueIneed);
        deleteBotton = driver.findElement(By.id("D"+valueIneed));
        deleteBotton.click();
        deleteBotton = driver.findElement(By.id("delete-btn"));
        deleteBotton.click();
        System.out.println("Done Successfully");
        
        driver.quit();
		
	}
}
