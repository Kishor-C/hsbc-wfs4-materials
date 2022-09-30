import { Component, OnInit } from '@angular/core';
import { UserDbService } from '../user-db.service';

@Component({
  selector: 'app-user-by-id',
  templateUrl: './user-by-id.component.html',
  styleUrls: ['./user-by-id.component.css']
})
export class UserByIdComponent implements OnInit {
  user : any = undefined;
  error : any = undefined;
  constructor(private _service:UserDbService) { }

  ngOnInit(): void {
  }
  handleClick(userid: number) {
    this._service.fetchUserById(userid).subscribe({
      next: (data) => {this.user = data; this.error = undefined},
      error: (err) => {this.error = err; this.user = undefined}
    }); // close of subscribe() fn
  }
}
