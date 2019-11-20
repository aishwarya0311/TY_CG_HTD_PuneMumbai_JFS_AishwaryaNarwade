package com.capgemini.array.genric;

public class TestP {

	public static void main(String[] args) {
		Student[] st = new Student [4];
Student s1 = new Student (20,"Aish",84.55);
Student s2 = new Student (21,"sima",83.56);
Student s3 = new Student (23,"Aisha",74.55);
Student s4 = new Student (24,"Aishu",44.55);

st[0]=s1;
st[1]=s2;
st[2]=s3;
st[3]=s4;

receive (st);
	}
static void receive(Student[] ar)
{
	for(Student k:ar) {
	System.out.println(k.id);
	System.out.println(k.name);
	System.out.println(k.percentage);
	
	}
}

}