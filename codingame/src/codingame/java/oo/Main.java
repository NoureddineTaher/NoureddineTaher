package codingame.java.oo;

import java.util.Random;

public class Main {
	public static String getStringRandom(int length) {

		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();

		for (int i = 0; i < length; i++) {

			int index = random.nextInt(alphabet.length());
			char randomChar = alphabet.charAt(index);
			sb.append(randomChar);
		}
		return sb.toString();

	}

	public static void main(String[] args) {

		getStringRandom(6);

	}

}
