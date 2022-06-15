import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Student} from "../common/student";

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  baseUrl = "http:localhost:8080/students"
  constructor(private httpClient: HttpClient) { }

  getAllStudents(): Observable<Student[]>{
    const searchUrl = this.baseUrl+"/all";
    return this.httpClient.get<Student[]>(searchUrl);
  }

  findStudentByGradeId(id: number): Observable<Student>{
      const searchUrl = this.baseUrl + "/id?=" + id;
      return this.httpClient.get<Student>(searchUrl);
    }
}
