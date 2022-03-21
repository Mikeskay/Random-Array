package base;


public class RandomArray {

	private int[] numbers; //instance variable

	public RandomArray(int size){
		numbers = new int[size];
		
		for(int i=0; i<numbers.length;i++){
			numbers[i] = (int)(Math.random()*10); // a random number between 0-9
		}
	}

	/**
	 *  a method to print the array elements
	 */

	public void printArray(){
		for(int i = 0; i < numbers.length; i++){
           
            System.out.print(numbers[i] + " ");

        }
            System.out.println(" ");
	
	}

 
    
	/**
	 *  A method to calculate the sum of all elements
	 *
	 *@return    The sum
	 */

	public int calSum(){

		int sum = 0;
			for(int i=0; i< numbers.length; i++){
	         sum = sum + numbers[i];
	    }
			return sum;
	}


	public double calMean(){
		double newSum = this.calSum();
		double mean = newSum/this.numbers.length;

		return mean;
	}

	public void printReverse(){

		for(int i=0; i<numbers.length/2; i++){
		int temp = numbers[i];
		numbers[i] = numbers[numbers.length -i -1];
		numbers[numbers.length -i -1] = temp;

		}

	}

	/**
	 *  A main method to test
	 */
	
	public static void main(String[] args) {
		// Check to see if the user has actually sent a paramter to the method
		if (args.length != 1){
			System.out.println("Usage: java RandomArray <NUM>. Example: java RandomArray 5");
			System.exit(-1);
		}

		// Create an instance of the class
		RandomArray test = new RandomArray(Integer.parseInt(args[0]));


		// Print the array
		test.printArray();

		// Calculate the sum of all the values in the array and print it
		System.out.println("Sum: "+ test.calSum());

		// Calculate the mean of all the values in the array and print it
		System.out.println("Mean: "+ test.calMean());


		test.printReverse();
		System.out.println("Reverse: ");
		test.printArray();;


	}

}
