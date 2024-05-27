package chap99_homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public String addNim(String name) {
		return name + "님";
	}
	
	public static void main(String[] args) {

		List<String> nameList = Arrays.asList("홍길동", "장길산", "임꺽정");
		
		Test test = new Test();
		
		nameList.stream().map(test :: addNim).forEach(System.out :: println);
				 
//		List<String> isList = Arrays.asList("aaa","bbb","ccc","ddd");
//		isList.stream().map(element -> element.toUpperCase())
//					   .forEach(System.out :: println);
//		
//		List<String> isList2 = new ArrayList<String>();
//		
//		isList2.add("aaa");
//		isList2.add("bbb");
//		isList2.add("ccc");
//		isList2.add("ddd");
		
	}
}
