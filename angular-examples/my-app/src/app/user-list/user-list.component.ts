import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css'],
  providers: [UserService]
})
export class UserListComponent implements OnInit {
  userList : any[] = [];
  constructor(private _service: UserService) { }
  // ngOnInit is a life-cycle method executed after 
  // constructor
  ngOnInit(): void {
    this.userList = this._service.findUsers();
  }
}
