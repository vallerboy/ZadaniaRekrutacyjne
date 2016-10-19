package pl.oskarpolak.akademiakodu;

public class Task2 {
	public static void main(String[] args) {
		  Task2 task = new Task2();
		  
		  int[] data = {-8, 4, 0, 5, -3, 6};
		  
		  task.solution(data);
	}
	
	
    private int solution(int[] a){
    	int max = 0;
    	
    	for(int p = 0; p < a.length; p++){ 
    		for(int q = 0; q < a.length; q++){ 
        	int temp = a[p] + a[q] + (q - p);
        		if(q < temp){
        		    if(temp > max) max = temp;
        		   }
        	}
    	}

    	System.out.println(max);
    	return max;
    }
	
}
