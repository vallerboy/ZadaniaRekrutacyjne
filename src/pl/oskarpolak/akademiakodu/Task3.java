package pl.oskarpolak.akademiakodu;

public class Task3 {
	public static void main(String[] args) {
		  Task3 task = new Task3();
		  task.solution("00-44  48 5555 8361");
		  task.solution("00");
		  task.solution("00-44  48 5555 81");
		  task.solution("00-44  48  - 5555 8361");
		  task.solution("0  - 22 1985--324");
	}

	
    private String solution(String s){
        StringBuilder finalString = new StringBuilder();
       // += jakistekst
    	String workString = s.replaceAll("\\D","");
    	   
    	   int rest = workString.length() % 3; 
		   
    	   finalString.append(workString.charAt(0));
    	     
    	   for(char i = 1; i < workString.length(); i++){
    	   if(rest != 1) { 
    		   if(i % 3 == 0 ){
    			   finalString.append("-"); 
    		    }		
    	   } else { 
    		   if(i >= workString.length()-4){ 
    			   if(i % 2 == 0 && i != 0 ){
        			   finalString.append("-"); 
        		    }
    		   }else{ 
    			   if(i % 3 == 0 && i != 0 ){
        			   finalString.append("-"); 
        		    }
    		   }
    	   }
    	   finalString.append(workString.charAt(i));  
    	   }
    	   
    	System.out.println(finalString.toString());
    	
    	return finalString.toString();
    }
	
}
