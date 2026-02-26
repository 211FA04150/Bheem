package mavenpractice;

import org.testng.annotations.Test;

public class MavenPracticeTest
{
	@Test
	public void mavenPractice()
	{
		System.out.println("Hii maven");
		String Browser = System.getProperty("browser");
		System.out.println(Browser);
	}
}
