package testes;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignTestes {
    @Test
    public void testRealizarLogin(){
        // Setando as propriedas, informando a localização do arquivo Chrome WebDriver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\amendonp\\OneDrive - everis\\Escritorio\\drivers\\chromedriver.exe");
        // Abre uma nova instância
        WebDriver navegador = new ChromeDriver();
        // Maximiza a tela do navegador
        navegador.manage().window().maximize();
        // Informa ao navegador para aguardar alguns segundos
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Acessa a seguinte URL
        navegador.get("http://www.juliodelima.com.br/taskit");
        // Procura pelo modal de Login
        navegador.findElement(By.linkText("Sign in")).click();
        // Dentro do modal insere o nome do usuário
        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys("aderbal");
        // Dentro do modal insere a senha
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys("1234");
        // Clica em Login
        navegador.findElement(By.linkText("SIGN IN")).click();
        // Quando logado, confirmo o nome apresentado no header
        String nome = navegador.findElement(By.className("me")).getText();
        Assert.assertEquals("Hi, noemi", nome);
        // Fecho o navegador
        navegador.close();
    }
}
