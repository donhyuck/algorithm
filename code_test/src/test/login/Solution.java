package test.login;

public class Solution {

	public static void main(String[] args) {

		Solution test = new Solution();
		String result = "";

		// test1
		String[] id_pw_1 = new String[] { "meosseugi", "1234" };
		String[][] db_1 = new String[][] { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };
		result = test.solution(id_pw_1, db_1);
		System.out.println("test1 : " + result);

		// test2
		String[] id_pw_2 = new String[] { "programmer01", "15789" };
		String[][] db_2 = new String[][] { { "programmer02", "111111" }, { "programmer00", "134" },
				{ "programmer01", "1145" } };
		result = test.solution(id_pw_2, db_2);
		System.out.println("test2 : " + result);

		// test2
		String[] id_pw_3 = new String[] { "rabbit04", "98761" };
		String[][] db_3 = new String[][] { { "jaja11", "98761" }, { "krong0313", "29440" }, { "rabbit00", "111333" } };
		result = test.solution(id_pw_3, db_3);
		System.out.println("test3 : " + result);
	}

	public String solution(String[] id_pw, String[][] db) {

		for (int i = 0; i < db.length; i++) {
			if (db[i][0].equals(id_pw[0])) {
				return db[i][1].equals(id_pw[1]) ? "login" : "wrong pw";
			}
		}

		return "fail";
	}
}
