import { Injectable } from "@angular/core";

@Injectable()
export class UserService { 
    users : any[] = [];
    constructor() {
        this.users = [
            {name: 'Alex', phone: 99998},
            {name: 'Brad', phone: 77998},
            {name: 'Charles', phone: 988998},
        ];
    }
    findUsers() : any[] {
        return this.users;
    }
} 