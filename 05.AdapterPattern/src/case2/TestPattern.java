package case2;

public class TestPattern {

	public static void main(String[] args) {

		//������ ����ϴ� ���
		Aplayer p1 = new AplayerImpl();
		p1.play("aaa.mp3");
		
		//���Ⱓ ����� AplayerImpl�� ����� �� ����.
		
		Bplayer p2 = new BplayerImpl();
		p2.playFile("bbb.mp3");
		

		Aplayer p3 = new BtoAAdapter();
		p3.play("ccc.mp3");
		

		
	}

}
