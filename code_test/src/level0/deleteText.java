package level0;

/**
 * 문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서 letter를 제거한 문자열을 return하도록
 * solution 함수를 완성해주세요.
 */
public class deleteText {

	public static void main(String[] args) {

		deleteText test = new deleteText();
		String my_string, letter, result;

		// test1
		my_string = "abcdef";
		letter = "f";
		result = solution(my_string, letter);
		System.out.println("test1 :" + result);

		// test2
		my_string = "BCBdbe";
		letter = "B";
		result = solution(my_string, letter);
		System.out.println("test2 :" + result);
	}

	public static String solution(String my_string, String letter) {
		String answer = "";

		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) != letter.charAt(0)) {
				answer += my_string.charAt(i);
			}
		}
		return answer;
	}

	// 다른 풀이
//	public static String solution(String my_string, String letter) {
//        String answer = "";
//        
//		answer = my_string.replace(letter, "");
//        return answer;
//    }
}
