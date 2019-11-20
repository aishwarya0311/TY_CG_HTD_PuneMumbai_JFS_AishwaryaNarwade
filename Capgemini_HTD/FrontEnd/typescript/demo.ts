let myName: string ='Aishwarya';    //writing string dataype keyword is optional but recommended
//myName=1234;   error- we cannot change the datatype   


//any datatype
let company;  //implicitly it will be considered as any datayape
company=1234;
company=true;
company='xyz';

//union types
let age:string | number
age=23;
age='twenty three';
//age= true; error-only string and number can be stored.

//tuple
let details :[string,number,boolean] =['xyz',789,true];
let mobiles :string[] =['iphone','samsung','mi'];

//functions
function add(a: number, b: number) : number {
    return a+b;
}