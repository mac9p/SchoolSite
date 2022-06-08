import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ActionMenuComponent } from './components/action-menu/action-menu.component';
import {RouterModule, Routes} from "@angular/router";
import { GradeListComponent } from './components/grade-list/grade-list.component';
import {GradeService} from "./services/grade.service";
import {HttpClientModule} from "@angular/common/http";

const routes: Routes = [
  {path: "grades",component: GradeListComponent},
  {path: "",component: AppComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    ActionMenuComponent,
    GradeListComponent
  ],
  imports: [
    HttpClientModule,
    RouterModule.forRoot(routes),
    BrowserModule,
    AppRoutingModule
  ],
  providers: [GradeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
