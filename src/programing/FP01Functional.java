package programing;

import java.util.List;

public class FP01Functional {
public static void main(String[] args) {
	
	//printFunctionalList(List.of(2,4,43,21,34));
	printFunctionalEvenList(List.of(2,4,43,21,34));

}



/*
private static void printNumbers(int num)
{
	System.out.println(num);
	 
}*/
/*
private static void printFunctionalList(List<Integer> numbers) {

	//numbers.stream().forEach(FP01Functional::printNumbers);
	numbers.stream().forEach(System.out::println);
}*/

public static boolean evenNum(int num)
{
	return num %2==0;
}
private static void printFunctionalEvenList(List<Integer> numbers) {

	//numbers.stream().filter(FP01Functional::evenNum).forEach(System.out::println);
	/*numbers.stream().filter(
			number->number%2==0
			).forEach(System.out::println);
*/
	
	numbers.stream().filter(a->a%2!=0).forEach(System.out::println);
}

	
	
}
