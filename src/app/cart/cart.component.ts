import { Component,OnInit } from '@angular/core';
import { ThiscartserviceService } from '../thiscartservice.service';
@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements  OnInit {
  public product:any=[];
  public grandtotal !:number;
  constructor(private cartservice :ThiscartserviceService) { }

  ngOnInit(): void {
    this.cartservice.getproducts()
    .subscribe((res: any)=>{
      this.product=res;
      this.grandtotal=this.cartservice.gettotalprice();
    })
  }
  removeitem(item:any){
    this.cartservice.removecartitem(item);
  }
  emptycart(){
    this.cartservice.removeallcart();
  }

}
