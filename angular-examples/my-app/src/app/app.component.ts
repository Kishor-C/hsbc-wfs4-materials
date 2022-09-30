import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-app';
  user = {name: "Alex",salary:35000,dob: "1998-10-25"};
  products = ["Laptop", "Mobile", "Pen", "Book"];
  userArray = [
    {name: "Alex", phone: 9999},
    {name: "Charles", phone: 9888}
  ];
}
