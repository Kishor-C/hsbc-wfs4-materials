import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { DemoComponent } from './demo.component';
import { TestComponent } from './test/test.component';
import { HelloComponent } from './hello/hello.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { FormsModule } from '@angular/forms';
import { ProductListComponent } from './product-list/product-list.component';
import { ProductItemComponent } from './product-item/product-item.component';
import { UserListComponent } from './user-list/user-list.component';
import { HttpClientModule } from '@angular/common/http';
import { UserByIdComponent } from './user-by-id/user-by-id.component';
import { UserAllComponent } from './user-all/user-all.component';
import { UserStoreComponent } from './user-store/user-store.component';
import { UserDeleteComponent } from './user-delete/user-delete.component'; 

@NgModule({
  declarations: [
    AppComponent, DemoComponent, TestComponent, HelloComponent, DataBindingComponent, ProductListComponent, ProductItemComponent, UserListComponent, UserByIdComponent, UserAllComponent, UserStoreComponent, UserDeleteComponent
  ],
  imports: [
    BrowserModule, FormsModule, HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
