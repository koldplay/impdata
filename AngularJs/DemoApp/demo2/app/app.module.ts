import { NgModule } from '@angular/core';
//for form driven approach
// import { FormsModule} from '@angular/forms';
//form Model driven approach
import { ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router'

import { EmployeeDetails } from './employeedetails.component';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-router.module';
import { routingComponents } from './app-router.module';
import { TestComponent }  from './test.component'


@NgModule({
  imports: [BrowserModule, ReactiveFormsModule, HttpModule , AppRoutingModule],
  declarations: [AppComponent,  EmployeeDetails ,routingComponents , TestComponent ],
  bootstrap: [AppComponent]
})
export class AppModule { }
