package InterviewSampleCode;

import java.util.Optional;

public class OptionalClasss {

	public static void main(String[] args) {
		String[] str = new String[10];

		UsingNornalJavaNegativeScenario(str);
		System.out.println("----------------------------");
		UsingNornalJava(str);
		System.out.println("----------------------------");
		Usingajava8(str);
	}

	public static void UsingNornalJavaNegativeScenario(String[] str) {
		//str[5] = "Rajesh";
		try {
			String lower = str[5].toLowerCase();
			System.out.println(lower);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void UsingNornalJava(String[] str) {
		//str[5] = "Rajesh";
		Optional<String> opt = Optional.ofNullable(str[5]);

		if (opt.isPresent()) {
			System.out.println("Available");
		} else {
			System.out.println("Not Availabe");
		}
	}

	public static void Usingajava8(String[] str) {
		//str[5] = "Rajesh";
		Optional<String> opt = Optional.ofNullable(str[5]);

		opt.ifPresentOrElse(v -> System.out.println("Available"), () -> System.out.println("Not Availabe"));
	}
}