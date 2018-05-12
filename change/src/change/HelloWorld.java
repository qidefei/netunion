package change;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  console =new Scanner(System.in);
		 int Q=console.nextInt();
		 HashSet<String> set=new HashSet<String>();
		 char[] ar;
		 for(int i=0;i<Q;i++) {
			 ar=console.next().toCharArray();
			 Arrays.sort(ar);
			 set.add(new String(ar));
			 
		 }
		 System.out.println(set.size());
			 
		 }

	}


