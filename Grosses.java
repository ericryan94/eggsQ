import java.util.Scanner;

public class Grosses{
	
	public static void main(String[] args){
		

		Scanner in = new Scanner(System.in);//read from keyboard
		
		System.out.println("how many eggs do you have?");
		
		int eggs = in.nextInt();// next number entered is stored as integer
		
		
		int grosses=0;// initial number of grosses, 1 gross = 144
		
		int dozens =0;// initial number of dozens, 1 dozen = 12

		
		while(eggs>144){ //while input is greater than 144
			grosses++;// add one to grosses
			eggs=eggs-144;// then take 144 away from initial eggs
		} // exit while loop when <144
		
		while(eggs>=12){//while input is greater or equal than 12
			dozens++; // add one to dozen
			eggs=eggs-12;// then take 12 away from input
		} // exit while loop when <12
		
		in.close();
		System.out.println(grosses+" gross, "+dozens+" dozen, "+eggs+" single eggs");
	}
}
