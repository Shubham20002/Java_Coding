package a01basic;

public class Arithmetic {

	public static void main(String[] args) {
		int a=10;
		int b=3;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		//modulo will give use reminder
		System.out.println(a%b);
		
		//here a and b is integer so ans calculated as integer then convert into double
		double ans=a/b;
		System.out.println(ans);

		
		double d=3.0;
		//here d is double so ans calculated as double and stored in double
		double ans1=a/d;
		System.out.println(ans1);
	}

}
