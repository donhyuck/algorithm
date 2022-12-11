package hash.phoneBook_List;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static void main(String[] args) {

		Solution test = new Solution();
		boolean testResult;

		// 테스트1
		String[] intputArray1 = new String[] { "119", "97674223", "1195524421" };
		testResult = test.solution(intputArray1);
		System.out.println("Test 1 : " + testResult);

		// 테스트2
		String[] intputArray2 = new String[] { "123", "456", "789" };
		testResult = test.solution(intputArray2);
		System.out.println("Test 2 : " + testResult);

		// 테스트3
		String[] intputArray3 = new String[] { "12", "123", "1235", "567", "88" };
		testResult = test.solution(intputArray3);
		System.out.println("Test 3 : " + testResult);
	}

	public boolean solution(String[] phone_book) {

		// 정렬로 효율성증가
		Arrays.sort(phone_book);

		// 다음 항목과 비교하여 접두어 확인
		for (int i = 0; i < phone_book.length - 1; i++) {
			if (phone_book[i + 1].startsWith(phone_book[i])) {
				return false;
			}
		}
		return true;
	}

	public boolean hashSolution(String[] phone_book) {

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < phone_book.length; i++) {
			map.put(phone_book[i], i);
		}

		for (int i = 0; i < phone_book.length; i++) {
			for (int j = 0; j < phone_book[i].length(); j++) {
				if (map.containsKey(phone_book[i].substring(0, j))) {
					return false;
				}
			}
		}

		return true;
	}
}