package week4;

import java.util.*;

/*
 * author @chetana
 */

public class Queue_Using_two_Stacks 
{
	

	    public static void main(String[] args)
	     {
	        Stack<Integer> stack_1=new Stack<Integer>();  //create first stack 
	        Stack<Integer> stack_2=new Stack<Integer>();	//create second stack 
	        Scanner sc=new Scanner(System.in);
	        int q=sc.nextInt();
	        for(int i=0;i<q;i++)
	        {
	            int type=sc.nextInt();
	            if(type==1)
	            {
	                int element=sc.nextInt();	//pushing the element in first stack
	                stack_1.push(element);
	            }
	            //System.out.println(stack.peek());
	            else
	            {
	                if(stack_2.isEmpty())
	                {
	                    while(!stack_1.empty())
	                    {
	                        stack_2.push(stack_1.pop());	
	                       // System.out.println(stack_1);
	                    }
	                }
	                if(type==2)
	                {
	                    stack_2.pop();			//deleting element from stack
	                }
	                if(type==3)
	                {
	                    System.out.println(stack_2.peek());		//printing the top (front of queue) of stack
	                }
	            }
	        }
	        sc.close();
	       // System.out.println(stack_1);
	    }
	

}
