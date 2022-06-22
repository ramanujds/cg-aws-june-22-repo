package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamApiImpl {

	public static void main(String[] args) {
		
		List<Integer> items = Arrays.asList(6,2,4,5,1,8,9);
		
		
//		List <Integer>evens = items.stream().filter(item->item%2==0).collect(Collectors.toList());
		
		
		List <Integer>evens = items.stream().filter(item->item%2==0)
											.sorted()
											.collect(Collectors.toList());
		System.out.println(evens);
		
		
//		int output = items.stream().filter(item->item%2==0)
//									.map(item->item*item)
//									.reduce((item,sum)->sum+item)
//									.orElseThrow(()->new ArithmeticException("No value found"));
//		
//		int output = items.stream().filter(item->item%2==0)
//				.map(item->item*item)
//				.max((i1,i2)->i1-i2)
//				.get();
//				
//		
//		System.out.println(output);
		
		
	}
	
}
