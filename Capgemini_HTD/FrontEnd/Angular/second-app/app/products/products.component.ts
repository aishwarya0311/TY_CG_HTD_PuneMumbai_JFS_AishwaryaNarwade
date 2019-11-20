import { Component, OnInit } from '@angular/core';
import { Product } from '../product';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
products :Product[]=[
{
name:'MacBook',
imageUrl:'https://cdn.pixabay.com/photo/2014/05/02/21/50/home-office-336377__340.jpg',
price:56999,
details:'very good'
},{
  name:'smart phone',
imageUrl:'https://cdn.pixabay.com/photo/2014/08/05/10/30/iphone-410324__340.jpg',
price:12999,
details:'good'},
{
name:'hairDryer',
imageUrl:'https://cdn.pixabay.com/photo/2014/03/24/19/01/hairdryer-295616__340.jpg',
price:4599,
details:'excellent'},
{
  name:'fridge',
  imageUrl:'https://cdn.pixabay.com/photo/2016/10/10/19/41/full-fridge-1729679__340.jpg',
  price:35458,
  details:'good'
}
]
  constructor() { }

  ngOnInit() {
  }

}
