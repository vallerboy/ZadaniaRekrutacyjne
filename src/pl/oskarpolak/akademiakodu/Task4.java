package pl.oskarpolak.akademiakodu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task4 {
	public static void main(String[] args) {
		  Task4 task = new Task4();
		  task.solution("((()))))(");
		
	}
	
	
    private int  solution(String s ){

     	 int open = 0;
     	 int index = 0;
    	  for(int i = 0; i < s.length(); i++) {
    		  
    		  if(s.charAt(i) == '('){
    			open++;
    		  }  
    		  int countClose = 0;
    		  // Liczmy zamkni�te od momentu zatrzymania kursora
			  for(int x = i; x < s.length(); x++){
				  if(s.charAt(x) == ')'){
					  countClose++;
				  }
			  } 
			  // sprawdzamy czy czasem ilo�� otwartych nawias�w nie r�wna si� ju� z zamkni�tymi
			  if(open == countClose){
				  System.out.println(i);
				  return index;
			  }
    		  
    	  }
 
      return index;
    }
	
}
