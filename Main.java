public class Main{
    
	static void printFindNextGreaterElementOutput(int numbers[], int output[]) {
		System.out.println("Elemento      SEM");
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + "       -->       " + output[i]);	
		}
	}
	
    static int[] getNextGreaterElementOutput(int numbers[]) {
    	int arrayLength = numbers.length;
    	
    	// Map<Integer, Integer> output = new LinkedHashMap<Integer, Integer>();
    	int output[] = new int[numbers.length];
    	for (int i = 0;i < arrayLength; i++) {
    		output[i] = -1;
    		
    		for(int j = i + 1;j < arrayLength; j++) {
    			if (numbers[i] < numbers[j]) {
    				output[i] = numbers[j];
    				break;
    			}
    		}
    	}
    	return output;
    }
    
    public static void main (String[] args) {
    	// Ejemplo 1
    	int numbers[] = {4, 5, 2, 25};
    	
    	// EJemplo 2
    	// int numbers[] = {13, 7, 6, 12}; 
    	
    	int[] output = getNextGreaterElementOutput(numbers);
    	long finish = System.nanoTime();
    	printFindNextGreaterElementOutput(numbers, output);
    }
}