import { Component ,OnInit } from '@angular/core';
import { UserService } from './user.service';
import  { FormControl , FormGroup} from '@angular/forms';
import {UserDataInsertionComponet} from './userdatainsertion.component';
@Component({

    selector: 'user-data',
    templateUrl: 'app/userdata.component.html'  

})
export class UserDataComponent implements OnInit {

    
    Users = [];
    constructor(private _userservice : UserService){}
    ngOnInit(){
       this._userservice.getUser().subscribe(resUserData => this.Users  = resUserData);     
       
    }

 }

