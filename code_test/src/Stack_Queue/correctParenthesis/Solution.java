package Stack_Queue.correctParenthesis;

import java.util.Stack;

public class Solution {
	public static void main(String[] args) {

		Solution test = new Solution();
		boolean result;
		String inputStr = "";

		// 테스트 1
		inputStr = "()()";
		result = test.solution(inputStr);
		System.out.println("test1 : " + result);

		// 테스트 2
		inputStr = "(())()";
		result = test.solution(inputStr);
		System.out.println("test2 : " + result);

		// 테스트 3
		inputStr = ")()(";
		result = test.solution(inputStr);
		System.out.println("test3 : " + result);

		// 테스트 4
		inputStr = "(()(";
		result = test.solution(inputStr);
		System.out.println("test5 : " + result);

		// 테스트 5
		inputStr = "()())(()";
		result = test.solution(inputStr);
		System.out.println("test4 : " + result);
	}

	boolean solution(String s) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push('(');

			} else {

				// 문자 ) 이면서, 앞서 열린괄호가 없는 경우
				if (stack.isEmpty()) {
					return false;

				} else {
					stack.pop();
				}
			}
		}

		return ((stack.isEmpty()) ? true : false);
	}
}
