import { Component, Input } from '@angular/core';
import { CalculateService } from './MyServices/calculate.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'p2';
  no1!:number;
  no2!:number;
  total!:number
  calculator:CalculateService;
  constructor(private _Calculateservice:CalculateService)
  {
    this.calculator = _Calculateservice;
  }
  sum()
  {
    console.log(this.no1+" - "+this.no2);
    this.total = this.calculator.add(this.no1, this.no2);
  }
}
