import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';


@Component({
  selector: 'app-direction',
  templateUrl: './direction.component.html',
  styleUrls: ['./direction.component.css']
})
export class DirectionComponent implements OnInit {

  constructor(private http:HttpClient) {
    this.getDestination(); 
  }

  public lat: Number = 24.799448
  public lng: Number = 120.979021

  public longti:Number;
  public latitu:Number; 
  
  public input:any;
  public origin: {}
  public destination:  {}

  public latt: Number ;
  public lonn: Number;
  public waypoints: object = []

  public provideRouteAlternatives: boolean = true
  public travelMode: string = 'DRIVING'
  
   
  ngOnInit() {
    
    
  }
   

  getDestination(){
    const headers = new HttpHeaders({'Content-Type': 'application/json; charset=utf-8'});
    
    this.http.get('http://localhost:3000/location/', { headers: headers})
    .subscribe((data) =>{
      this.input=data;

      this.latitu=Number(this.input.latitude);
      this.longti=Number(this.input.longitude);

      this.origin = { lat: 6.914834928510645, lng: 79.97314095497131 }
      this.destination = { lat:Number(this.latitu) , lng: Number(this.longti) }

       console.log(this.latitu);
       console.log(this.longti);

      //  this.latt = encodeURIComponent(JSON.stringify({type: 'float', value: this.input.latitude.toString()}));
      // this.lonn = encodeURIComponent(JSON.stringify({type: 'float', value: this.input.longitude.toString()}));
      
    })
  }

}
