package pl.oskarpolak.akademiakodu;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {

	private static Integer[] array;
	private static int averrage;
	
	public static void main(String[] args) {
		  init();
	}
	
	private static void init(){ 
		Scanner s = new Scanner(System.in);
		System.out.print("Wprowadz liczbe znakow w tablicy: ");
		int userMaxArray =  s.nextInt();
		array = new Integer[userMaxArray];
		
		for(int i = 0; i < userMaxArray; i++){ 
			System.out.print("Wprowadz zawartosc dla klucza array[" + i + "] : ");
			array[i] = s.nextInt();
		}
		
		s.close();
	
		
		averrage = 0;
        System.out.println(solution());
        
	}
	
	private static int getAverrage(int index){
		return Math.abs((array[index]) - averrage);
	}
	
	private static String solution(){
	 
		 if(array.length == 0){ 
			return  ("-1");
		 }else if(array.length == 1){
			return  getAverrage(0)+"";
		 }
		
		 StringBuilder message = new StringBuilder();
			
		 
         LinkedList<Integer> listOfKeys = new LinkedList<Integer>();
	      
	      // Sumuj elementy tablicy - potrzebne do œredniej.
		  for(int i = 0; i < array.length; i++){ 
			   averrage += array[i];
		  }
		  System.out.println("Averrage: " + averrage);
		  // Wylicz srednia i zapisz
		  averrage = averrage / array.length;
		  System.out.println("Averrage1: " + averrage);
		  // Wyznacz maksymalne odchylenie tablicy
		  double maxD = 0; 
		  for(int a1 = 0; a1 < array.length; a1++){ 
			   if(maxD < getAverrage(a1)){
				   maxD = getAverrage(a1);
			   }
		  }
	
		  
		  // Sprawdzamy czy tablica posiada jeszcze te same elementy i dodajemy je do mapy
		  for(int i = 0; i < array.length; i++){ 
			   if(maxD == getAverrage(i)){
				   listOfKeys.add(i);
			   }
		  }
		
		for(int i : listOfKeys){
			 message.append(i + " ");
		}
		return message.toString();
	}
	
	
}
