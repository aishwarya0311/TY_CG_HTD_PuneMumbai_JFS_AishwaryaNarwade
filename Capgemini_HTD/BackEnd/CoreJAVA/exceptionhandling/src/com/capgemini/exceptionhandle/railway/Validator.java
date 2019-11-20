package com.capgemini.exceptionhandle.railway;

public class Validator {
void verify(int age)
{
	if (age<18) {
		throw new InvalidAgeException ();
	}
}

}
