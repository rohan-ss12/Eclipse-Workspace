package hdfcSec1.hdfcSec1;

import org.testng.annotations.Test;

public class StaticTestNGAnnotation {
	
	@Test
	public void getData() {
		
		String s = "₹ 20,330,090,839";
		System.out.println(s.replace("₹","").trim().replaceAll(",",""));
	}

}
