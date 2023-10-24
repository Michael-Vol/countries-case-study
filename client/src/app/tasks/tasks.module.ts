import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {Task1Component} from './task1/task1.component';
import {Task2Component} from './task2/task2.component';

@NgModule({
  declarations: [
    Task1Component,
    Task2Component
  ],
  imports: [
    CommonModule
  ]
})
export class TasksModule {
}
