import {Component , OnInit} from '@angular/core';
import {EmployeeService} from './employee.service';
@Component ({

    selector : 'employees-list',
    template : `<h2>Employee List</h2>
               <h3>{{errorMsg}}</h3>   
                <ul>
                   <li *ngFor ="let employee of employees ">
                      {{employee.id}} , {{employee.name}}, {{employee.gender}}
                    </li>
                </ul>
     `

})
export class EmployeeListComponent implements OnInit{

    employees = [];
    errorMsg :string;
    constructor (private _employeeservice : EmployeeService){

    }

    ngOnInit(){
        this._employeeservice.getEmployee().subscribe(resEmployeeData => this.employees = resEmployeeData,
                                                      resEmployeerror => this.errorMsg = resEmployeerror);
    }
} 


