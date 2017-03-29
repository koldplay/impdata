import {NgModule} from '@angular/core';
import {RouterModule , Routes} from '@angular/router';
import {UserDataComponent} from  './userdata.component';
import {UserDataInsertionComponet} from './userdatainsertion.component';
import {ProductDataComponent} from './productdata.component';
import {UserDeleteComponent} from './userdelete.component';


const routes : Routes = [
        
     {path : 'userdata' , component : UserDataComponent},
     {path : 'userdatainsert' , component : UserDataInsertionComponet },
     { path : 'productdata' , component :ProductDataComponent},
     { path : 'userdelete' , component : UserDeleteComponent},
     {
         path : '' ,component: UserDataComponent
     }
];

@NgModule({

    imports : [
        RouterModule.forRoot (routes)
    ],
    exports :[
        RouterModule
    ]
})
export class AppRoutingModule{

}

export const routingComponent =[ UserDataComponent ,
                                 UserDataInsertionComponet,
                                 ProductDataComponent , 
                                 UserDeleteComponent]