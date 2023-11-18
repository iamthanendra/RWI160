import { Component, Output } from '@angular/core';

@Component({
  selector: 'app-component1',
  templateUrl: './component1.component.html',
  styleUrls: ['./component1.component.css']
})
export class Component1Component {
  
  @Output()
  elementProperty:string = '';
  eventValue:string = "";
  selectedElements(element:string)
  {
    console.log(element)
    this.elementProperty = element;
  }
  showEventValue(e:string)
  {
    this.eventValue = "Selected Value is "+e;
  }
}
