package case1.step2;

public class TestPattern {

	public static void main(String[] args) {
		MyData md1 = new MyData();
		md1.xpos = 10;
		md1.ypos = 11;
		md1.name = "ȫ�浿";
		
		MyData md2 = new MyData();
		md2 = md1; //md1�� md2�� id���� ������ (������ ����)
		
		MyData md3 = new MyData();
		md3.xpos = 20;
		md3.ypos = 21;
		md3.name = "�տ���";
		
		md2.name = "����ġ"; //md2�� ���ϸ鼭 �����ϰ��մ� md1�� ��ȭ�ϰ� �ȴ�.
		md2.xpos = 5;
	}

}
class MyData {
	int xpos;
	int ypos;
	String name;
	
}