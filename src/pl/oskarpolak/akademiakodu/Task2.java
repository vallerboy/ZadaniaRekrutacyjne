package pl.oskarpolak.akademiakodu;

public class Task2 {
	public static void main(String[] args) {
		  Task2 task = new Task2();
		  
		  int[] data = {5, 5, 2, 5, -3, 8};
		  
		  task.solution(data);
	}
	
	
    private long solution(int[] a){
    	long max = Long.MIN_VALUE;
    	
    	for(int p = 0; p < a.length; p++){ 
    		for(int q = 0; q < a.length; q++){ 
        	long temp = a[p] + a[q] + (q - p);
            if(temp > max) max = temp;
        		  
        	}
    	}

    	System.out.println(max);
    	return max;
    }
	
}
