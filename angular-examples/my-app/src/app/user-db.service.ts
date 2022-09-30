import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserDbService {

  constructor(private _http: HttpClient) { }
  // fetchUsers to get all the users
  public fetchUsers() : Observable<any> { 
    let url = "http://localhost:9091/api/users";
    return this._http.get(url);
  }
  // fetchUserById is called to get user or error 
  public fetchUserById(userid: number) : Observable<any> {
    let url = "http://localhost:9091/api/users/"+userid;
    return this._http.get(url);
  }
  // save(user) calls the service that stores the user 
  public saveUser(user: any): Observable<any> { 
    let url = "http://localhost:9091/api/users";
    return this._http.post(url, user);
  } 
}
