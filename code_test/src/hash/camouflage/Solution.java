package hash.camouflage;

import java.util.HashMap;

public class Solution {
	public static void main(String[] args) {

		Solution test = new Solution();
		int testResult;

		// 테스트1
		String[][] intputArray1 = new String[][] { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
		testResult = test.solution(intputArray1);
		System.out.println("Test 1 : " + testResult);

		// 테스트2
		String[][] intputArray2 = new String[][] { { "crow_mask", "face" }, { "blue_sunglasses", "face" },
				{ "smoky_makeup", "face" } };
		testResult = test.solution(intputArray2);
		System.out.println("Test 2 : " + testResult);
	}

	public int solution(String[][] clothes) {

		int answer = 1;
		HashMap<String, Integer> hashMap = new HashMap<>();

		// (1) 종류구분
		for (int i = 0; i < clothes.length; i++) {
			String clothe_type = clothes[i][1];
			hashMap.put(clothe_type, hashMap.getOrDefault(clothe_type, 1) + 1);
		}

		// (2) 조합계산
		for (String key : hashMap.keySet()) {
			answer *= hashMap.get(key);
		}

		return answer - 1;
	}
}