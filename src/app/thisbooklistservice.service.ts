import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ThisbooklistserviceService {
  public cartitemlist :any=[];
  public booklist=new BehaviorSubject<any>([]);
  constructor() { }
  getbookproducts(){
    return this.booklist.asObservable();
  }
  setbookproduct(book :any){
    this.cartitemlist.push(...book);
    this.booklist.next(book);
  }
  addtocart(book :any){
    this.cartitemlist.push(book);
    this.booklist.next(this.cartitemlist);
    this.gettotalprice();
    console.log(this.cartitemlist);
  }
  gettotalprice():number{
    let grandtotal=0;
    this.cartitemlist.map((a:any)=>{
      grandtotal += a.total;
    })
    return grandtotal;
  }
    removecartitem(book :any){
      this.cartitemlist.map((a:any,index:any)=>{
        if(book.id===a.id){
          this.cartitemlist.splice(index,1);
        }
      })
      this.booklist.next(this.cartitemlist);
    }
    removeallcart(){
      this.cartitemlist=[];
      this.booklist.next(this.cartitemlist);
    }
}
