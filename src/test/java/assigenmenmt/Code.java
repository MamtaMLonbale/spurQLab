package assigenmenmt;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Code {
		
		
		@FindBy(xpath="//span[contains(text(),'4')]")  
		public WebElement b4;
		
		@FindBy(xpath="//span[contains(text(),'2')]")
		public WebElement b2;
		
		@FindBy(xpath="//span[contains(text(),'3')]")
		public WebElement b3;
		
		@FindBy(xpath="//span[contains(text(),'5')]")  
		public WebElement b5;
		
		@FindBy(xpath="//span[contains(text(),'8')]")
		public WebElement b8;
		
		@FindBy(xpath="//span[contains(text(),'9')]")
		public WebElement b9;
		
		@FindBy(xpath="//span[contains(text(),'0')]")
		public WebElement b0;
		
		@FindBy(xpath="//span[contains(text(),'=')]")
		public WebElement equal;
		
		@FindBy(xpath="//span[contains(text(),'×')]")
		public WebElement multy;
		
		@FindBy(xpath="//span[contains(text(),'/')]")
		public WebElement div;
		
		@FindBy(xpath="//span[contains(text(),'+')]")
		public WebElement add;
		
		@FindBy(xpath="//span[contains(text(),'–')]")
		public WebElement sub;
		
		
		@FindBy(xpath="//div[@id='sciOutPut']")
		public WebElement output;
		
		
		
		public Code (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		public void four()
		{
			b4.click();
		}
		
		public void two()
		{
			b2.click();
		}
		public void three()
		{
			b3.click();
		}
		
		public void five()
		{
			b5.click();
		}
		
		public void eight()
		{
			b8.click();
		}
		
		public void nine()
		{
			b9.click();
		}
		
		
		public void zero()
		{
			b0.click();
		}
		
		public void Equal()
		{
			equal.click();
		}
		
		public void Output()
		{
			output.getText();
		}
		
		
		public void Division()
		{
			div.click();
		}
		
		public void Multiplication()
		{
			multy.click();
		}
		
		public void Addition()
		{
			add.click();
		}
		
		public void Substraction()
		{
			sub.click();
		}

}
