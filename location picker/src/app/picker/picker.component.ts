import { Component, NgModule } from '@angular/core';
import { Angular2Txt } from 'angular2-txt/Angular2-txt';
import { saveAs } from 'file-saver/FileSaver';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Injectable } from '@angular/core';

@Component({
  selector: 'app-picker',
  templateUrl: './picker.component.html',
  styleUrls: ['./picker.component.css']
})
export class PickerComponent {
  latitude = 6.914834928510645;
  longitude = 79.97314095497131;
  locationChosen = true;
  constructor(private http:HttpClient) { }
  onChoseLocation(event) {
    this.latitude = event.coords.lat;
    this.longitude = event.coords.lng;
    this.locationChosen = true;
    var data =
      {
        latitude: this.latitude,
        longitude: this.longitude
      }
      
      this.addlocation(data).subscribe(res => {
          
       
  
  
  },err=> {
   
  
    });

  }
  addlocation(location:any){
    const headers = new HttpHeaders({'Content-Type': 'application/json; charset=utf-8'});
    //headers.append('authorization',token);
    return this.http.post('http://localhost:3000/location/',location, { headers: headers})
  }


}
