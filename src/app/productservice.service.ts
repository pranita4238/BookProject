import { Injectable } from '@angular/core';
import { map } from 'rxjs/operators';
import { HttpClient , HttpHeaders} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductserviceService {


  constructor(private http:HttpClient) { }
  getbookProduct(){
    return this.http.get<any>("http://localhost:8080/getBookProduct")
    .pipe(map((res:any)=>{
      return res;
    }))
  }
}
