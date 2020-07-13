package case2;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private static Map<String, Subject> map = new HashMap<String, Subject>();
	
	//java.lang.String�� ����� ��İ� ������ ����̴�.
	//key���� �ʿ� ������ �߰��ϰ� ������ �����Ѵ�.
	public Subject getSubject(String key) {
		Subject subject = map.get(key);
		if (subject == null) {
			subject = new Subject(key);
			map.put(key, subject);
			
			System.out.println("���� ����  :" +key);
		}else {
			System.out.println("���� :" +key);
		}
		return subject;
	}
}
