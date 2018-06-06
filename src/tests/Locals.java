package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locals {
	
	private WebDriver driver;
	private String valueIneed;
	
	public Locals(WebDriver driver) {
		this.driver = driver;
		WebElement role = driver.findElement(By.id("place"));
        role.click();
        WebElement createRole = driver.findElement(By.id("createPlace"));
        createRole.click();
        
	}
	
	public void Create() {
        //*******************
        //Criar Local 
		WebElement formName = driver.findElement(By.id("name"));
		formName.sendKeys("Novo Local");
		WebElement formDescription = driver.findElement(By.id("description"));
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
        formImages.sendKeys("E:\\GitHub\\laravel-api\\public\\assets\\images\\convento.jpg");
        WebElement submitLocal = driver.findElement(By.id("submit"));
        submitLocal.click();
        //Ver se gerou o alerta positivo para a criação do local
        boolean exists = driver.findElements( By.id("alertSuccess") ).size() != 0;
        System.out.println(exists);
	}
	
	public void Edit() {
		//selecionar o botao editar
		WebElement idLastRow = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div[2]/div[2]/table/tbody/tr[last()]/td[1]"));
        valueIneed = idLastRow.getText();
        System.out.println("Cell value is : " + valueIneed);
        WebElement editBotton = driver.findElement(By.id(valueIneed));
        editBotton.click();
        //*******************
        //Editar Local 
		WebElement formName = driver.findElement(By.id("name"));
		formName.sendKeys("Nova Categoria");
		WebElement formDescription = driver.findElement(By.id("description"));
        formDescription.sendKeys("Descrição da Categoria");
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
        //Ver se gerou o alerta positivo para a edição do local
        boolean exists = driver.findElements( By.id("alertSuccess") ).size() != 0;
        System.out.println(exists);       
	}
	
	public void Delete() {

        //*******************
        //Eliminar Local 
        System.out.println("Cell value is : " + valueIneed);
        WebElement deleteBotton = driver.findElement(By.id("D"+valueIneed));
        deleteBotton.click();
        deleteBotton = driver.findElement(By.id("delete-btn"));
        deleteBotton.click();
        System.out.println("Done Successfully");
        
	}

}
