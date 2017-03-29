import {Component ,OnInit ,Input , Output , EventEmitter} from  '@angular/core';
import { FormGroup , FormControl }
 from '@angular/forms'; 
import { UserService } from './user.service';
import {User} from "./User";
@Component ({
    selector : 'data-insert',
    templateUrl : 'app/userdatainsertion.component.html' 
})
export class UserDataInsertionComponet implements OnInit{
@Input() user : User;
@Output() userCreated = new EventEmitter();

    constructor(private _userservice : UserService){}
    
        userForm = new FormGroup({
        userId :  new FormControl(),
        userName : new FormControl(),
        email : new FormControl(),
        phoneNumber : new FormControl(),
        city : new FormControl()
    });

    ngOnInit(){ 
        console.log(this.userForm.value);
        // this._userservice.onSubmit(this.userForm.get('userId').value,
        //                            this.userForm.get('userName').value , 
        //                            this.userForm.get('email').value , 
        //                            this.userForm.get('phoneNumber').value  ,
        //                            this.userForm.get('city').value);
        // //this._userservice.onSubmit("U1000","krishna","kri@gmail.com","7587458578","bangalore");
        // console.log("data getted");

    }
    onSubmit(){
        console.log(this.userForm.value);
          this._userservice.onSubmit(this.userForm.get('userId').value,
                                   this.userForm.get('userName').value , 
                                   this.userForm.get('email').value , 
                                   this.userForm.get('phoneNumber').value  ,
                                   this.userForm.get('city').value).subscribe(
                                        (data) => console.log("message"+this.userForm.value),
                                        (onerror) => console.log("error"+onerror)
                                   );
        //this._userservice.onSubmit("U1000","krishna","kri@gmail.com","7587458578","bangalore");
        console.log("data getted");
        
        
        //User
       // this._userservice.onSubmit(this.userForm.value).subscribe((this.userCreated))
    }
    // onSubmit(userId , userName , email , phoneNumber , city){
    //     let user :   = {}
    // }
}




