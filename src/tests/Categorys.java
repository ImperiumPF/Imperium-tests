package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Categorys {
	private WebDriver driver;
	private String valueIneed;
	
	public Categorys(WebDriver driver) {
		this.driver = driver;
		WebElement category = driver.findElement(By.id("category"));
  		category.click();
        WebElement createCategory = driver.findElement(By.id("createCategory"));
        createCategory.click();
	}
	
	public void Create() {
		//*******************
        //Criar Categoria 
		WebElement formName = driver.findElement(By.id("name"));
  		formName.sendKeys("Nova Categoria");
  		WebElement formDescription = driver.findElement(By.id("description"));
        formDescription.sendKeys("Descrição da Categoria");
        WebElement submitCategory = driver.findElement(By.id("submit"));
        submitCategory.click();
        //Ver se gerou o alerta positivo para a criação do cargo
        boolean exists = driver.findElements( By.id("alertSuccess") ).size() != 0;
        System.out.println(exists);
	}
	
	public void Edit() {
		WebElement idLastRow = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div[2]/div[2]/table/tbody/tr[last()]/td[1]"));
        valueIneed = idLastRow.getText();
        System.out.println("Cell value is : " + valueIneed);
        WebElement editBotton = driver.findElement(By.id(valueIneed));
        editBotton.click();
        
        //*******************
        //Editar Categoria 
        WebElement formName = driver.findElement(By.id("name"));
  		formName.sendKeys("Nova Categoria");
  		WebElement formDescription = driver.findElement(By.id("description"));
        formDescription.sendKeys("Descrição da Categoria");
        WebElement submitCategory = driver.findElement(By.id("submit"));
        submitCategory.click();
          
        //Ver se gerou o alerta positivo para a criação do cargo
        boolean exists = driver.findElements( By.id("alertSuccess") ).size() != 0;
        System.out.println(exists);

	}
	
	public void Delete() {
		 //*******************
        //Eliminar Categoria   
        System.out.println("Cell value is : " + valueIneed);
        WebElement deleteBotton = driver.findElement(By.id("D"+valueIneed));
        deleteBotton.click();
        deleteBotton = driver.findElement(By.id("delete-btn"));
        deleteBotton.click();
        System.out.println("Done Successfully");
	}
}
