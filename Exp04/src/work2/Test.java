package work2;

public class Test {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		MyClass class1 = new MyClass();
		MyClass class2 = new MyClass();
		System.out.println("通过第一个对象将x设为100,,将y设为200");
		class1.setX(100);
		class1.setY(200);
		System.out.println("通过第二个对象的获得x为" + class2.getX() + " ,获得y为" + class2.getY());
	}

}
