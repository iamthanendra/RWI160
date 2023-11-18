import { Component } from '@angular/core';
import { DrawService } from '../MyServices/draw.service';

@Component({
  selector: 'app-second-component',
  templateUrl: './second-component.component.html',
  styleUrls: ['./second-component.component.css']
})
export class SecondComponentComponent {
  shape!:string;
  color!:string;
  shapeClass:string ="";
  colorClass:string ="";
  drawservice!: DrawService;
  
  constructor(_drawservice:DrawService)
  {
    this.drawservice = _drawservice;
    setInterval(() => {
      this.colorClass = this.drawservice.getColor1();
      this.shapeClass = this.drawservice.getShape1();
      console.log('second');
      // return
    }, 500);
  }
  draw()
  {
    this.colorClass = this.drawservice.getColor1();
    this.shapeClass = this.drawservice.getShape1();

    this.drawservice.setProperty2(this.shape, this.color);
  }
}
