import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child-component',
  templateUrl: './child-component.component.html',
  styleUrls: ['./child-component.component.css']
})
export class ChildComponentComponent {
  @Input()
  msg:string ="";
  @Output() sentEventEmit = new EventEmitter();
  sentData(e:any)
  {
    console.log(e.target.value);
    this.sentEventEmit.emit(e.target.value);
  }

}
