package pl.oskarpolak.akademiakodu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task4 {
	public static void main(String[] args) {
		  Task4 task = new Task4();
		  task.solution(new int[] {1, -1, 0, 2, 3 ,5}, 3);
		
	}
	
	
    private int  solution(int[] a, int D){
    
        List steps = new ArrayList<Integer>();
        int localStep; 
    	for(int step = 0; step < a.length; step++){
    		for(int jump = 1; jump < D ; jump++){
    			if(step + jump < a.length && a[step+jump] != -1 &&  step == a[step+jump] ){
    				step += jump;
    				System.out.println("jump at " + step);
    			}else if(step + jump > a.length ){
    				System.out.println("koniec " + step);
    				
    			}
    		}
    	}
    	
    	return 0;
    }
	
}
