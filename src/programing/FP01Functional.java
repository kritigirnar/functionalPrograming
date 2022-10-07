package programing;

import java.util.List;

public class FP01Functional {
public static void main(String[] args) {
	
	printFunctionalList(List.of(2,4,43,21,34));
}

private static void printNumbers(int num)
{
	System.out.println(num);
	
}
private static void printFunctionalList(List<Integer> numbers) {

	numbers.stream().forEach(FP01Functional::printNumbers);
}
}
