package question09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question9_8 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1を入力してください");
		String str1 = br.readLine();
		int num = Integer.parseInt(str1);

		String str2 = (num == 1) ? "1" : "1以外";
		System.out.println(str2 + "が入力されました");
	}
}

