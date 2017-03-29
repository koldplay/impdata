import { Component ,OnInit } from '@angular/core';
import {EmployeeService} from './employee.service'
@Component ({
    selector : 'employee-details',
    template : `<h1>Employee Details</h1>
                <ul>
                    <li *ngFor = "let employee of employees">
                        [{{employee.name}},{{employee.id}},{{employee.gender}}]
                    </li>
                </ul>
                `    
})
export class EmployeeDetails implements OnInit {
    
    employees = [];

    constructor (private _employeeservice : EmployeeService){

    }

    ngOnInit(){
        this.employees = this._employeeservice.getEmployee();
    }
} 