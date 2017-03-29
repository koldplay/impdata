"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", { value: true });
var core_1 = require("@angular/core");
var employee_service_1 = require("./employee.service");
// @Component({
//   selector: 'my-app',
//   templateUrl: 'app/app.component.html',
//   styles: [`input.ng-invalid{border-left : 5px solid red;}
//             input.ng-valid{border-left : 5px solid green;}`]
// })
var AppComponent = (function () {
    function AppComponent() {
    }
    return AppComponent;
}());
AppComponent = __decorate([
    core_1.Component({
        selector: 'my-app',
        template: "<h1>Employee List</h1>\n               <employees-list></employees-list>\n               <employee-details></employee-details>\n         \n      <h1>outing Component</h1>           \n      <nav>\n        <a routerLink = \"/deparment\" routerLinkActive = \"active\">Deparment</a>\n        <a routerLink = \"/employeelist\" routerLinkActive = \"active\">Employee</a>\n      </nav>\n      <router-outlet></router-outlet>\n    ",
        providers: [employee_service_1.EmployeeService]
    })
], AppComponent);
exports.AppComponent = AppComponent;
//# sourceMappingURL=app.component.js.map