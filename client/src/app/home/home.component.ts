import {Component} from '@angular/core';
import {CommonModule} from '@angular/common';
import {MatCardModule} from "@angular/material/card";
import {MatIconModule} from "@angular/material/icon";
import {Router, RouterLink} from "@angular/router";

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule, MatCardModule, MatIconModule, RouterLink],
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  constructor(private router: Router) {
  }

  async goToTaskPage(pageName: number) {
    const res = await this.router.navigate([`/tasks/${pageName}`]);
    console.log(res ? `Navigated to task ${pageName}` : 'Navigation failed');
  }

  async goToRoot() {
    const res = await this.router.navigate(['/']);
    console.log(res ? 'Navigated to root' : 'Navigation failed');
  }
}
