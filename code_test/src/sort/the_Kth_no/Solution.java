package sort.the_Kth_no;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		Solution test = new Solution();

		int[] array = new int[] { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = new int[][] { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		int[] result = solution(array, commands);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}

	}

	public static int[] solution(int[] array, int[][] commands) {

		// commands크기마다 처리값이 나오므로 answer크기를 정할 수 있다.
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {

			// 첫번째값에서 두번째값자른 크기만큼의 test배열을 선언한다.
			int[] test = new int[(commands[i][1] - commands[i][0]) + 1];

			for (int j = 0; j < test.length; j++) {
				// 기존의 array배열에서 test배열로 넣는다.
				test[j] = array[j + commands[i][0] - 1];
			}

			// 새롭게 정렬된 array배열
			Arrays.sort(test);

			// array배열의 k번째수를 구한다.
			answer[i] = test[commands[i][2] - 1];
		}

		return answer;
	}
}
