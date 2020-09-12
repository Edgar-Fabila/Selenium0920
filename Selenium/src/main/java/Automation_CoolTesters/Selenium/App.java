package Automation_CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Curso Automatizacion Selenium" );
        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Toma el path del driver en el sistema
        System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");//Establecer la propiedd del .exe
        WebDriver driver = new ChromeDriver();//Inicializa el driver
        driver.get("https://www.cooltesters.com");//Iniciar chrome con la url especificada
    }
}
