package level0;

/**
 * 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */
public class iceAmericano {

	public static void main(String[] args) {

		iceAmericano test = new iceAmericano();
		int money;
		int[] result;

		// test1
		money = 5500;
		result = solution(money);
		System.out.print("test1 : ");
		for (int i : result) {
			System.out.print(i+", ");
		}

		// test2
		money = 15000;
		result = solution(money);
		System.out.print("\ntest2 : ");
		for (int i : result) {
			System.out.print(i+", ");
		}
	}

	public static int[] solution(int money) {
        int[] answer = new int[2];
        int check = 0;
        
        while (true) {
            if (money >= 5500) {
                money = money - 5500;
                check++;
            } else {
                break;
            }
        }
        
        answer[0] = check;
        answer[1] = money;
        
        return answer;
    }
}
