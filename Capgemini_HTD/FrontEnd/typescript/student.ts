class Student{
constructor(
    public name: string,
    public age: number,
    public  marks: number,
    public degree ?:string   //? means the argumnt is optional and we can have mutiple optional arguments
    ) {
 }
    // printDetails(){
    //     console.log(`Name is ${this.name} age is ${this.age} and marks are ${this.marks}`);
    // }

}
let student1= new Student('Aishwarya', 23,85,'BE');
console.log(student1);
//student1.printDetails();

let student2 :Student={    //litreal way of creating and object
    name:'Saksham',
    marks:92,
    age:25,
    degree : 'MBBS'
}
console.log(student2);

let students : Student[]=[
    new Student('snehal',18,12)
];
 for(let student of students){
     console.log(student);
 }

