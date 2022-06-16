import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Attention} from "../common/attention";

@Injectable({
  providedIn: 'root'
})
export class AttentionService {
  private attentionUrl = "http://localhost:8080/attentions";

  constructor(private httpClient: HttpClient) {
  }


  getAllAttentions(): Observable<Attention[]>{
    const searchUrl = this.attentionUrl+"/all";
    return this.httpClient.get<Attention[]>(searchUrl);
}

}
