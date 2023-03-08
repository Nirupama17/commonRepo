package ParentGorup.ExtendReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportDemo {
	ExtentReports extend;

	@BeforeTest
	public void config() {

		String Path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(Path);
		reporter.config().setReportName("Web Automation Result");
		reporter.config().setDocumentTitle("Test Results");

		extend = new ExtentReports();
		extend.attachReporter(reporter);
		extend.setSystemInfo("Tester", "Nirupama Desai");

	}

	@Test
	public void initialDemo() {

		ExtentTest Test = extend.createTest("InitialDemo");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nirupama\\Downloads\\chromedriver_win32_109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		Test.fail("Result not match");
		extend.flush();

	}

	@Test
	public void initialDemo1() {

		ExtentTest Test = extend.createTest("InitialDemo");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nirupama\\Downloads\\chromedriver_win32_109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());

		extend.flush();

	}

}
