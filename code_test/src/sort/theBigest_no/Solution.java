package sort.theBigest_no;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {

		Solution test = new Solution();
		int[] numbers;
		String result;

		// 테스트 1
		numbers = new int[] { 6, 10, 2 };
		result = test.solution(numbers);
		System.out.println("test1 : " + result);

		// 테스트 2
		numbers = new int[] { 3, 30, 34, 5, 9 };
		result = test.solution(numbers);
		System.out.println("test2 : " + result);

	}

	public String solution(int[] numbers) {

		String answer = "";
		String[] arr = new String[numbers.length];

		// 문자열로 배열에 담기
		for (int i = 0; i < numbers.length; i++) {
			arr[i] = String.format("%s", numbers[i]);
		}

		// 비교
		Arrays.sort(arr, (s1, s2) -> ((s2 + s1).compareTo(s1 + s2)));

		if (Integer.parseInt(arr[0]) == 0) {
			return "0";
		}

		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}

		return answer;
	}
}
