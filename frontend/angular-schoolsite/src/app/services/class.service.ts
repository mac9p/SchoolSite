import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {SchoolClass} from "../common/school-class";

@Injectable({
  providedIn: 'root'
})
export class ClassService {

  private classUrl = "http://localhost:8080/classes"

  constructor(private httpClient: HttpClient) { }

  getAllClasses(): Observable<SchoolClass[]>{
    const searchUrl = this.classUrl+"/all"
    return this.httpClient.get<SchoolClass[]>(searchUrl);
  }

}

