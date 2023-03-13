import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, NgForm ,Validators} from '@angular/forms';
import { Router } from '@angular/router';

import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent  {
 
  loginForm!: FormGroup;

  constructor(private formBuilder: FormBuilder,private service:UserServiceService ,private router:Router ) { }
  ngOnInit() {
    this.loginForm = this.formBuilder.group({
      email: ['', [Validators.required,Validators.email]],
      password:['',Validators.required]

    });
  }
  login()
  {
    this.service.login(this.loginForm.value).subscribe({
      next(value) {
        console.log(value);
        //this.error(console.log);
        alert("hii");

      },
    })
  this.router.navigate(['/']);
  }
}

