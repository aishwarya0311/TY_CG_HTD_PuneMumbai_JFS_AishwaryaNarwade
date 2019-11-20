var Student = /** @class */ (function () {
    function Student(name, age, marks, degree //? means the argumnt is optional and we can have mutiple optional arguments
    ) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.degree = degree;
    }
    return Student;
}());
var student1 = new Student('Aishwarya', 23, 85, 'BE');
console.log(student1);
//student1.printDetails();
var student2 = {
    name: 'Saksham',
    marks: 92,
    age: 25,
    degree: 'MBBS'
};
console.log(student2);
var students = [
    new Student('snehal', 18, 12)
];
for (var _i = 0, students_1 = students; _i < students_1.length; _i++) {
    var student = students_1[_i];
    console.log(student);
}
