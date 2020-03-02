package Pizz;

public class PizzBuzz {
	public static void main(String[] args) {
		int j = 1;
		
		for(int i = 0; i<100; i++) {
				if(j%15 == 0) {
					System.out.println("Fizzbuzz");
				}
				else if(j % 3 == 0) {
					System.out.println("Fizz");
				}
				else if(j % 5 == 0){
					System.out.println("Buzz");
				}
				else {
					System.out.println(j);
				}
			j++;		}
	}

}
