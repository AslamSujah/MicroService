import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NavigationComponent } from './navigation/navigation.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { PatientComponent } from './patient/patient.component';
import { DoctorComponent } from './doctor/doctor.component';
import {Router, RouterModule, Routes} from "@angular/router";
import { HomeComponent } from './home/home.component';
import { MedicineComponent } from './medicine/medicine.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { FormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";
import { PatientDetailsComponent } from './patient-details/patient-details.component';
import { TreatmentComponent } from './treatment/treatment.component';
import { HomepageDoctorsDetailsComponent } from './homepage-doctors-details/homepage-doctors-details.component';
import { TreatmentDetailsComponent } from './treatment-details/treatment-details.component';

const appRoutes: Routes = [
  {
    path:'doctor',
    component:DoctorComponent
  },
  {
    path:'patient',
    component:PatientComponent
  },
  {
    path: 'medicine',
    component:MedicineComponent
  },
  {
    path: 'login',
    component:LoginComponent
  },
  {
    path: 'signup',
    component:SignupComponent
  },
  {
    path: 'treatment',
    component:TreatmentComponent
  },
  {
    path:'',
    component:HomeComponent,
    pathMatch:'full'
  },
  {
    path:'**',
    component:NotFoundComponent
  }
];

@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    NotFoundComponent,
    PatientComponent,
    DoctorComponent,
    HomeComponent,
    MedicineComponent,
    LoginComponent,
    SignupComponent,
    PatientDetailsComponent,
    TreatmentComponent,
    HomepageDoctorsDetailsComponent,
    TreatmentDetailsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes, {enableTracing:true}),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
