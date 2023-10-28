package InterviewSampleCode;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class pojoObjectCheck {

	private String value;
	private Integer length;

	public static void main(String[] args) {

		Map<pojoObjectCheck, Integer> map = new HashMap<>();
		pojoObjectCheck obj = new pojoObjectCheck();

		obj.setValue("abcd");
		obj.setLength(20);
		
		map.put(obj, 1);
		
		Integer result = map.get(obj);
		System.out.println(result);
	}
}