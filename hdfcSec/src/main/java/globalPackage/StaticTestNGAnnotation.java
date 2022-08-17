package globalPackage;

import org.testng.annotations.Test;

public class StaticTestNGAnnotation {
	
	@Test
	public void getData(){
		
		String s1 = "? 22,250,000";
		System.out.println(s1.replace("?","").trim().replaceAll(",",""));
	}

}
