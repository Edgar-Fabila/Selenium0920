package Automation_CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Curso Automatizacion Selenium" );
        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Toma el path del driver en el sistema
        System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");//Establecer la propiedd del .exe
        WebDriver driver = new ChromeDriver();//Inicializa el driver
        driver.get("https://opensource-demo.orangehrmlive.com/");//Iniciar chrome con la url especificada
        driver.manage().window().maximize();//Maximizar Ventana
        
        //Obteniendo objetos/elementos de la pagina login
        WebElement txtbxUserName = driver.findElement(By.id("txtUsername"));
        WebElement txtbxPassword = driver.findElement(By.id("txtPassword"));
        WebElement btnLogin = driver.findElement(By.id("btnLogin"));
        
        //Realizar accion Login
        txtbxUserName.sendKeys("Admin");
        Thread.sleep(2000);//Espera para ver la accion no recomendable en la practia
        txtbxPassword.sendKeys("admin123");
        Thread.sleep(2000);
        btnLogin.click();
        Thread.sleep(2000);
        
//        //Validaciones Home Page
//        String urlDashboard = driver.getCurrentUrl();
//        System.out.println("URL:" + urlDashboard);
//        urlDashboard.contains("/dashboard");//Verificar que la URL contenga la palabra definida
        
        //FindElements
        List<WebElement> firstLevelMenu = driver.findElements(By.xpath("//*[@class='firstLevelMenu']/b"));
        System.out.println("Numero de elementos:" + firstLevelMenu.size());
        
        String primerMenu = firstLevelMenu.get(0).getText();
        System.out.println(primerMenu);
        String segundoMenu = firstLevelMenu.get(1).getText();
        System.out.println(segundoMenu);
        
        for (int i = 0; i<firstLevelMenu.size();i++) {
        	System.out.println("Los menu son:" + firstLevelMenu.get(i).getText());
        }
        
        
//        //Metodos de navegación
//        driver.navigate().back();
//        Thread.sleep(2000);
//        driver.navigate().forward();
//        Thread.sleep(2000);
//        driver.navigate().refresh();
//        Thread.sleep(2000);
        
//        //Obtener titulo pagina
//        driver.getTitle();
//        String title = driver.getTitle();
//        System.out.println("Title is:" + title);
        
//        //Siguientes funciones *Prfeguntar por la class
//        WebElement assignLeaveBtn = driver.findElement(By.className("quickLinkText"));
//        assignLeaveBtn.click();
//        Thread.sleep(3000);
        
//        //Obtener texto de un WebElement
//        String welcomeMsj = driver.findElement(By.id("welcome")).getText();
//        boolean verifyWelcomeMsj = welcomeMsj.contains("Smith");
//        if(verifyWelcomeMsj) {
//        	System.out.println("El mensaje contiene nombre Smith");
//        }else {
//        	System.out.println("ERROR el mensaje NO contiene el nombre esperado");
//        }
        
//        //Dropdowns seleccion de elementos lista
//        Select oSelect = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
//        oSelect.selectByVisibleText("Maternity US");
//        Thread.sleep(2000);
        
        
//        //Practica
//        //Click en menu Directory
//        WebElement mnuDirectory = driver.findElement(By.id("menu_directory_viewDirectory"));
//        mnuDirectory.click();
//        //Ingresa nombre Robert
//        WebElement txtbxName = driver.findElement(By.id("searchDirectory_emp_name_empName"));
//        txtbxName.sendKeys("Robert");
//        Thread.sleep(3000);
//        //Selecciona el puesto de la lista
//        Select fstSelect = new Select(driver.findElement(By.id("searchDirectory_job_title")));
//        fstSelect.selectByVisibleText("Sales Manager");
//        Thread.sleep(3000);
//        //Selecciona ubicacion
//        Select sndSelect = new Select(driver.findElement(By.id("searchDirectory_location")));
//        sndSelect.selectByVisibleText("  United States");
//        Thread.sleep(3000);
//        //Ubica y da click en boton Search
//        WebElement btnSearch = driver.findElement(By.id("searchBtn"));
//        btnSearch.click();
//        Thread.sleep(3000);
//        //Muestra nombre completo
//        System.out.println("User Full Name: " + driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")).getText());
//
//        
        
        //Cerrar Navegador Web
        driver.close();//Cierra la ventana en uso
        //driver.quit();//Cierra todas las ventanas desplegadas durante la ejecución
        
    }
}
