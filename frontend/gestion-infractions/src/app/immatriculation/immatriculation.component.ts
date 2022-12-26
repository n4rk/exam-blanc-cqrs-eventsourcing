import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http"

@Component({
  selector: 'app-immatriculation',
  templateUrl: './immatriculation.component.html',
  styleUrls: ['./immatriculation.component.css']
})
export class ImmatriculationComponent implements OnInit {

  vehicles: any
  b:any;

  constructor(private http:HttpClient) { }

  ngOnInit(): void {
    this.http.get("http://localhost:9999/IMMATRICULATION-QUERY-SERVICE/query/vehicles/all").subscribe({
      next : (data)=>{
        this.vehicles = data;
      },
      error : (err) =>{

      }
    });
  }
  displayStyle = "none";

  closePopup() {
    this.displayStyle = "none";
  }
  openPopup(v:any ) {
    this.b = v;
    console.log(this.b)

    this.displayStyle = "block";
  }

}
