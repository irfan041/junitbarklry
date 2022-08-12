package junitExample.demo;

public class Calculation {
// when do we write code we have to input and output 
	// we have to check the logics which we are going to perform
	//TDD Test driven development
	// we will write source code as well as test case of corresponding source code
	
	public int add(int x,int y) {
		return x+y;
	}
	
	public int subtract(int x,int y) {
		return x-y;
	}
	
	public int multiply(int x, int y) {
		return x*y;
	}
	public int divide(int x,int y) {
		return x/y;
	}
	
	  public boolean check(int x,int y) {
		  if(x>y) {
			  return true;
		  }
		  return false;
	  }
}
