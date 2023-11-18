import { Component, OnChanges, ContentChild, OnDestroy, OnInit, SimpleChanges, Input, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit, OnDestroy, OnChanges, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked {
  timeinterval!:any;

  @Input() channelName!:string;

  @ContentChild('projectedContent') projectedContent:any;

  constructor(){
    console.log("Child Constructor Called");
    let i = 0;
    this.timeinterval = setInterval(()=>{
      
      console.log(i++);
    }, 1500);

    // this.timeinterval();
  }
  ngOnInit(): void {
    console.log("Child On Init Called ");
    console.log('On Init - '+this.projectedContent);

  }

  ngDoCheck(): void {
    console.log("Child DoCheck Called");
    console.log('Do Check - '+ this.projectedContent);
  }

  ngAfterContentInit(): void {
    console.log("Child : In After Content Init");
    console.log('After Content Init - '+this.projectedContent);
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log("Child On changes called : ");
    console.log(changes);
    console.log('On Changes - '+this.projectedContent);
  }
  ngAfterContentChecked(): void {
    console.log('Child After Content Checked');
  }
  ngAfterViewInit(): void {
    console.log("Child AfterView Init");
  }
  ngAfterViewChecked(): void {
    console.log("Child After View Checked");
  }
  ngOnDestroy(): void {
    console.log("Child On Destroy is called");
    clearInterval(this.timeinterval);
  }
}
