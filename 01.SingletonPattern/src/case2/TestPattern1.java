package case2;

public class TestPattern1 {

	public static void main(String[] args) {
		
		LogWriter logger;
		
		logger = LogWriter.getInstance();
		logger.log("�丶��");
		
		logger = LogWriter.getInstance();
		logger.log("���");

	}

}
