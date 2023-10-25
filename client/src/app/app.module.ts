import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppComponent} from './app.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {RoutingModule} from "./routing.module";
import {Task1Component} from "./tasks/task1/task1.component";
import {Task2Component} from "./tasks/task2/task2.component";
import {Task3Component} from "./tasks/task3/task3.component";

@NgModule({
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    RoutingModule,
  ],
  declarations: [
    AppComponent,
    Task1Component,
    Task2Component,
    Task3Component
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
