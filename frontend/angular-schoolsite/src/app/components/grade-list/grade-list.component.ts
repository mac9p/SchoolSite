import { Component, OnInit } from '@angular/core';
import {Grade} from "../../common/grade";
import {GradeService} from "../../services/grade.service";

@Component({
  selector: 'app-grade-list',
  templateUrl: './grade-list.component.html',
  styleUrls: ['./grade-list.component.css']
})
export class GradeListComponent implements OnInit {
  grades!: Grade[];

  constructor(private gradeService: GradeService) { }

  ngOnInit(): void {
    this.getAllGrades();
  }

  getAllGrades(){
    this.gradeService.getAllGrades().subscribe(data => this.grades = data);
  }

}
