package Stack_Queue.function_development;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public static void main(String[] args) {

		Solution test = new Solution();
		int[] result;

		// 테스트 1
		int[] inputProgresses1 = new int[] { 93, 30, 55 };
		int[] inputSpeeds1 = new int[] { 1, 30, 5 };
		result = test.solution(inputProgresses1, inputSpeeds1);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}

		System.out.println();

		// 테스트 2
		int[] inputProgresses2 = new int[] { 95, 90, 99, 99, 80, 99 };
		int[] inputSpeeds2 = new int[] { 1, 1, 1, 1, 1, 1 };
		result = test.solution(inputProgresses2, inputSpeeds2);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}

	public int[] solution(int[] progresses, int[] speeds) {

		Queue<Integer> queue = new LinkedList<>();
		int remainedDays = 0;

		// 남은 작업량과 작업속도로 각각 남은 일수를 queue에 add
		for (int i = 0; i < progresses.length; i++) {
			remainedDays = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
			queue.add(remainedDays);
		}
		
		System.out.println(queue);

		List<Integer> answerList = new ArrayList<>();

		int topWork = queue.peek(); // 앞선에 있는 작업을 기준
		int count = 0;

		// 큐 객체의 작업량이 100이 되는 시점을 확인
		for (int i : queue) {
			if (topWork >= i) {
				count++;
			} else {
				answerList.add(count); // 결과저장
				topWork = i; // 기준갱신
				count = 1;
			}
		}

		answerList.add(count);

		// List -> int[] 변환
		int[] answer = new int[answerList.size()];

		for (int i = 0; i < answerList.size(); i++) {
			answer[i] = answerList.get(i);
		}

		return answer;
	}
}
