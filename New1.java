package Grouping.TESTNG1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class New1 {
	@Test 
	public void test() {
 System.out.println("First test case ");
}
	@Test 
	public void test2() {
		 System.out.println("2nd test case ");
		}
	@Test 
	public void test3() {
		 System.out.println("group test case genrated ");
		}
	@Test 
	@Parameters("URL")
	public void test4(String url) {
		 System.out.println("4th test case ");
		 System.out.println(url);
		}

}
