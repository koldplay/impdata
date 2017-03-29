import {Component , OnInit} from '@angular/core';

import {UserService} from  './user.service';

import {ProductService} from './product.service';


@Component({

    selector : 'my-app',
    templateUrl : 'app/app.component.html',
    providers : [UserService , ProductService]
 })
export class AppComponent {


}
