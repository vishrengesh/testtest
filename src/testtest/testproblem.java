package testtest;
import java.util.*;

public class testproblem {
	// you can also use imports, for example:

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	  @SuppressWarnings("deprecation")
	public int solution(int[] A)
	    {
	       HashSet <Integer> nums= new HashSet<Integer>();
	       System.out.println(A.length);
	       for(int i=1;i<=A.length+1;i++)
	       {
	           nums.add(i);
	         }
	         for(int a :A)
	         {
	         nums.remove(new Integer(a));
	         }
	         return nums.iterator().next();
	    }
	  
	  public static void main(String args[])
	  {
		  testproblem tp=new testproblem();
		  System.out.println(tp.solution(new int[] {5,8,2,2,7}));
		  
	  }
}
	

