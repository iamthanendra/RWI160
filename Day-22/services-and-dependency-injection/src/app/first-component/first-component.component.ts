import { Component } from '@angular/core';
import { DrawService } from '../MyServices/draw.service';

@Component({
  selector: 'app-first-component',
  templateUrl: './first-component.component.html',
  styleUrls: ['./first-component.component.css']
})
export class FirstComponentComponent {
  shape!:string;
  color!:string;
  shapeClass:string = "";
  colorClass:string = "";
  drawservice!: DrawService;

  constructor(_drawservice:DrawService)
  {
    this.drawservice = _drawservice;
    this.colorClass = this.drawservice.getColor2();
    this.shapeClass = this.drawservice.getShape2();
    setInterval(() => {
      this.colorClass = this.drawservice.getColor2();
      this.shapeClass = this.drawservice.getShape2();
      console.log("first");
      // return
    }, 500);
  }
  draw()
  {
    this.colorClass = this.drawservice.getColor2();
    this.shapeClass = this.drawservice.getShape2();

    this.drawservice.setProperty1(this.shape, this.color);

    console.log(this.color+" "+this.shape);
    console.log(this.colorClass+" "+this.shapeClass);
  }
}
