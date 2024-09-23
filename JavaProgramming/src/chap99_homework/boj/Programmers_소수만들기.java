package chap99_homework.boj;

public class Programmers_소수만들기 {

	public static void main(String[] args) {
		
		class Solution {
		    public int solution(int[] nums) {
		        int answer = 0;
		        int sum = 0;
		        
		        for(int i = 0; i < nums.length; i++) {
		            if(nums.length > nums[i+2])
		            
		            sum = nums[i] + nums[i+1] + nums[i+2];
		        }
		        

		        return answer;
		    }
		    
		    public static boolean isPrime(int num) {
		        if(num < 2) return false;
		        for(int i = 2; i < num / 2; i++) {
		            if(num % i == 0) return false;
		        }
		        return true;
		    }
		}

	}

}
