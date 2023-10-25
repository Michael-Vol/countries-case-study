import {Component} from '@angular/core';
import {MatCardModule} from "@angular/material/card";
import {CommonModule} from "@angular/common";
import {MatListModule} from "@angular/material/list";
import {HttpClient} from "@angular/common/http";
import {ActivatedRoute, RouterLink} from "@angular/router";
import {MatIconModule} from "@angular/material/icon";

@Component({
  selector: 'app-langs',
  templateUrl: './langs.component.html',
  styleUrls: ['./langs.component.css'],
  standalone: true,
  imports: [CommonModule, MatCardModule, MatListModule, MatIconModule, RouterLink],
})
export class LangsComponent {
  constructor(private _httpClient: HttpClient, private route: ActivatedRoute) {
  }

  ngOnInit() {
  }

  id: number = NaN;
  dataSource: any = {};

  ngAfterViewInit() {
    this.route.params.subscribe(params => this.id = params['id']);
    const res = this._httpClient.get(`http://localhost:8080/country-languages?countryId=${this.id}`);
    res.subscribe((data: any) => {
      if ('languages' in data) {
        console.log(data);
        this.dataSource.languages = data.languages;
        this.dataSource.countryName = data.countryName;
      }
    });
  }
}
