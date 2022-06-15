import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {SchoolSubject} from "../common/school-subject";

@Injectable({
  providedIn: 'root'
})
export class SchoolSubjectService {
  private baseUrl = "http:localhost:8080/subjects";

  constructor(private httpClient: HttpClient) {
  }

  getAllSubjects(): Observable<SchoolSubject[]>{
    const searchUrl = this.baseUrl+"/all";
    return this.httpClient.get<SchoolSubject[]>(searchUrl);
  }

  getSchoolSubjectByGradeId(id:number): Observable<SchoolSubject>{
    const searchUrl = this.baseUrl+"/id?="+id;
    return this.httpClient.get<SchoolSubject>(searchUrl);
  }

}
