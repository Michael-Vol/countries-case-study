import {Component, OnInit, ViewChild} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {MatPaginator} from "@angular/material/paginator";
import {MatTableDataSource} from "@angular/material/table";
import {Router} from "@angular/router";

export interface Country {
  id: number,
  name: string,
  area: number,
  countryCode2: string,
  nationalDay: string,
}

@Component({
  selector: 'app-task1',
  templateUrl: './task1.component.html',
  styleUrls: ['./task1.component.css']
})
export class Task1Component implements OnInit {
  displayedColumns: string[] = [
    'id',
    'name',
    'area',
    'countryCode3'
  ];
  countries: Country[] = [];

  // dataSource: Country[] = [];

  @ViewChild(MatPaginator) paginator!: MatPaginator;
  dataSource = new MatTableDataSource<Country>(this.countries);

  constructor(private _httpClient: HttpClient, private router: Router) {
  }

  ngOnInit() {
  }

  ngAfterViewInit() {
    this.dataSource.paginator = this.paginator;
    const res = this._httpClient.get('http://localhost:8080/countries')
    res.subscribe((data: any) => {
      if ('countries' in data) {
        console.log(data);
        this.countries = data.countries;
        this.dataSource.data = this.countries;
      }
    });
  }

  async goToLangsPage(id: number) {
    const res = await this.router.navigate([`/tasks/1/langs/${id}`]);

  }
}
