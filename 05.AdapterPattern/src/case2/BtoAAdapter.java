package case2;

/*
 * class adapter implementation
 * extedns�� implements�� ���ÿ� ����� ���� ����� �䳻������.
 * */
//B --> A
public class BtoAAdapter extends BplayerImpl implements Aplayer{
	
	//A�� �޼��� ����
	@Override
	public void play(String fileName) {
		//A�� �޼ҵ�� B�� �޼��� ȣ��
		System.out.println("Using Adapter... :");
		playFile(fileName);
		
	}

	@Override
	public void stop() {
		
	}
	

}
