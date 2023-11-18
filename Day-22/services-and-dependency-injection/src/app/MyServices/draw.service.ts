import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DrawService {
  private shape1:string ='';
  private color1:string = '';
  private shape2:string ='';
  private color2:string = '';
  
  constructor() { }
  setProperty1(shape:string, color:string)
  {
    this.shape1 = shape;
    this.color1 = color;
  }
  getShape1()
  {
    return this.shape1;
  }
  getColor1()
  {
    return this.color1;
  }
  setProperty2(shape:string, color:string)
  {
    this.shape2 = shape;
    this.color2 = color;
  }
  getShape2()
  {
    return this.shape2;
  }
  getColor2()
  {
    return this.color2;
  }

}
