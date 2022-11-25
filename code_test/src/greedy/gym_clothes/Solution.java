package greedy.gym_clothes;

public class Solution {
	public static void main(String[] args) {

		Solution test = new Solution();

		int n = 5;
		int[] lost = new int[] { 2, 4 };
		int[] reserve = new int[] { 3 };

		int a = test.solution(n, lost, reserve);

		System.out.println(a);

	}

	public int solution(int n, int[] lost, int[] reserve) {

		int answer = 0;
		int[] total = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			total[i] = 1;
		}

		for (int l : lost) {
			total[l]--;
		}

		for (int r : reserve) {
			total[r]++;
		}

		if (total[1] == 0 && total[2] == 2) {
			total[1] = 1;
			total[2] = 1;
		}

		if (total[n - 1] == 2 && total[n] == 0) {
			total[n - 1] = 1;
			total[n] = 1;
		}

		for (int i = 2; i < n; i++) {
			if (total[i] == 0) {
				if (total[i - 1] == 2) {
					total[i] = 1;
					total[i - 1] = 1;
				}

				else if (total[i + 1] == 2) {
					total[i] = 1;
					total[i + 1] = 1;
				}
			}
		}

		for (int i = 1; i <= n; i++) {
			System.out.printf("%d ", total[i]);
		}

		for (int i = 1; i <= n; i++) {
			if (total[i] >= 1) {
				answer++;
			}
		}

		return answer;

	}
}
