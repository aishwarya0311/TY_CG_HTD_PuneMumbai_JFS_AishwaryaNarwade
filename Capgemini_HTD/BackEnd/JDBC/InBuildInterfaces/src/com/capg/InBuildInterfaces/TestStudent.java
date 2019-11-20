package com.capg.InBuildInterfaces;

import java.util.function.Predicate;

public class TestStudent {
	public static void main(String [] args)
	{
		Predicate<StudentPredicate> p=k-> {
			if(k.percentage>=35)
			{
				return true;
			} else { 
			
		}
			return false;
		};
		StudentPredicate s1= new StudentPredicate (1,"Raju",75.2);
		StudentPredicate s2= new StudentPredicate(2, " Priya",72.55);
		

	}
	}

