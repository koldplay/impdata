import {Component ,OnInit} from '@angular/core';
import {UserService} from './user.service'
@Component ({
    selector : 'user-delete',
    templateUrl : 'app/userdelete.component.html'
})
export class UserDeleteComponent implements OnInit{

    constructor(private _userservice :UserService){}

    ngOnInit(){
    }
}
