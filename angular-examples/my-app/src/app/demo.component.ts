import { Component } from "@angular/core";

@Component({
    selector: 'demo',
    templateUrl: './demo.component.html'
})
export class DemoComponent { 
    username : string = "Kishor";
    age : number = 34;
    person : any = {name: "Ajay", phone: 9999};
} 