import { Component, OnInit } from '@angular/core';
import { ServiceComponentService } from '../service-component.service'
import { DataService } from '../data.service';
import { Product } from './Product';
import {Form , FormGroup ,FormControl} from '@angular/forms';
import { AvailableCity} from './availablecity'
@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css'],
  providers: [ServiceComponentService, DataService]
})
export class ProductComponent implements OnInit {

  productEdited: boolean = false;
  info: string = '';
  product: Product;


  ProductData = [];

  // productId: string;
  // productName: string;
  // productCategory: string;
  // availablecity: string;
  // price: number;


  productId: string;
  productName: string;
  productCategory: string;
  price: number;
  public availablecity : AvailableCity[] =  [
    { value :'Mumbai' , display :'Mumbai'},
    { value :'Delhi' , display :'Delhi'},
    { value :'Bangalore' , display :'Bangalore'},
    { value :'Pune' , display :'Pune'},
    { value :'Chennai' , display :'Chennai'}
  ]
  

  // availablecity =['Mumbai','Delhi','Bangalore','Pune','Chennai'];
  // city = this.availablecity[0];
  // availablecity : Array<{string}>

  constructor(private _service: ServiceComponentService, private _dataService: DataService) { }

  ngOnInit() {
    return this._service.getProduct().subscribe(resPro => this.ProductData = resPro.product);
  }
  onUpdateProduct(product: Product) {
    console.log(product.availablecity);
    this.product = {
      "productId": this.productId = product.productId,
      "productName": this.productName = product.productName,
      "productCategory": this.productCategory = product.productCategory,
      "price": this.price = product.price,
      "availablecity": [{this.availablecity.value}] 
                        // this.availablecity[1],
                        // this.availablecity[2],
                        // this.availablecity[3],
                        // this.availablecity[4]]

    }

  }

  // updateProduct() {
  //   this.product = {
  //     "productId": this.productId,
  //     "productName": this.productName,
  //     "productCategory": this.productCategory,
  //     "price": this.price,
  //     "availablecity": this.availablecity.values
  //   }
  //   this._dataService.updateProduct(this.product).subscribe(() => {
  //     this.productEdited = true,
  //       console.log("user is updated");
  //     this.info = 'Product' + this.product.productId + 'is successfully updated';
  //   })
  // }


  onDeleteProduct(productId: string) {
    this.productId = productId;
  }
  removeProduct() {
    this._dataService.deleteProduct(this.productId).subscribe(() => {
      console.log("data deleted");
      this._service.getUser().subscribe(resUser => this.ProductData = resUser.user);
      location.reload();
    })
  }

  // createProduct() {
  //   this.product = {
  //     "productId": this.productId,
  //     "productName": this.productName,
  //     "productCategory": this.productCategory,
  //     "price": this.price,
  //     "availablecity": this.availablecity.values
  //   }
  //   this._dataService.createProduct(this.product).subscribe(()=>{
  //     console.log("User" +this.product.productId+"was created successfully");
  //   })
  // }

}