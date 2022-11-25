package Stack_Queue.notEqual_number;

import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) {

		Solution test = new Solution();
		int[] result;

		// 테스트 1
		int[] inputNum1 = { 1, 1, 3, 3, 0, 1, 1 };
		result = test.solution(inputNum1);
		System.out.println(result);

		// 테스트 2
		int[] inputNum2 = { 4, 4, 4, 3, 3 };
		result = test.solution(inputNum2);
		System.out.println(result);
	}

	public int[] solution(int[] arr) {

		ArrayList<Integer> arrlist = new ArrayList<>();

		int count = -1;

		for (int i = 1; i < arr.length; i++) {

			if (arr[0] != arr[1]) {
				arrlist.add(arr[0]);
				count = arr[i];
			}

			if (arr[i] != count) {
				arrlist.add(arr[i]);
				count = arr[i];
			}
		}

		int[] answer = new int[arrlist.size()];

		for (int j = 0; j < arrlist.size(); j++) {
			answer[j] = arrlist.get(j);
		}

		return answer;
	}
}
