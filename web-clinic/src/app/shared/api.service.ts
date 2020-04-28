import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Patient} from "../patient-details/model/patient";
import {PatientViewModel} from "../patient/patient.component";
import {Treatment} from "../treatment-details/model/treatment";

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  private BASE_URL_PATIENT = "http://localhost:33209/services";
  private BASE_URL_TREATMENT = "http://localhost:7656/services";
  private ALL_PATIENT_URL = `${this.BASE_URL_PATIENT}\\patients`;
  private SAVE_PATIENT_URL = `${this.BASE_URL_PATIENT}\\patient`;
  private ALL_TREATMENT_URL = `${this.BASE_URL_TREATMENT}\\treatments`;

  constructor(private http:HttpClient) {
  }

  getAllPatients() : Observable<Patient[]>{
    return this.http.get<Patient[]>(this.ALL_PATIENT_URL);
  }

  savePatient(patient: PatientViewModel) : Observable<any>{
    return this.http.post(this.SAVE_PATIENT_URL, patient);
  }

  getAllTreatments() : Observable<Treatment[]>{
    return this.http.get<Treatment[]>(this.ALL_TREATMENT_URL);
  }
}
