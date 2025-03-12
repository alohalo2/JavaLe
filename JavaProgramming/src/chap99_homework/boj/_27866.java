package chap99_homework.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _27866 {

	public static void main(String[] args) {

		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("영단어를 입력해주세요.");
            
            String userStringInput = br.readLine();
            
            System.out.println("출력하고 싶은 스펠링의 번호를 입력해주세요.");
            int userIntInput = Integer.parseInt(br.readLine());

            System.out.println(userStringInput.charAt(userIntInput - 1));

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//			
//			String userStringInput = br.readLine();
//			int userIntInput = Integer.parseInt(br.readLine());
//			
//			Character[] charArry = new Character[userStringInput.length()];
//			
//			for(int i = 0; i < userStringInput.length(); i++) {
//				charArry[i] = userStringInput.charAt(i);
//			}
//			
//			bw.write(charArry[userIntInput - 1]);
//			
//			br.close();
//			bw.flush();
//			bw.close();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
	}

}
