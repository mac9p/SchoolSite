import {Component, OnInit} from '@angular/core';
import {Grade} from "../../common/grade";
import {GradeService} from "../../services/grade.service";
import {StudentService} from "../../services/student.service";
import {SchoolSubjectService} from "../../services/school-subject.service";
import {Student} from "../../common/student";
import {SchoolSubject} from "../../common/school-subject";
import {Subject} from "rxjs";

@Component({
  selector: 'app-grade-list',
  templateUrl: './grade-list.component.html',
  styleUrls: ['./grade-list.component.css']
})
export class GradeListComponent implements OnInit {
  grades!: Grade[];

  constructor(private gradeService: GradeService) {
  }

  ngOnInit(): void {
    this.getAllGrades();
  }

  getAllGrades() {
    this.gradeService.getAllGrades().subscribe(data => this.grades = data);
  }


  /* getStudentCredentialsByGradeId(id:number): String{
     let student = new Student();
     this.studentService.findStudentByGradeId(id).subscribe(data => student = data);
     return student.firstName+" "+student.lastName;
   }

   getSubjectNameByGradeId(id:number): String{
     let subject = new SchoolSubject();
     this.schoolSubjectService.getSchoolSubjectByGradeId(id).subscribe(data => subject = data);
     return subject.name;
   }*/
  //TODO optimize

}
