package level1;

/**
 * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
 */
public class numOfIntervalX {

	public static void main(String[] args) {

		numOfIntervalX test = new numOfIntervalX();
		int x, n;

		// test1
		x = 2;
		n = 5;
		long[] result1 = solution(x, n);
		System.out.print("test1 :");
		for (long i : result1) {
			System.out.print(" " + i);
		}
		System.out.print("\n");

		// test2
		x = 4;
		n = 3;
		long[] result2 = solution(x, n);
		System.out.print("test2 :");
		for (long i : result2) {
			System.out.print(" " + i);
		}
		System.out.print("\n");

		// test3
		x = -4;
		n = 2;
		long[] result3 = solution(x, n);
		System.out.print("test3 :");
		for (long i : result3) {
			System.out.print(" " + i);
		}
		System.out.print("\n");
	}

	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		long num = x;
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num;
			num += x;
		}
		return answer;
	}
}
