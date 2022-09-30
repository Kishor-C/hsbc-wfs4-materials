import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  name : string = "Book";
  names : string[] = ["Laptop", "Mobile", "Pen"];
  // use *ngFor and pass each element to the item of
  // product-item
  constructor() { }

  ngOnInit(): void {
  }

}
