package work1;

public class Power {
	static void pow(double a, double b){
		System.out.println("��һ��������" + a + ",��ƽ������" + (a = Math.pow(a, 2)));
		System.out.println("��һ��������" + b + ",��ƽ������" + (b = Math.pow(b, 2)));
	}
	static void pow(Parameter p){
		System.out.println("��һ��������" + p.a + ",��ƽ������" + (p.a = Math.pow(p.a, 2)));
		System.out.println("��һ��������" + p.b + ",��ƽ������" + (p.b = Math.pow(p.b, 2)));
	}
}
