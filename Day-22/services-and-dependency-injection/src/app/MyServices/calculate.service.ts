import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CalculateService {
  constructor() { }
  add(n1:number, n2:number)
  {
    return Number.parseInt(""+n1) + Number.parseInt(""+n2);
  }

}
