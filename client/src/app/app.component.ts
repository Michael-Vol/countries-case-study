import { Component } from '@angular/core';
import {HomeComponent} from "./home/home.component";
import {NgSwitch, NgSwitchCase} from "@angular/common";

@Component({
  selector: 'app-root',
  standalone: true,
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  imports: [HomeComponent, NgSwitch, NgSwitchCase]
})
export class AppComponent {
  title = 'client';
}
