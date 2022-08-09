package test;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import assigenmenmt.*;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Calculator{
		
	    public WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
		public void setup()
		{
			WebDriverManager.chromedriver().driverVersion("103").setup();
		   // System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.calculator.net/");
			
		}
		
	@Test(priority=1)
	    public void multiply() throws InterruptedException
	    {
		    Code cd= new Code(driver);
		    cd.four();
		    cd.two();
		    cd.three();
		    cd.Multiplication();
		    cd.five();
		    cd.two();
		    cd.five();
		    cd.Output();
	      Thread.sleep(5000);	   
	    }

	@Test(priority=2)
	public void Division() throws InterruptedException
	   {
		 Code cd= new Code(driver);
		 cd.four();
		 cd.zero();
		 cd.zero();
		 cd.zero();
		 cd.Division();
		 cd.two();
		 cd.zero();
		 cd.zero();
		 cd.Output();
		 Thread.sleep(5000);
	   }

	@Test(priority=3)
	public void Addition() throws InterruptedException
	{
		 Code cd= new Code(driver);
		 cd.Substraction();
		 cd.two();
		 cd.three();
		 cd.four();
		 cd.two();
		 cd.three();
		 cd.four();
		 cd.Addition();
		 cd.three();
		 cd.four();
		 cd.five();
		 cd.three();
		 cd.four();
		 cd.five();
		 cd.Output();
		 Thread.sleep(5000);
	}

	@Test(priority=4)
	public void Substraction() throws InterruptedException
	{
		 Code cd= new Code(driver);
		 cd.two();
		 cd.three();
		 cd.four();
		 cd.eight();
		 cd.two();
		 cd.three();
		 cd.Addition();
		 cd.two();
		 cd.three();
		 cd.zero();
		 cd.nine();
		 cd.four();
		 cd.eight();
		 cd.two();
		 cd.three();
		 cd.Output();
		 Thread.sleep(5000);
	}

}
