import { Component, OnInit } from '@angular/core';
import { UserDbService } from '../user-db.service';

@Component({
  selector: 'app-user-all',
  templateUrl: './user-all.component.html',
  styleUrls: ['./user-all.component.css']
})
export class UserAllComponent implements OnInit {
  users: any = [];
  constructor(private _service: UserDbService ) { }

  ngOnInit(): void {
  }
  refresh() : void { 
    this._service.fetchUsers().subscribe({
      next: (response) => this.users = response
    });
  }

}
