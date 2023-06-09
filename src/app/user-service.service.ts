import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class UserServiceService {
  getProducts() {
    throw new Error('Method not implemented.');
  }
  getUser() {
    throw new Error('Method not implemented.');
  }
  updateStudent(email: any, value: any) {
    throw new Error('Method not implemented.');
  }
  deleteStudent(email: string) {
    throw new Error('Method not implemented.');
  }

  constructor(private http: HttpClient) { }
  login(user:any):Observable<any>{
    const options = new HttpHeaders({ 'Content-Type': 'application/json' });
    return this.http.get('http://localhost:8080/login', user);
  }
  register(user:any):Observable<any>{
    const options = new HttpHeaders({ 'Content-Type': 'application/json' });
    return this.http.post('http://localhost:8080/register', user, { headers: options });
  }
 
}
