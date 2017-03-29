"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
Object.defineProperty(exports, "__esModule", { value: true });
var core_1 = require("@angular/core");
var http_1 = require("@angular/http");
require("rxjs/add/operator/map");
require("rxjs/add/operator/catch");
require("rxjs/add/observable/throw");
var User_1 = require("./User");
var UserService = (function () {
    function UserService(_http) {
        this._http = _http;
        this._url = "http://localhost:7070/UserProductRestEasy/UserProduct/getUser";
        this._urlPost = "http://localhost:7070/UserProductRestEasy/UserProduct/addUser";
        this._urlDelete = "http://localhost:7070/UserProductRestEasy/UserProduct/deleteUser/userid";
    }
    UserService.prototype.getUser = function () {
        return this._http.get(this._url).map(function (response) { return response.json(); });
    };
    UserService.prototype.onSubmit = function (userId, userName, email, phonenumber, city) {
        //this._url.push(userdata);
        var headers = new http_1.Headers();
        //console.log("hello"+userForm.userName);
        headers.append('Content-Type', 'application/json');
        // this._http.post(this._urlPost ,userdata, headers).subscribe(
        //     (response : Response)  => {console.log(response.json());
        //     return this.getUser();}
        // );
        var user = new User_1.User(userId, userName, email, phonenumber, city);
        console.log(userId);
        var body = JSON.stringify(user);
        return this._http.post(this._urlPost, user, { headers: headers }).map(function (response) {
            console.log("data");
            console.log(user);
        });
        // console.log(user);
    };
    UserService.prototype.ondelete = function (userId) {
        this._http.delete(this._urlDelete).map(function (response) {
            return;
        });
    };
    return UserService;
}());
UserService = __decorate([
    core_1.Injectable(),
    __metadata("design:paramtypes", [http_1.Http])
], UserService);
exports.UserService = UserService;
//# sourceMappingURL=user.service.js.map