package Grouping.TESTNG1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class New3 {
	@Test
	public void group1() {
		System.out.println("new3  class does not have  group1 implemention ");
		}
			
	@Test
	@Parameters("URL")
			public void group2(String url) {
				System.out.println("new3 class has  group1 implemention ");
				System.out.println(url);
				}

}
