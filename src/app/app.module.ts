import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';

import { LoginComponent } from './login/login.component';
import { FooterComponent } from './footer/footer.component';
import { BookComponent } from './book/book.component';
import { BookorderComponent } from './bookorder/bookorder.component';
import { OrdersComponent } from './orders/orders.component';
import { ProductComponent } from './product/product.component';
import { CartComponent } from './cart/cart.component';
import { RegistrationComponent } from './registration/registration.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    LoginComponent,
    RegistrationComponent,
    ProductComponent,
    BookComponent,
    FooterComponent,
    BookComponent,
    BookorderComponent,
    OrdersComponent,
    ProductComponent,
    CartComponent,
    RegistrationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
