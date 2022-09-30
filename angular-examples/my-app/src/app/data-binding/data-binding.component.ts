import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {
  // username : string | undefined = undefined;
  username: string | undefined = undefined;
  age: number | undefined = undefined;
  phone : number | undefined = undefined;
  status: boolean = true;
  // userForm = {un:value, age: value, phone: value}
  handleSubmit(user : any) {
    this.username = user.un;
    this.age = user.age;
    this.phone = user.phone;
  }


  handleClick(username: string , age: number) : void {
    this.username = username;
    this.age = age;
  }
  m1(value: string) : void { 
    if(value.length < 3) 
      this.status = true;
    else
      this.status = false; 
  }
  constructor() { }

  ngOnInit(): void {
  }

}
