import { Component, ElementRef, ViewChild } from '@angular/core';
import { ChildComponent } from './child/child.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  inputValue!:string;
  @ViewChild('myBox') myBox!:ElementRef;

  @ViewChild(ChildComponent) childComponent!:ChildComponent

  changeValue(input:any)
  {
    console.log(input)
    this.inputValue = input.value;
  }
  changeValue1()
  {
    console.log(this.myBox);
    console.log(this.myBox.nativeElement);
    this.inputValue = this.myBox.nativeElement.value;
    console.log()
    // console.log(input)
    // this.inputValue = input.value;
  }
  changeChildValue()
  {
    console.log(this.childComponent);
    this.childComponent.username = "Thanendra Kashyap";
  }
  callChildMethod()
  {
    console.log(this.childComponent);
    this.childComponent.alertUserName();
  }
}
