package hash.not_finish_player;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {

		Solution test = new Solution();
		String runner;
		String[] participantList;
		String[] completionList;

		// 테스트1
		participantList = new String[] { "leo", "kiki", "eden" };
		completionList = new String[] { "eden", "kiki" };
		runner = test.solution(participantList, completionList);
		System.out.println("Test 1 : " + runner);

		// 테스트2
		participantList = new String[] { "marina", "josipa", "nikola", "vinko", "filipa" };
		completionList = new String[] { "josipa", "filipa", "marina", "nikola" };
		runner = test.solution(participantList, completionList);
		System.out.println("Test 2 : " + runner);

		// 테스트3
		participantList = new String[] { "mislav", "stanko", "mislav", "ana" };
		completionList = new String[] { "stanko", "ana", "mislav" };
		runner = test.solution(participantList, completionList);
		System.out.println("Test 3 : " + runner);

	}

	public String solution(String[] participantList, String[] completionList) {

		Arrays.sort(participantList);
		Arrays.sort(completionList);

		int index = 0;
		for (index = 0; index < participantList.length - 1; index++) {
			if (!participantList[index].equals(completionList[index])) {
				return participantList[index];
			}
		}

		return participantList[index];
	}
}
