import java.util.LinkedHashMap;
import java.util.Map;

public class Main{
    
	static void printFindNextGreaterElementOutput(Map<Integer, Integer> output) {
		System.out.println("Elemento      SEM");
		for(Map.Entry<Integer, Integer> entry : output.entrySet()) {
			System.out.println(entry.getKey() + "       -->       " + entry.getValue());	
		}
	}
	
    static Map<Integer, Integer> getNextGreaterElementOutput(int numbers[]) {
    	int arrayLength = numbers.length;
    	
    	Map<Integer, Integer> output = new LinkedHashMap<Integer, Integer>();
    	
    	for (int i = 0;i < arrayLength; i++) {
    		output.put(numbers[i], -1);
    		
    		for(int j = i + 1;j < arrayLength; j++) {
    			if (numbers[i] < numbers[j]) {
    				output.put(numbers[i], numbers[j]);
    				break;
    			}
    		}
    	}
    	return output;
    }
    
    public static void main (String[] args) {
    	// Ejemplo 1
    	int numbers[] = {4, 5, 2, 25};
    	
    	// Ejemplo 2
    	// int numbers[] = {13, 7, 6, 12}; 
    	
    	Map<Integer, Integer> output = getNextGreaterElementOutput(numbers);
    	printFindNextGreaterElementOutput(output);
    }
}