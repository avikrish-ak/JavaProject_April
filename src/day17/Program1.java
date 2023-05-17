package day17;

import java.util.Arrays;
import java.util.HashSet;

public class Program1 {

	public static void main(String[] args) {
		
		HashSet<String> x= new HashSet<>();
		x.add("aa");
		x.add("bb");
		x.add("cc");
		x.add("aa");
		x.add("bb");
		x.add("cc");
		System.out.println(x);
		
		x.addAll(Arrays.asList("ab","bc","cd"));
		System.out.println(x);
		
		for(String y:x)
		{
			System.out.println(y);
		}

		System.out.println(x.size());
		
		System.out.println(x.contains("aa"));
		System.out.println(x.contains("aaa"));
		
		System.out.println(x.containsAll(Arrays.asList("aa","bb","cc")));
		
		System.out.println(x.isEmpty());
		
	}

}
