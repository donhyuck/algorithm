package level1;

/**
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을
 * 리턴합니다.
 */
public class reverseInt {

	public static void main(String[] args) {

		reverseInt test = new reverseInt();
		int num;

		// test1
		num = 12345;
		int[] result1 = solution(num);
		System.out.print("test1 :");
		for (int i : result1) {
			System.out.print(" " + i);
		}
		System.out.print("\n");

		// test2
		num = 267891;
		int[] result2 = solution(num);
		System.out.print("test2 :");
		for (int i : result2) {
			System.out.print(" " + i);
		}
		System.out.print("\n");
	}

	public static int[] solution(long n) {
		
		int sizeOfInt = (int) (Math.log10(n) + 1);
		int[] answer = new int[sizeOfInt];
		
		String nStr = String.valueOf(n);
		for (int i = nStr.length() - 1; i < 0; i--) {
//			answer[i] = (int) nStr.charAt(i);
			System.out.print(nStr.charAt(i));
		}

		return answer;
	}
}
