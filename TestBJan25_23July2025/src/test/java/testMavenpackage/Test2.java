package testMavenpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	@Test
	public void a() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://youtube.com");
		System.out.println("Hello New Changes");
		System.out.println("Hello new changes to new branmch-sha_branch");
		System.out.println("Hello child branch");
		System.out.println("modified code");
	}

}
/*output
[RemoteTestNG] detected TestNG version 6.14.3
[TestNGContentHandler] [WARN] It is strongly recommended to add "<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >" at the top of your file, otherwise TestNG may fail or not work as expected.
SLF4J(W): No SLF4J providers were found.
SLF4J(W): Defaulting to no-operation (NOP) logger implementation
SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.
Starting ChromeDriver 142.0.7444.175 (302067f14a4ea3f42001580e6101fa25ed343445-refs/branch-heads/7444@{#2749}) on port 2446
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully on port 2446.
Nov 28, 2025 10:32:05 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
PASSED: a

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 1, Failures: 0, Skips: 0
===============================================*/