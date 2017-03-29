import {NgModule} from '@angular/core';
import {AppComponent} from './app.component';
import { BrowserModule } from '@angular/platform-browser';
//import {UserDataComponent} from  './userdata.component';
//import {ProductDataComponent} from  './productdata.component';
import {HttpModule  ,JsonpModule} from '@angular/http';
import { ReactiveFormsModule } from '@angular/forms';
//import {UserDataInsertionComponet} from './userdatainsertion.component';
import {AppRoutingModule} from  './app.route.module';
import {routingComponent} from  './app.route.module';

@NgModule({
    imports : [ BrowserModule ,HttpModule , ReactiveFormsModule , JsonpModule ,AppRoutingModule],
    declarations: [AppComponent ,routingComponent],
    bootstrap: [AppComponent]
})


export class AppModule{}