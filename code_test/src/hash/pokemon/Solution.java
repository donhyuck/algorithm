package hash.pokemon;

import java.util.HashSet;

public class Solution {
	public static void main(String[] args) {

		Solution test = new Solution();
		int testResult;

		// 테스트1
		int[] intputArray1 = new int[] { 3, 1, 2, 3 };
		testResult = test.solution(intputArray1);
		System.out.println("Test 1 : " + testResult);

		// 테스트2
		int[] intputArray2 = new int[] { 3, 3, 3, 2, 2, 4 };
		testResult = test.solution(intputArray2);
		System.out.println("Test 2 : " + testResult);

		// 테스트3
		int[] intputArray3 = new int[] { 3, 3, 3, 2, 2, 2 };
		testResult = test.solution(intputArray3);
		System.out.println("Test 3 : " + testResult);
	}

	public int solution(int[] nums) {

		int halfNums = nums.length / 2;

		HashSet<Integer> hashSet = new HashSet<>();

		for (int num : nums) {
			hashSet.add(num);
		}

		if (hashSet.size() >= halfNums) {
			return halfNums;
		} else {
			return hashSet.size();
		}
	}
}