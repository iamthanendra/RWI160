import { Component, OnDestroy, OnInit, DoCheck, AfterContentInit, AfterContentChecked,AfterViewInit, AfterViewChecked , ContentChild } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit, OnDestroy, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked  {
  isChild!:boolean;
  parentValue!:string;

  @ContentChild('projectedContent') projectedContent:any;

  toggle():void{
    this.isChild = !this.isChild;
  }

  constructor(){
    console.log("Parent Constructor Called");
  }
  ngOnInit(): void {
    console.log("Parent On Init Called");
    console.log('On Init - '+this.projectedContent);
  }

  ngDoCheck(): void {
    console.log("Parent DoCheck Called");
    console.log('Do Check - '+ this.projectedContent);
  }
  

  ngAfterContentInit(): void {
    console.log("Parent : In After Content Init");
    console.log('After Content Init - '+this.projectedContent);
  }
  ngAfterContentChecked(): void {
    console.log('Parent After Content Checked');
  }
  
  ngAfterViewInit(): void {
    console.log("Parent AfterView Init");
  }
  ngAfterViewChecked(): void {
    console.log("Parent After View Checked");
  }
  ngOnDestroy(): void {
    console.log("Parent On Destroy is called");
    console.log('On Destroy - '+this.projectedContent);
  }

}
