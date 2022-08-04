package streamtest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class test {

	public int solution(int A, int B) {
		// write your code in Java SE 8
		int intvalue =0;
		if (A > 0 && B > 0) {

			int x = A * B;
			String binary = String.valueOf(x);
			List<Integer> list = Arrays.asList(x);
			long li = list.stream().filter(l -> l==1).count();
			 intvalue = (int) li;

			
		}
		return intvalue;

	}
	public static void main(String[] args) {
		
		test t= new test();
		System.out.println(t.solution(4, 3));
		
	}

}
