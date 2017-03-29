import {Injectable} from '@angular/core';
import {Http , Response , Request ,Headers} from '@angular/http';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import {User} from './User';
@Injectable(

)
export class UserService{
    private _url :string = "http://localhost:7070/UserProductRestEasy/UserProduct/getUser";
    private _urlPost :string ="http://localhost:7070/UserProductRestEasy/UserProduct/addUser";
    private _urlDelete :string = "http://localhost:7070/UserProductRestEasy/UserProduct/deleteUser/userid";

    constructor(private _http : Http){}

    getUser(){
        return this._http.get(this._url).map((response : Response) => response.json());
    }

    onSubmit(userId ,userName , email , phonenumber ,city){ 
    
        //this._url.push(userdata);
        let headers = new Headers();
        //console.log("hello"+userForm.userName);
        
        
         headers.append('Content-Type' , 'application/json' );

        
        // this._http.post(this._urlPost ,userdata, headers).subscribe(
        //     (response : Response)  => {console.log(response.json());
        //     return this.getUser();}
        // );
        let  user : User = new User( userId , userName ,email , phonenumber , city);
        console.log(userId);
         const body  = JSON.stringify(user);
  
        return this._http.post(this._urlPost ,user,{headers : headers}).map((response : Response) =>{
            console.log("data");
            console.log(user);

        });
        // console.log(user);


    } 
    ondelete(userId){
        this._http.delete(this._urlDelete).map((response :Response) =>{
            return;
        });
    }
} 

