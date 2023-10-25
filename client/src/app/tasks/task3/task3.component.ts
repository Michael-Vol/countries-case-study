import {Component, OnInit, ViewChild} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {MatPaginator} from "@angular/material/paginator";
import {MatTableDataSource} from "@angular/material/table";
import {Router} from "@angular/router";

export interface Info {
  continentName: string,
  regionName: string,
  countryName: string,
  year: number,
  population: number,
  gdp: number,
}

@Component({
  selector: 'app-task3',
  templateUrl: './task3.component.html',
  styleUrls: ['./task3.component.css']
})
export class Task3Component implements OnInit {
  displayedColumns: string[] = [
    'continentName',
    'regionName',
    'countryName',
    'year',
    'population',
    'gdp',
  ];
  info: Info[] = [];
  doneLoading: boolean = false;


  @ViewChild(MatPaginator) paginator!: MatPaginator;
  dataSource = new MatTableDataSource<Info>(this.info);

  constructor(private _httpClient: HttpClient, private router: Router) {
  }

  ngOnInit() {
  }

  ngAfterViewInit() {
    const res = this._httpClient.get('http://localhost:8080/countries/complete-info')
    res.subscribe((data: any) => {
      console.log(data);
      this.info = data;
      this.dataSource.data = this.info;
      this.doneLoading = true;
      this.dataSource.paginator = this.paginator;
    });
  }
}
