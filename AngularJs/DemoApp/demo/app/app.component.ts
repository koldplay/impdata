import { Component ,OnInit } from '@angular/core';
import { FormGroup , FormBuilder , Validators } from '@angular/forms';
import {EmployeeService} from './employee.service'
// @Component({
//   selector: 'my-app',
//   templateUrl: 'app/app.component.html',
//   styles: [`input.ng-invalid{border-left : 5px solid red;}
//             input.ng-valid{border-left : 5px solid green;}`]
// })
@Component ({
    selector : 'my-app',
    template : `<h1>Employee List</h1>
              <employees-list></employees-list>
              <employee-details></employee-details>
    `,
    providers:[EmployeeService] 
})
export class AppComponent  {

  //Template driven approach
  // myname = "Brandan";
  // onSubmit(value : any){
  //   console.log(value);
  // }


  //Model driven approach

  // userForm = new FormGroup({
  //   name : new FormControl ('krishna',[Validators.required , Validators.minLength(4), Validators.maxLength(10)]),
  //   email : new FormControl(),
  //   address : new FormGroup({
  //     street : new FormControl(), 
  //     city : new FormControl() , 
  //     postalcode : new FormControl(null , Validators.pattern('^[0-9][1-9]{4}$'))
  //   })
  // });

  //FormBuilder Approach
  // userForm : FormGroup;

  // constructor (private _formbuilder : FormBuilder){

  // }
  // ngOnInit(){
  //   this.userForm = this._formbuilder.group({
  //     name : ['krishna',[Validators.required , Validators.minLength(4), Validators.maxLength(10)]],
  //     email : [],
  //     address : this._formbuilder.group({
  //       street :[],
  //       city : [],
  //       postalcode : [null,[Validators.pattern('^[0-9][1-9]{4}$')]]
  //     })
  //   })
  // }

  // onSubmit(){
  //   console.log(this.userForm.value);
  // }


 }
