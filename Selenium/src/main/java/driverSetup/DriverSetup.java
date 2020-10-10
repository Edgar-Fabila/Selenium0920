package driverSetup;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	
	public static WebDriver setupDriver () {
		
    String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Toma el path del driver en el sistema
    System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");//Establecer la propiedd del .exe
    WebDriver driver = new ChromeDriver();//Inicializa el driver
    return driver;
    
	}
}
