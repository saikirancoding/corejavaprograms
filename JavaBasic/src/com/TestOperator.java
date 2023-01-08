package com;

import java.util.Scanner;

/*
 * public class TestOperator {
 * 
 * public static void main(String []args) { //Arithmetic operators
 * 
 * //Increment/Decrement
 * 
 * int num1=10; System.out.println(num1++); System.out.println(++num1); }
 * 
 * }
 */

/*

public class TestOperator {

	public static void main(String []args)
	{
			
		//Increment/Decrement
		
		
		        int i=10,j=10,num=0;
		        System.out.println("i="+i);//10
		        System.out.println("j="+j);//10
		        System.out.println("num="+num);//0
		        System.out.println("---------------------------------------");
		        i++;  //memory=i=11
		        j--; //memory=j=9
		        System.out.println("i="+i);//11
		        System.out.println("j="+j);//9
		        System.out.println("num="+num);//0
		        System.out.println("---------------------------------------");
		        num=i++;  //num=11      memory=i=12
		        System.out.println("i="+i);  //12
		        System.out.println("j="+j);//9
		        System.out.println("num="+num);//11
		        System.out.println("New value---------------------------------------");
		        i=10;
		        
		        num=i++ + ++i;  // 10 +12=22
		        System.out.println("i="+i);//12
		      
		        System.out.println("num="+num);
		        System.out.println("---------------------------------------");
		       i=10;
		        num=i++ + --i;
		        System.out.println("i="+i);
		        System.out.println("j="+j);
		        System.out.println("num="+num);
		        System.out.println("---------------------------------------");
		        num=--i + j++;
		        System.out.println("i="+i);
		        System.out.println("j="+j);
		        System.out.println("num="+num);
		        System.out.println("---------------------------------------");
		        num=++i + ++j;
		        System.out.println("i="+i);
		        System.out.println("j="+j);
		        System.out.println("num="+num);  
		        
		        
		       

	}
	
}
*/

//  <  ,  >  ,<=  ,>=,!=  ,==
/*
public class TestOperator {

	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num1=sc.nextInt();
		
		System.out.println("Enter number");
		int num2=sc.nextInt();
		
		
		System.out.println(num1<num2);//f

		System.out.println(num1>num2);//f

		System.out.println(num1<=num2);//t

		System.out.println(num1>=num2);//t
		

		System.out.println(num1!=num2);//f
		
		System.out.println(num1==num2);//t
		
	}
}

*/

/*  Logical operators
public class TestOperator {

	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num1=sc.nextInt();//10
		
		System.out.println("Enter number");
		int num2=sc.nextInt();//7
		
		System.out.println("Enter number");
		int num3=sc.nextInt();//8
		
		System.out.println((num1<num2) && (num1<num3));
		
		System.out.println((num1>num2) || (num1<num3));
		
		System.out.println(!(num1>num2));
		
	}
}

*/

//Ternary Operator  ?:   exp1?(exp2) :(exp3)

/*
public class TestOperator {

	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num1=sc.nextInt();//10
		
		System.out.println("Enter number");
		int num2=sc.nextInt();//7
		
		int max= (num1<num2)?num1:num2;
		System.out.println(max);
		
		//find addition if num1 is greater than num2 else subtraction
		int result= (num1>num2)?(num1+num2):(num1-num2);
		System.out.println(result);
		
		
		
	}
}

*/

//Assignment =  +=  -=  *= /=  %=
/*
public class TestOperator {

	public static void main(String []args)
	{
		int s=10;
		
		s+=5;// s=s+5
		s/=2;//  s=s/2
		System.out.println(s);
				
		
	}
	
}

*/

//Bitwise Operator,

/*

public class TestOperator {

	public static void main(String []args)
	{
		int a=5;//  101
		int b=3;//011
		
		System.out.println(a & b);
		System.out.println(a | b);
		
		System.out.println(a ^  b);
		
	}
	
}

*/



public class TestOperator {

	public static void main(String []args)
	{
		int a=5;//  101
		
		
		System.out.println(a << 2);
		
		System.out.println(a >> 2);
		
		
	}
	
}












/*
public class TestOperator {

public static void main(String[] args)
{
    int a=64, b;
  
   
    b = (a << 2);
    System.out.println("Original value of a: " + a);
    System.out.println(" b: " +  b);
    
     
    b = (a >>2);
    System.out.println("Original value of a: " + a);
    System.out.println("b: " + b);
    
}

}
*/