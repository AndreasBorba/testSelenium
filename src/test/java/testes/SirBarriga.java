package testes;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SirBarriga {

    private WebDriver navegador;

    @Before
    public void configSelenium(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\amendonp\\OneDrive - everis\\Escritorio\\drivers\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void realizarCadastro(){

        navegador.get("http://srbarriga.herokuapp.com/cadastro");
        navegador.findElement(By.xpath("//*[@id=\'nome\']")).sendKeys("aderbal");
        navegador.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("aderbal@teste.com");
        navegador.findElement(By.xpath("//*[@id=\'senha\']")).sendKeys("1234");
        navegador.findElement(By.xpath("/html/body/div[2]/form/input")).click();
    }
}
