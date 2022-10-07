package programing;

import java.util.List;

public class FP01Structured {
public static void main(String[] args) {
	
	printStructuredList(List.of(2,4,43,21,34));
}

private static void printStructuredList(List<Integer> numbers) {

	for(int printOneByOne : numbers)
	{
		System.out.println(printOneByOne);
	}
}
}
