package work2;

public class Test {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		MyClass class1 = new MyClass();
		MyClass class2 = new MyClass();
		System.out.println("ͨ����һ������x��Ϊ100,,��y��Ϊ200");
		class1.setX(100);
		class1.setY(200);
		System.out.println("ͨ���ڶ�������Ļ��xΪ" + class2.getX() + " ,���yΪ" + class2.getY());
	}

}
