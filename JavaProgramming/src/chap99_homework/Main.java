package chap99_homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {

			int N = Integer.parseInt(br.readLine());
			int[] Narr = new int[N];

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int idx = 0;

			while (st.hasMoreTokens()) {
				Narr[idx++] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(Narr);
			bw.write(Narr[0] + " " + Narr[N - 1]);

			bw.flush();
			bw.close();

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
