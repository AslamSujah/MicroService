import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-treatment',
  templateUrl: './treatment.component.html',
  styleUrls: ['./treatment.component.css']
})
export class TreatmentComponent implements OnInit {
  TreatmentModel:TreatmentViewModel = {
    patientId:null,
    doctorId:null,
    medicineId:null,
    symptom:'',
    disease:'',
    date:''
  };

  constructor() { }

  ngOnInit(): void {
  }

  sendTreatment():void{

  }

}

export interface TreatmentViewModel {
  patientId:number;
  doctorId:number;
  medicineId:number;
  symptom:string;
  disease:string;
  date:string;
}
