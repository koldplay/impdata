"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", { value: true });
var core_1 = require("@angular/core");
var router_1 = require("@angular/router");
var userdata_component_1 = require("./userdata.component");
var userdatainsertion_component_1 = require("./userdatainsertion.component");
var productdata_component_1 = require("./productdata.component");
var userdelete_component_1 = require("./userdelete.component");
var routes = [
    { path: 'userdata', component: userdata_component_1.UserDataComponent },
    { path: 'userdatainsert', component: userdatainsertion_component_1.UserDataInsertionComponet },
    { path: 'productdata', component: productdata_component_1.ProductDataComponent },
    { path: 'userdelete', component: userdelete_component_1.UserDeleteComponent },
    {
        path: '', component: userdata_component_1.UserDataComponent
    }
];
var AppRoutingModule = (function () {
    function AppRoutingModule() {
    }
    return AppRoutingModule;
}());
AppRoutingModule = __decorate([
    core_1.NgModule({
        imports: [
            router_1.RouterModule.forRoot(routes)
        ],
        exports: [
            router_1.RouterModule
        ]
    })
], AppRoutingModule);
exports.AppRoutingModule = AppRoutingModule;
exports.routingComponent = [userdata_component_1.UserDataComponent,
    userdatainsertion_component_1.UserDataInsertionComponet,
    productdata_component_1.ProductDataComponent,
    userdelete_component_1.UserDeleteComponent];
//# sourceMappingURL=app.route.module.js.map