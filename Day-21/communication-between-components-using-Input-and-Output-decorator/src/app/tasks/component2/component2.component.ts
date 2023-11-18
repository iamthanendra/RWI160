import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Fruits } from 'src/app/Fruits';

@Component({
  selector: 'app-component2',
  templateUrl: './component2.component.html',
  styleUrls: ['./component2.component.css']
})
export class Component2Component {
  fruits:Fruits[] = [];
  @Input()  selectedElement:string = '';
  @Output() sentEventEmitter = new EventEmitter();
  constructor()
  {
    this.fruits = [
      {"name":"Green","property":"color"},
      {"name":"Dog","property":"animal"},
      {"name":"Apple","property":"fruit"},
      {"name":"Mango","property":"fruit"},
      {"name":"Yellow","property":"color"},
      {"name":"Cat","property":"animal"},
      {"name":"Blue","property":"color"},
      {"name":"Red","property":"color"},
      {"name":"Cow","property":"animal"},
      {"name":"Goat","property":"animal"},
      {"name":"Black","property":"color"},
      {"name":"Banana","property":"color"},
      {"name":"Cherry","property":"fruit"}
    ];
  }
  updateElement(element:string)
  {
    this.sentEventEmitter.emit(element);
  }
  

}
