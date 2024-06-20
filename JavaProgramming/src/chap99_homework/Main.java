package chap99_homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {

			int[] Narr = new int[9];
			int idx = 0;

			while (idx < 9) {

				Narr[idx++] = Integer.parseInt(br.readLine());
			}

			int max = 0;
			int maxCnt = 0;
			for (int i = 0; i < Narr.length; i++) {
				if (max < Narr[i]) {
					max = Narr[i];
					maxCnt = i + 1;
				}
			}

			bw.write(max + "\n");
			bw.write(maxCnt + "\n");

			bw.flush();
			bw.close();

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
