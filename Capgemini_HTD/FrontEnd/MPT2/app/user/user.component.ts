import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  Users = [];

  constructor(http: HttpClient) {
    http.get<any>('https://api.github.com/users').subscribe(data=>{
      this.Users = data;
      console.log(this.Users);
  }, err => {
    console.log(err);
  });
   }

  ngOnInit() {
  }

}


