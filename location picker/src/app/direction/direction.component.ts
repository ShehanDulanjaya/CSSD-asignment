import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-direction',
  templateUrl: './direction.component.html',
  styleUrls: ['./direction.component.css']
})
export class DirectionComponent implements OnInit {

  constructor() { }

  public lat: Number = 24.799448
  public lng: Number = 120.979021
   
  public origin: {  }
  public destination:  {  }

   
  ngOnInit() {
    this.getDirection()
  }
   
  getDirection() {
    this.origin = { lat: 6.914834928510645, lng: 79.97314095497131 }
    this.destination = { lat: 6.906617039550348, lng: 79.9000389068625 }
    
    // this.origin = 'Taipei Main Station'
    // this.destination = 'Taiwan Presidential Office'
  }

}
