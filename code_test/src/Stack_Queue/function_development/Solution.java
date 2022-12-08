package Stack_Queue.function_development;

public class Solution {
	public static void main(String[] args) {

		Solution test = new Solution();
		int[] result;

		// 테스트 1
		int[] inputProgresses1 = new int[] { 93, 30, 55 };
		int[] inputSpeeds1 = new int[] { 1, 30, 5 };
		result = test.solution(inputProgresses1, inputSpeeds1);

		for (int i = 0; i < result.length; i++) {
			System.out.print("result1 : " + result[i]);
		}

		System.out.println();

		// 테스트 2
		int[] inputProgresses2 = new int[] { 95, 90, 99, 99, 80, 99 };
		int[] inputSpeeds2 = new int[] { 1, 1, 1, 1, 1, 1 };
		result = test.solution(inputProgresses2, inputSpeeds2);

		for (int i = 0; i < result.length; i++) {
			System.out.print("result2 : " + result[i]);
		}
	}

	public int[] solution(int[] progresses, int[] speeds) {
		int[] answer = { 2 };
		return answer;
	}
}
