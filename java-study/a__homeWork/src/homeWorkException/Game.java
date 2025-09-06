package homeWorkException;

import java.util.Scanner;

public class Game {
	
	void check (String nickname) throws BadWord {
		String[] arNickname = {"바보", "멍청이"};
		
		for (int i = 0; i < arNickname.length; i++) {
			if (nickname.contains(arNickname[i])) {
				throw new BadWord("비속어 감지");
			}
		}
	}
	
	public static void main(String[] args) {
		String nickname = null;
		String message = "닉네임: ";
		Scanner sc = new Scanner(System.in);
		Game game = new Game();
		
		System.out.println(message);
		nickname = sc.next();
		
		try {
			game.check(nickname);
			System.out.println("당신의 닉네임은 : " + nickname);
		} catch (BadWord e) {
			e.printStackTrace();
			System.out.println("다시");
			
		}
	}
}
