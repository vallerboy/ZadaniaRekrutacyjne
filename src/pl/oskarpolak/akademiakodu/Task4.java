package pl.oskarpolak.akademiakodu;



public class Task4 {
	public static void main(String[] args) {
		  Task4 task = new Task4();
		  task.solution("(())))(");
		  task.solution("(())))(()");
		  task.solution("(((())))(()");
		  task.solution("()())(");
		  task.solution("()");
	}
	
	
  
	
	
    private int  solution(String s ){
      int counter = 0;
  	  for(int i = 0; i < s.length(); i++) {
  		  int countOpen = 0; 
  		  // nawiasy otwarte
  		    for(int x = 0; x <= i; x++) { 
  		    	  if(s.charAt(x) == '('){ 
  		    		  countOpen++; 
  		    	  }
  		    	  counter ++;
  		    }
 
  		int countClosed = 0;
  		  // nawiasy zamkniête - liczy dopiero odk¹d skoñczy³ counter
  	    for(int x = counter; x < s.length(); x++) { 
	    	  if(s.charAt(x) == ')'){ 
	    		  countClosed++; 
	    	  }
	    }
	     
  	     if(countOpen == countClosed) {
  	    	 System.out.println(counter);
  	     }
  	    
  	  }

    return counter;
  }
    
	
}