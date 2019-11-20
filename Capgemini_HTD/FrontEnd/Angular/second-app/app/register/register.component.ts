import { Component, OnInit, OnDestroy } from '@angular/core';
import { FormGroup, FormControl, Validators, NgForm } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, OnDestroy{

  constructor() {
    console.log('register component is running');
   }

  get email() {
    return this.registerForm.get('email');
  }

  get password(){
    return this.registerForm.get('password');
  }

  registerForm=new FormGroup({
    email:new FormControl ('',[Validators.required,
    Validators.email,Validators.minLength(8)]),

    password:new FormControl('',
    [Validators.required,Validators.minLength(8)])
    });
    printForm(form:NgForm){
      console.log(form.value);
    }
  ngOnInit() {
    console.log('component initialised');
  }
  ngOnDestroy(){
    console.log('component is destroyed');
  }

}
