import { Component, OnInit } from '@angular/core';
import {ApiService} from "../shared/api.service";

@Component({
  selector: 'app-patient',
  templateUrl: './patient.component.html',
  styleUrls: ['./patient.component.css']
})
export class PatientComponent implements OnInit {
  patientModel:PatientViewModel = {
    name:'',
    age:'',
    gender:'',
    contactNo:''
  };

  constructor(private apiService:ApiService) {
  }

  ngOnInit(): void {
  }

  sendPatient():void{
    this.apiService.savePatient(this.patientModel).subscribe(
      response => {
        location.reload();
      },
      error => {
        alert("An error has occurred while add patient");
      }
    );
  }
}

export interface PatientViewModel {
  name:string;
  age:string;
  gender:string;
  contactNo:string;
}
