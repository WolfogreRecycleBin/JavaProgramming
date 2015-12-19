package work1;

public class Power {
	static void pow(double a, double b){
		System.out.println("第一个参数是" + a + ",它平方后是" + (a = Math.pow(a, 2)));
		System.out.println("第一个参数是" + b + ",它平方后是" + (b = Math.pow(b, 2)));
	}
	static void pow(Parameter p){
		System.out.println("第一个参数是" + p.a + ",它平方后是" + (p.a = Math.pow(p.a, 2)));
		System.out.println("第一个参数是" + p.b + ",它平方后是" + (p.b = Math.pow(p.b, 2)));
	}
}
