package day19;

import java.util.LinkedList;
import java.util.Queue;

public class Program2 {

	public static void main(String[] args) {
		LinkedList<String> x= new LinkedList<String>();
		
		x.add("aaa");
		x.add("bbb");
		x.add("ccc");
		x.add("ddd");
		x.add("eee");
		x.add("fff");
		System.out.println(x);
		
		
		System.out.println(x.get(2));//ccc
		System.out.println(x.getFirst());//aaa
		System.out.println(x.getLast());//fff

		
		x.remove();
		System.out.println(x);
		
		x.removeFirst();//bbb
		System.out.println(x);
		
		x.removeLast();//fff;
		System.out.println(x);
		
		x.add("aaa");
		x.add("bbb");
		x.add("ccc");
		x.add("ddd");
		x.add("eee");
		x.add("fff");
		
		System.out.println(x);
		
		x.removeLastOccurrence("ccc");
		System.out.println(x);
		
		x.removeFirstOccurrence("ddd");
		System.out.println(x);
		
		
		System.out.println(x.indexOf("aaa"));//2
		System.out.println(x.indexOf("aaabbb"));//-1
		
		System.out.println(x.lastIndexOf("eee"));
		System.out.println(x.indexOf("eee"));
	}

}
