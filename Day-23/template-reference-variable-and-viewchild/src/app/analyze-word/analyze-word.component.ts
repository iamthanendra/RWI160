import { Component, ViewChild, ElementRef, OnInit, AfterContentChecked } from '@angular/core';

@Component({
  selector: 'app-analyze-word',
  templateUrl: './analyze-word.component.html',
  styleUrls: ['./analyze-word.component.css']
})
export class AnalyzeWordComponent implements OnInit {
  @ViewChild('myinput') myinput!:ElementRef;
  @ViewChild('result') result!:ElementRef;

  @ViewChild('characterCount') characterCount!: ElementRef;
  @ViewChild('a') a !: ElementRef;
  @ViewChild('e') e !: ElementRef;
  @ViewChild('i') i !: ElementRef;
  @ViewChild('o') o !: ElementRef;
  @ViewChild('u') u !: ElementRef;

  ngOnInit(): void {
    
  }
  ngAfterContentInit(){
    this.result.nativeElement.style.display = "none";
  }
  constructor()
  {
    // this.result.nativeElement.style.display = "none";
  }
  analyzInput()
  {
    let a = 0, e = 0, i = 0, o = 0, u = 0;
    if(this.myinput.nativeElement.value.trim().length == 0)
    {
      this.result.nativeElement.style.display = "none";
      return;
    }

    this.result.nativeElement.style.display = "block";
    for(let letter of this.myinput.nativeElement.value)
    {
      console.log(letter);
      if(letter == 'a' || letter == 'A') a++;
      if(letter == 'e' || letter == 'E') e++;
      if(letter == 'i' || letter == 'I') i++;
      if(letter == 'o' || letter == 'O') o++;
      if(letter == 'u' || letter == 'U') u++;
    }
    
    //Assigning Value
    this.characterCount.nativeElement.innerText = this.myinput.nativeElement.value.trim().length;
    this.a.nativeElement.innerText = a;
    this.e.nativeElement.innerText = e;
    this.i.nativeElement.innerText = i;
    this.o.nativeElement.innerText = o;
    this.u.nativeElement.innerText = u;
  }
}
