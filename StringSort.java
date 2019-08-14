package session7;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "The quick brown fox jumped over the lazy dog";
		System.out.println(input);
		String[] strArray1 = input.toLowerCase().split("\\s+");
		Arrays.sort(strArray1);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strArray1.length; i++) {
			String[] strArray2 = strArray1[i].split("");
			Arrays.sort(strArray2);
			for (int j = 0; j < strArray2.length; j++) {

				sb.append(strArray2[j]);
			}
			sb.append(" ");
		}
		System.out.println(sb.toString());

	}

}
