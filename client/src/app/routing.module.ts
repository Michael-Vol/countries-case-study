import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {Task2Component} from "./tasks/task2/task2.component";
import {Task3Component} from "./tasks/task3/task3.component";
import {BrowserModule} from "@angular/platform-browser";
import {HomeComponent} from "./home/home.component";
import {Task1Component} from "./tasks/task1/task1.component";

const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'tasks/1',
    component: Task1Component
  },
  {
    path: 'tasks/2',
    component: Task2Component
  },
  {
    path: 'tasks/3',
    component: Task3Component
  }
];

@NgModule({
  imports: [BrowserModule, RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class RoutingModule {
}
