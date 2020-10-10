package Automation_CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.Assert;

public class HardAssert {
  @Test
  public void verificarTituloDePagina() {
      System.out.println( "Curso Automatizacion Selenium" );
      String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Toma el path del driver en el sistema
      System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");//Establecer la propiedd del .exe
      WebDriver driver = new ChromeDriver();//Inicializa el driver
      driver.get("https://opensource-demo.orangehrmlive.com/");//Iniciar chrome con la url especificada
      driver.manage().window().maximize();//Maximizar Ventana
      
      String actualTitle = driver.getTitle();
      String expectedTitle = "OrangeHRM";
      
     Assert.assertEquals(actualTitle, expectedTitle);
     
     driver.close();//Cierra la ventana en uso
  }
  @Test
  public void verificarTituloDePaginaBoolean() {
      System.out.println( "Curso Automatizacion Selenium" );
      String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Toma el path del driver en el sistema
      System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");//Establecer la propiedd del .exe
      WebDriver driver = new ChromeDriver();//Inicializa el driver
      driver.get("https://opensource-demo.orangehrmlive.com/");//Iniciar chrome con la url especificada
      driver.manage().window().maximize();//Maximizar Ventana
      
      String actualTitle = driver.getTitle();
      String expectedTitle = "OrangeHRM";
      
      boolean titulo = actualTitle.contains(expectedTitle);
      
     Assert.assertTrue(titulo);
     
     driver.close();//Cierra la ventana en uso
  }
}
