package case1;

//B --> A
public class BtoAAdapter implements Aplayer{
	
	private Bplayer media;
	
	public BtoAAdapter(Bplayer media) {
		this.media = media;
	}

	@Override
	public void play(String fileName) {
		//A�� �޼ҵ�� B�� �޼��� ȣ��
		System.out.println("Using Adapter... :");
		media.playFile(fileName);
		
	}

	@Override
	public void stop() {
		System.out.println("Using Adapter... :");
		media.stopFile();
		
	}
	
	/*
	 * ���� �ڵ忡�� �����ؾ� �� ��°� �з��� ����� Ŭ���� ������ ���.
	 * ������ �� ���Ǵ� Ŭ�����̹Ƿ�
	 * ���װ� �߻��ϸ� ����� Ŭ������ ���������� üũ
	 * */

}
