import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeListComponent } from './employeelist.component';
import { DepartmentComponent } from './departmentlist.component';
import { DepartmentDetailComponent } from './departmentdetaillist.component';
import { HomeComponent } from './home.component';
import { PageNotFoundComponent } from './page-not-found.component'
const routes: Routes = [
    { path: '', redirectTo: 'deparment', pathMatch: 'full' },
    { path: 'deparment', component: DepartmentComponent },
    { path: 'employeelist', component: EmployeeListComponent },
    { path: 'deparment/:id', component: DepartmentDetailComponent },
    { path: 'home', component: HomeComponent },
    { path: '**', component: PageNotFoundComponent }
];

@NgModule({
    imports: [
        RouterModule.forRoot(routes)
    ],
    exports: [
        RouterModule
    ]

})
export class AppRoutingModule{}
export const routingComponents = [PageNotFoundComponent, EmployeeListComponent, DepartmentComponent, DepartmentDetailComponent, HomeComponent]