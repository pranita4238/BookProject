import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ThiscartserviceService } from '../thiscartservice.service';
import { UserServiceService } from '../user-service.service';
import { ProductserviceService } from '../productservice.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit{
  bookList: any;
  constructor(private api:ProductserviceService,private cartservice:ThiscartserviceService) { }
  ngOnInit():  void {
    this.api.getbookProduct()
    .subscribe(res=>{
      this.bookList=res;
      this.bookList.forEach((a:any)=>{
        Object.assign(a,{quantity:1,total:a.price});
      })
    })
  }
addtocart(item:any){
  this.cartservice.addtocart(item);
}
}


