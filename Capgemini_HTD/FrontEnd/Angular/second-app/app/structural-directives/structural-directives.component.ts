import { Component, OnInit } from '@angular/core';
import { Student } from '../student';

@Component({
  selector: 'app-structural-directives',
  templateUrl: './structural-directives.component.html',
  styleUrls: ['./structural-directives.component.css']
})
export class StructuralDirectivesComponent implements OnInit {
  person='Aishwarya';
  flag=false;
  student: Student[]=[
    {
      id :10,
      name:'Saksham',
      age:25,
      degree :'BE'
    },{
      id:11,
      name:'snehal',
      age:20,
      degree:'BSC'
    },{
      id:12,
      name:'shreya',
      age:30,
      degree:'B.com'
    },{
      id:13,
      name:'Yash',
      age:45,
      degree:'B.tech'
    },{
      id:14,
      name:'siddhant',
      age:5,
      degree:'2nd class'
    }
  ]

  constructor() {
    setTimeout(()=>
    {
      this.flag=true;
    },1000)
   }
   deleteStudent(student:Student){
     const index=this.student.indexOf(student);
this.student.splice(index,1);
   }

  ngOnInit() {
  }

}
