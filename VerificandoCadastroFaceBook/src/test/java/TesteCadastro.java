//Importação  dos pacotes do selenium e chromedriver
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Criei a classe TesteCadastro
public class TesteCadastro{


    public static  void main(String[] args) {
        //Local onde encontro o caminho que o chromeDrive esta armazenado.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIOGO\\Documents\\ACCENTURE\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Para maximinizar a página do google ghrome após aberto.
        driver.manage().window().maximize();

        //Para abrir no navegar google chrome www.facebook.com.br
        driver.get("https://www.facebook.com/r.php");


        //Para preencher campo de cadastro do FaceBook com nome,sobrenome, e-mail, confirmação de e-mail e senha.
        driver.findElement(By.name("firstname")).sendKeys("diogo menezes");
        driver.findElement(By.name("lastname")).sendKeys("de lima");
        driver.findElement(By.name("reg_email__")).sendKeys("diogo_ddd@hotmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("diogo_ddd@hotmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("123axuaxuaxuaaaa");



    }
}
