import {Component , OnInit} from '@angular/core';
import {EmployeeService} from './employee.service';
@Component ({

    selector : 'employees-list',
    template : `<h2>Employee List</h2>
                <ul>
                    <li *ngFor = "let employee of employees">
                        {{employee.name}}
                    </li>
                </ul>
     `

})
export class EmployeeListComponent implements OnInit{

    employees = [];

    constructor (private _employeeservice : EmployeeService){

    }

    ngOnInit(){
        this._employeeservice.getEmployee().subscribe(resEmployeeData => this.employees = resEmployeeData);
    }
} 


