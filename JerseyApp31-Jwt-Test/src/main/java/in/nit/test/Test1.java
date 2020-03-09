package in.nit.test;

import java.util.concurrent.TimeUnit;

public class Test1 {
	public static void main(String[] args) {
		
	
//min-sec
	long a=TimeUnit.MINUTES.toSeconds(2);
	System.out.println(a);
	
	//days-hrs
	long b=TimeUnit.DAYS.toHours(2);
	System.out.println(b);
	
	//days-min
	long c=TimeUnit.DAYS.toMillis(1);
	System.out.println(c);
}
}
