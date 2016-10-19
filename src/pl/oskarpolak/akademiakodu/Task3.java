package pl.oskarpolak.akademiakodu;

public class Task3 {
	public static void main(String[] args) {
		  Task3 task = new Task3();
		  task.solution("00-44  48 5555 8361");
		  task.solution("00");
		  task.solution("00-44  48 5555 81");
		  task.solution("00-44  48  - 5555 8361");
	}
	
	
    private String solution(String s){
        StringBuilder finalString = new StringBuilder();

    	String workString = s.replaceAll("\\D","");
    	   
    	   for(char i = 0; i < workString.length(); i++){
    		   if(i % 3 == 0 && i != 0){
    			   finalString.append("-"); 
    		    }
    		   finalString.append(workString.charAt(i));  
    	   }
    	   
    	System.out.println(finalString.toString());
    	
    	return finalString.toString();
    }
	
}
