import {Injectable} from '@angular/core';
import {Http , Response} from '@angular/http';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';

@Injectable(

)
export class ProductService{
    private _url :string = "http://localhost:7070/UserProductRestEasy/UserProduct/getproduct";

    constructor(private _http : Http){}

    getUser(){
        return this._http.get(this._url).map((response : Response) => response.json());
    }
} 