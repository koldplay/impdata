import {Component ,OnInit} from '@angular/core';
import { Router ,Params , ActivatedRoute  } from '@angular/router';
@Component({
    selector : 'department-list',
    template : ` <h3>Department List</h3>
                <ul class="">
                    <li (click) = "onSelect(department)" [class.selected] = "isSelected(department)" *ngFor = "let department of departments">
                        <span class="badge">{{department.id}}</span>
                        {{department.name}} 
                    </li>
                </ul>    
                `
})
export class DepartmentComponent implements OnInit {

    public selectedId;
    constructor (private router : Router , private route : ActivatedRoute){}
    departments = [
        {"id" : 1 ,"name" : "angular"},
        {"id" : 2 ,"name" : "mongo"},
        {"id" : 3 ,"name" : "db"},
        {"id" : 4 ,"name" : "bootstrap"}
    ]
        ngOnInit(){
        this.route.params.subscribe((params : Params )=>{
            let id  = parseInt(params['id']);
            this.selectedId = id; 
        })
    }
    onSelect(department){
        //this.router.navigate(['/deparment' , department.id]);
        this.router.navigate(department.id) , {relativeTo : this.route};
    }
    isSelected(department){
       return this.department.id ===  this.selectedId ;
    }
}