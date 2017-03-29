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
var forms_1 = require("@angular/forms");
var user_service_1 = require("./user.service");
var User_1 = require("./User");
var UserDataInsertionComponet = (function () {
    function UserDataInsertionComponet(_userservice) {
        this._userservice = _userservice;
        this.userCreated = new core_1.EventEmitter();
        this.userForm = new forms_1.FormGroup({
            userId: new forms_1.FormControl(),
            userName: new forms_1.FormControl(),
            email: new forms_1.FormControl(),
            phoneNumber: new forms_1.FormControl(),
            city: new forms_1.FormControl()
        });
    }
    UserDataInsertionComponet.prototype.ngOnInit = function () {
        console.log(this.userForm.value);
        // this._userservice.onSubmit(this.userForm.get('userId').value,
        //                            this.userForm.get('userName').value , 
        //                            this.userForm.get('email').value , 
        //                            this.userForm.get('phoneNumber').value  ,
        //                            this.userForm.get('city').value);
        // //this._userservice.onSubmit("U1000","krishna","kri@gmail.com","7587458578","bangalore");
        // console.log("data getted");
    };
    UserDataInsertionComponet.prototype.onSubmit = function () {
        var _this = this;
        console.log(this.userForm.value);
        this._userservice.onSubmit(this.userForm.get('userId').value, this.userForm.get('userName').value, this.userForm.get('email').value, this.userForm.get('phoneNumber').value, this.userForm.get('city').value).subscribe(function (data) { return console.log("message" + _this.userForm.value); }, function (onerror) { return console.log("error" + onerror); });
        //this._userservice.onSubmit("U1000","krishna","kri@gmail.com","7587458578","bangalore");
        console.log("data getted");
        //User
        // this._userservice.onSubmit(this.userForm.value).subscribe((this.userCreated))
    };
    return UserDataInsertionComponet;
}());
__decorate([
    core_1.Input(),
    __metadata("design:type", User_1.User)
], UserDataInsertionComponet.prototype, "user", void 0);
__decorate([
    core_1.Output(),
    __metadata("design:type", Object)
], UserDataInsertionComponet.prototype, "userCreated", void 0);
UserDataInsertionComponet = __decorate([
    core_1.Component({
        selector: 'data-insert',
        templateUrl: 'app/userdatainsertion.component.html'
    }),
    __metadata("design:paramtypes", [user_service_1.UserService])
], UserDataInsertionComponet);
exports.UserDataInsertionComponet = UserDataInsertionComponet;
//# sourceMappingURL=userdatainsertion.component.js.map