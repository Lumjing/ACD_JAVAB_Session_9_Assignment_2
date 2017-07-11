package assignment_9_2;       
import java.util.*;

//This assignment helped me to master the concepts of HashSet and operations on it.


public class Assignment_9_2       //Class declaration containing main function. 
{
	public static void main(String[] args)     //main function declaration. and because it is static, program execution starts from main function. 
	{
		HashSet<String> firstSet = new HashSet<String>();      //Creating HashSet of type String to store the data and removing duplicity.
		
		//Adding two String values in the firstSet. 
		firstSet.add("Lumjing");
		firstSet.add("Madhav");
		
		HashSet<String> secondSet = new HashSet<String>();      //Creating another HashSet of type String to store the data and removing duplicity.
		
		//Adding String elements in HashSet.
		secondSet.add("Keze");
		secondSet.add("Baski");
		secondSet.add("Shyam");
		secondSet.add("Santosh");
		
		//Adding elements of secondSet to firstSet.
		firstSet.addAll(secondSet);
		
		Iterator listFirst=firstSet.iterator();         //Creating the Iterator for first Set.
		System.out.println("The elements in the first Set are : ");
		while(listFirst.hasNext())     //While loop to print elements.
		{
			System.out.println(listFirst.next());        //Printing the elements.
		}
		
		System.out.println();       //Leaving one line.
		
		Iterator listSecond=secondSet.iterator();         //Creating the Iterator for second Set.
		System.out.println("The elements in the second Set are : ");
		while(listSecond.hasNext())     //While loop to print elements.
		{
			System.out.println(listSecond.next());        //Printing the elements.
		}
		
	}    //End of main function.

}    //End of class.
