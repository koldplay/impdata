import { NgModule }      from '@angular/core';
//for form driven approach
// import { FormsModule} from '@angular/forms';
//form Model driven approach
import {ReactiveFormsModule} from  '@angular/forms';
import {HttpModule} from '@angular/http';
import {EmployeeListComponent} from './employeelist.component' ; 
import {EmployeeDetails} from './employeedetails.component';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }   from './app.component';
@NgModule({
  imports:      [ BrowserModule ,ReactiveFormsModule ,HttpModule],
  declarations: [ AppComponent , EmployeeListComponent , EmployeeDetails  ],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
