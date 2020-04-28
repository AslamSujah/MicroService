import { Component, OnInit } from '@angular/core';
import {Patient} from "./model/patient";
import {ApiService} from "../shared/api.service";

@Component({
  selector: 'app-patient-details',
  templateUrl: './patient-details.component.html',
  styleUrls: ['./patient-details.component.css']
})
export class PatientDetailsComponent implements OnInit {
  patients: Patient[] = [];

  constructor(private apiService:ApiService) { }

  ngOnInit(): void {
    this.getAllPatients();
  }

  public getAllPatients(){
    this.apiService.getAllPatients().subscribe(
      res => {
        this.patients = res;
      },
      err => {
        alert("An error has occurred");
      }
    );
  }

}
