package exhaustiveSearch.leastRectangle;

public class Solution {
	public static void main(String[] args) {

		Solution test = new Solution();
		int result;

		// 테스트 1
		int[][] inputNum1 = new int[][] { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
		result = test.solution(inputNum1);
		System.out.println("test1 : " + result);

		// 테스트 2
		int[][] inputNum2 = new int[][] { { 10, 7 }, { 12, 3 }, { 8, 15 }, { 14, 7 }, { 5, 15 } };
		result = test.solution(inputNum2);
		System.out.println("test2 : " + result);

		// 테스트 3
		int[][] inputNum3 = new int[][] { { 14, 4 }, { 19, 6 }, { 6, 16 }, { 18, 7 }, { 7, 11 } };
		result = test.solution(inputNum3);
		System.out.println("test3 : " + result);

	}

	public int solution(int[][] sizes) {

		int tempNum = 0;
		int max1 = sizes[0][0];
		int max2 = sizes[0][1];

		for (int i = 0; i < sizes.length; i++) {

			if (sizes[i][0] < sizes[i][1]) {
				tempNum = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = tempNum;
			}
		}

		for (int i = 0; i < sizes.length; i++) {

			if (max1 < sizes[i][0]) {
				max1 = sizes[i][0];
			}

			if (max2 < sizes[i][1]) {
				max2 = sizes[i][1];
			}
		}

		return max1 * max2;
	}
}
