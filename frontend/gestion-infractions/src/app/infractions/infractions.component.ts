import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Component({
  selector: 'app-infractions',
  templateUrl: './infractions.component.html',
  styleUrls: ['./infractions.component.css']
})
export class InfractionsComponent implements OnInit {

  infractions : any
  idCard:any;
  currentPage : number =0;
  pageSize : number =5;

  constructor(private http:HttpClient) { }

  ngOnInit(): void {}

  onClickSubmit() {
    console.log()
    this.http.get("http://localhost:9999/INFRACTION-QUERY-SERVICE/query/allInfractions?ncid="+this.idCard+"&page="+this.currentPage+"&size="+this.pageSize).subscribe({
      next : (data)=>{
        console.log(data)
        this.infractions = data;
      },
      error : (err) =>{

      }
    });

  }
  gotoPage(page: number) {
    this.currentPage=page;
    this.onClickSubmit();
  }

}
