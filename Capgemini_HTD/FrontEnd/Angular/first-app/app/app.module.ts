import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';

import { AppComponent } from './app.component';
import {HeaderComponent} from './header/header.component';
import { HomeComponent } from './home/home.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AboutComponent } from './about/about.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { NatureComponent } from './nature/nature.component';
import { FlowersComponent } from './flowers/flowers.component';
import { SkyComponent } from './sky/sky.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    ContactUsComponent,
    LoginComponent,
    RegisterComponent,
    AboutComponent,
    PageNotFoundComponent,
    NatureComponent,
    FlowersComponent,
    SkyComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path :'',component :HomeComponent},
      {path :'about', component:AboutComponent, children :[
        {path :'nature',component:NatureComponent},
        {path :'flowers', component:FlowersComponent},
        {path :'sky', component:SkyComponent}
      ]},
      {path : 'login', component :LoginComponent},
      {path :'register', component :RegisterComponent},
      {path:'contact-us', component :ContactUsComponent},
      {path :'**',component:PageNotFoundComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { 
  
}
