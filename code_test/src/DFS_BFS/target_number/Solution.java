package DFS_BFS.target_number;

public class Solution {
	public static void main(String[] args) {

		Solution test = new Solution();
		int[] numbers;
		int target;
		int result;

		// 테스트1
		numbers = new int[] { 1, 1, 1, 1, 1 };
		target = 3;
		result = test.solution(numbers, target);
		System.out.println("Test 1 : " + result);

		// 테스트2
		numbers = new int[] { 4, 1, 2, 1 };
		target = 4;
		result = test.solution(numbers, target);
		System.out.println("Test 2 : " + result);
	}

	public int solution(int[] numbers, int target) {

		int answer = dfs(numbers, 0, target, 0);

		return answer;
	}

	public int dfs(int[] numbers, int depth, int target, int sum) {

		if (depth == numbers.length) {
			if (target == sum) {
				return 1;
			}

			return 0;
		}

		else {
			return dfs(numbers, depth + 1, target, sum + numbers[depth])
					+ dfs(numbers, depth + 1, target, sum - numbers[depth]);
		}

	}
}
