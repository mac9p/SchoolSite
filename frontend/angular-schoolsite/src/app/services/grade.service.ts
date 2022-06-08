import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Grade} from "../common/grade";

@Injectable({
  providedIn: 'root'
})
export class GradeService {
  private gradeUrl = "http://localhost:8080/grades"

  constructor(private httpClient: HttpClient) { }

  getAllGrades(): Observable<Grade[]>{
    const searchUrl = this.gradeUrl+"/all"
    return this.httpClient.get<Grade[]>(searchUrl);
  }
}
