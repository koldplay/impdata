import { Component ,OnInit } from '@angular/core';
import { ProductService } from './product.service';
@Component({

    selector: 'product-data',
    templateUrl: 'app/productdata.component.html'  

})
export class ProductDataComponent implements OnInit {

    
    Product = [];
    
    constructor(private _productservice : ProductService){}

    ngOnInit(){
       this._productservice.getUser().subscribe(resProductData => this.Product  = resProductData);     
    }
 }
