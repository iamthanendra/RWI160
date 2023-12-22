import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  amount = 223;
  language = "AnGular";
  marks = 0.91;
  today = new Date();
  name = "Thanendra Kashyap";
}
