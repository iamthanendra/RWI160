import { Component, Output } from '@angular/core';

@Component({
  selector: 'app-parent-component',
  templateUrl: './parent-component.component.html',
  styleUrls: ['./parent-component.component.css']
})
export class ParentComponentComponent {
  parentMsg:string = "Write Here";
  childMessage:string="child msg";
  receiveEventEmit(msg:any)
  {
    console.log("from "+msg);
    this.childMessage = msg;
  }
}
