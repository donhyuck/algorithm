package level1;


/**
문제 설명
자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 */
public class Solution {

	public static void main(String[] args) {

		Solution test = new Solution();
		int result = 0;
		int inputNo = 0;

		// test1
		inputNo = 123;
		result = test.solution(inputNo);
		System.out.println("test1 : " + result);

		// test2
		inputNo = 987;
		result = test.solution(inputNo);
		System.out.println("test2 : " + result);
	}

	public int solution(int n) {
		
        String str = String.valueOf(n);
        int answer = 0;
        
        for(int i=0; i < str.length(); i++) {
        	answer += Character.getNumericValue(str.charAt(i));
        }
       
        return answer;
    }
}
