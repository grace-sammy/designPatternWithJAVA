package case1;

public class TestPattern {

	public static void main(String[] args) {

		Aplayer p1 = new AplayerImpl();
		p1.play("aaa.mp3");
		
		//���Ⱓ ����� AplayerImpl�� ����� �� ����.
		
		//Bplayer : ���� ���Ե� ��� (�� ������ ���̴�.)
		Bplayer p2 = new BplayerImpl();
		p2.playFile("bbb.mp3");
		
		/*
		 * Aplayer obj = (�����) = new BplayerImpl();
		 * ������ �� �����ϴ� �ڵ�� ���� ���Ե� �ڵ带 ������� ����ϰ� ���� ���̴�.
		 * ����� ���� �� ������ ���ٸ� ����� �κи� Ȯ���ϸ� �ȴ�.
		 * */
		p1 = new BtoAAdapter(new BplayerImpl());
		p1.play("ccc.mp3");
		
		/*
		 * ���� ��� �ڵ尡 Aplayer�������̽��� ���缭 �ڵ��Ǿ� �ִ�.
		 * �׷��Ƿ� ���⼭ Aplayer�� ���ԵǴ� ��ü�� �������ָ�
		 * Aplayer�������̽��� ���Ǵ� �κп����� ������ �ʿ䰡 ����.
		 * */
		
	}

}
