package work1;

public class Test {

	public static void main(String[] args) {
		double a = 12.12;
		double b = 34.56;
		System.out.println("a为" + a + ",b为" + b);
		System.out.println("调用Power.pow(double a, double b)");
		Power.pow(a, b);
		System.out.println("a为" + a + ",b为" + b);
		
		Parameter p = new Parameter(12.34,56.78);
		System.out.println("构造Parameter,成员a为" + p.a + ",成员b为" + p.b);
		System.out.println("调用Power.pow(Parameter p)");
		Power.pow(p);
		System.out.println("成员a为" + p.a + ",成员b为" + p.b);
	}

}
