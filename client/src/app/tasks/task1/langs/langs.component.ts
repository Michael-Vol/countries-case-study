import {Component} from '@angular/core';
import {MatCardModule} from "@angular/material/card";
import {CommonModule} from "@angular/common";
import {MatListModule} from "@angular/material/list";

@Component({
  selector: 'app-langs',
  templateUrl: './langs.component.html',
  styleUrls: ['./langs.component.css'],
  standalone: true,
  imports: [CommonModule, MatCardModule, MatListModule],
})
export class LangsComponent {

}
