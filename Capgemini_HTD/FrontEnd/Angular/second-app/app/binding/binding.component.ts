import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {

  name='Aishwarya';
  imgUrl="https://cdn.pixabay.com/photo/2019/10/06/11/58/sunshine-4530030__340.jpg"

  constructor() {
  }

  ngOnInit() {
  }

}
