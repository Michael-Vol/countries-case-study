import {Component, OnInit, ViewChild} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {MatPaginator} from "@angular/material/paginator";
import {MatTableDataSource} from "@angular/material/table";
import {Router} from "@angular/router";

export interface Stats {
  id: number,
  name: string,
  countryCode3: string,
  year: number,
  population: number,
  gdp: number,
  ratio: number
}

@Component({
  selector: 'app-task2',
  templateUrl: './task2.component.html',
  styleUrls: ['./task2.component.css']
})
export class Task2Component implements OnInit {
  displayedColumns: string[] = [
    'id',
    'name',
    'countryCode3',
    'year',
    'population',
    'gdp',
    'ratio'
  ];
  stats: Stats[] = [];


  @ViewChild(MatPaginator) paginator!: MatPaginator;
  dataSource = new MatTableDataSource<Stats>(this.stats);

  constructor(private _httpClient: HttpClient, private router: Router) {
  }

  ngOnInit() {
  }

  ngAfterViewInit() {
    this.dataSource.paginator = this.paginator;
    const res = this._httpClient.get('http://localhost:8080/country-stats')
    res.subscribe((data: any) => {
      if ('countryStats' in data) {
        console.log(data);
        this.stats = data.countryStats;
        this.dataSource.data = this.stats;
      }
    });
  }
}
