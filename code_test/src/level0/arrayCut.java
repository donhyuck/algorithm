package level0;

/**
 * 문제 설명 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터
 * num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
 */
public class arrayCut {

	public static void main(String[] args) {

		arrayCut test = new arrayCut();
		int num1, num2;

		// test1
		int[] numbers1 = { 1, 2, 3, 4, 5 };
		num1 = 1;
		num2 = 3;
		int[] result1 = solution(numbers1, num1, num2);
		System.out.print("test1 :");
		for (int i : result1) {
			System.out.print(" " + i);
		}
		System.out.print("\n");

		// test1
		int[] numbers2 = { 1, 3, 5 };
		num1 = 1;
		num2 = 2;
		int[] result2 = solution(numbers2, num1, num2);
		System.out.print("test1 :");
		for (int i : result2) {
			System.out.print(" " + i);
		}
		System.out.print("\n");
	}

	public static int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = new int[num2 - num1 + 1];
		int num3 = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (i >= num1 && i <= num2) {
				answer[num3++] = numbers[i];
			}
		}
		return answer;
	}
}
