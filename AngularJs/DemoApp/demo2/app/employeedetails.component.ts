import { Component ,OnInit } from '@angular/core';
import {EmployeeService} from './employee.service'
@Component ({
    selector : 'employee-details',
    template : `<h1>Employee Details</h1>
                <h3>{{errorMsg}}</h3>    

                <ul>
                    <li *ngFor ="let employee of employees ">
                        {{employee.name}}
                    </li>
                </ul>
                `    
})
export class EmployeeDetails implements OnInit {
    
    employees = [];
    errorMsg : string;

    constructor (private _employeeservice : EmployeeService){

    }

    ngOnInit(){
         this._employeeservice.getEmployee().subscribe(resEmployeeData => this.employees = resEmployeeData,
                                                        resEmployeerror => this.errorMsg = resEmployeerror);
    }
} 