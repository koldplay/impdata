import { Component ,OnInit } from '@angular/core';
import { ActivatedRoute ,Router ,Params } from '@angular/router'
@Component({

    template : `<h3>You Selected department with id = {{departmentId}} </h3>
                <a (click)= "goPrivous()">Privous</a>
                <a (click)= "goNext()">Next</a>    
                <button (click) = "gotoDept()">Back</button>
    `
})
export class DepartmentDetailComponent implements OnInit{

    public departmentId;
    constructor (private  route : ActivatedRoute , private router : Router){

    }
    // ngOnInit(){
    //     let id = this.route.snapshot.params['id'];
    //     this.departmentId = id;
    // }
    ngOnInit(){
        this.route.params.subscribe((params : Params )=>{
            let id  = parseInt(params['id']);
            this.departmentId = id; 
        })
    }
    goPrivous(){
        let privousId = this.departmentId-1;
         this.router.navigate(['/deparment' ,privousId]);
    }
    goNext(){
        
        let nextId = this.departmentId+1;
         this.router.navigate(['/deparment' ,nextId]);
    }
    gotoDept(){
        let selectedId = this.departmentId? this.departmentId : null;
        //this.router.navigate(['/deparment' , {id : selectedId , random : "random"} ]);
        this.router.navigate(['../' , {selectedId}] ,{relativeTo : this.route})

    }
}