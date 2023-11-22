import { Component, ViewChild, } from '@angular/core';

@Component({
  selector: 'app-template-driven-form',
  templateUrl: './template-driven-form.component.html',
  styleUrls: ['./template-driven-form.component.css']
})
export class TemplateDrivenFormComponent {
  username:string = "";
  useremail:string = "";


  @ViewChild('myForm', {static: true}) myform:any;

  onSubmit(myForm:any):void{
    console.log(myForm);
    this.myform.reset();

  }
}
