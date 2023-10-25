import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RouterModule} from "@angular/router";
import {LangsComponent} from './task1/langs/langs.component';
import {MatCardModule} from "@angular/material/card";

@NgModule({
  declarations: [
    LangsComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    MatCardModule,

  ]
})
export class TasksModule {
}
