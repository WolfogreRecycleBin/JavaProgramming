package work1;

public class Test {

	public static void main(String[] args) {
		double a = 12.12;
		double b = 34.56;
		System.out.println("aΪ" + a + ",bΪ" + b);
		System.out.println("����Power.pow(double a, double b)");
		Power.pow(a, b);
		System.out.println("aΪ" + a + ",bΪ" + b);
		
		Parameter p = new Parameter(12.34,56.78);
		System.out.println("����Parameter,��ԱaΪ" + p.a + ",��ԱbΪ" + p.b);
		System.out.println("����Power.pow(Parameter p)");
		Power.pow(p);
		System.out.println("��ԱaΪ" + p.a + ",��ԱbΪ" + p.b);
	}

}
