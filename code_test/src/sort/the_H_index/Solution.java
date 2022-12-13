package sort.the_H_index;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {

		Solution test = new Solution();
		int[] array = new int[] { 3, 0, 6, 1, 5 };
		int result = test.solution(array);

		System.out.println(result);
	}

	public int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);

		for (int i = 0; i < citations.length; i++) {
			int h_index = citations.length - i;

			if (citations[i] >= h_index) {
				answer = h_index;
				break;
			}

		}
		return answer;
	}
}