import { Component, OnInit } from '@angular/core';
import { UserDbService } from '../user-db.service';

@Component({
  selector: 'app-user-store',
  templateUrl: './user-store.component.html',
  styleUrls: ['./user-store.component.css']
})
export class UserStoreComponent implements OnInit {
  msg : any = undefined;
  err : any = undefined;
  constructor(private _service : UserDbService) { }

  ngOnInit(): void {
  }
  // formValue = {userId: value, name: value, phone: value}
  handleSubmit(formValue: any) {
    this._service.saveUser(formValue).subscribe({
      next: (response) => { this.msg = response },
      error: (err) => { this.err = err.error.error}
    });
  }
}
