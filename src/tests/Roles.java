package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Roles {
	private WebDriver driver;
	private String valueIneed;
	
	public Roles(WebDriver driver) {
		this.driver = driver;
		WebElement role = driver.findElement(By.id("role"));
        role.click();
        WebElement createRole = driver.findElement(By.id("createRole"));
        createRole.click();     
	}
	
	public void Create() {
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
	}
	
	public void Edit() {
		//Encontrar o id da ultima entrada da tabela
        WebElement idLastRow = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div[2]/div[2]/table/tbody/tr[last()]/td[1]"));
        valueIneed = idLastRow.getText();
        System.out.println("Cell value is : " + valueIneed);
        WebElement editBotton = driver.findElement(By.id(valueIneed));
        editBotton.click();
        //*******************
        //Editar o Cargo
        WebElement formName = driver.findElement(By.id("name"));
		formName.sendKeys("Novo Cargo");
		WebElement formDescription = driver.findElement(By.id("description"));
        formDescription.sendKeys("Descrição do Cargo");
        WebElement submitCategory = driver.findElement(By.id("submit"));
        submitCategory.click();
        //Ver se gerou o alerta positivo para a edição do cargo
        boolean exists = driver.findElements( By.id("alertSuccess") ).size() != 0;
        System.out.println(exists);
        
	}
	
	public void Delete() {
		//*******************
        //Eliminar Cargo
        System.out.println("Cell value is : " + valueIneed);
        WebElement deleteBotton = driver.findElement(By.id("D"+valueIneed));
        deleteBotton.click();
        deleteBotton = driver.findElement(By.id("delete-btn"));
        deleteBotton.click();
        System.out.println("Done Successfully");
	}
}
