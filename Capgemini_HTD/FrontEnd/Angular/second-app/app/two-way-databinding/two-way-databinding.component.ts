import { Component, OnInit } from '@angular/core';
import { ɵangular_packages_platform_browser_dynamic_platform_browser_dynamic_a } from '@angular/platform-browser-dynamic';

@Component({
  selector: 'app-two-way-databinding',
  templateUrl: './two-way-databinding.component.html',
  styleUrls: ['./two-way-databinding.component.css']
})
export class TwoWayDatabindingComponent implements OnInit {
  name:String= null;
  mobile:number=null;

  constructor() { }
    printform() {
      console.log(this.name),
      console.log(this.mobile)
    }
  ngOnInit() {
  }

}
