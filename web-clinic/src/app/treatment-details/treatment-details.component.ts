import { Component, OnInit } from '@angular/core';
import {ApiService} from "../shared/api.service";
import {Treatment} from "./model/treatment";

@Component({
  selector: 'app-treatment-details',
  templateUrl: './treatment-details.component.html',
  styleUrls: ['./treatment-details.component.css']
})
export class TreatmentDetailsComponent implements OnInit {
  treatments:Treatment[] = [];

  constructor(private apiService:ApiService) { }

  ngOnInit(): void {
    this.getAllTreatments();
  }

  public getAllTreatments(){
    this.apiService.getAllTreatments().subscribe(
      res => {
        this.treatments = res;
      },
      err => {
        alert("An error has occurred");
      }
    );
  }


}
