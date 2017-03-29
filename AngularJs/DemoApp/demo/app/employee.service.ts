import {Injectable} from '@angular/core';
import {Http , Response } from '@angular/http';
import 'rxjs/add/operator/map';
@Injectable (

)
export class EmployeeService{

    private _url : string ="appdata/employee.json";
    constructor (private _http :Http){}


    getEmployee (){
    //     return [
    //     {"id " : 1 , "name" : "krishna" , "gender" : "male"},
    //     {"id " : 2 , "name" : "rohit" , "gender" : "male"},        
    //     {"id " : 3 , "name" : "gopi" , "gender" : "male"},        
    // ]
    return this._http.get(this._url).map((response : Response) =>response.json);
    }
}