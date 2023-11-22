import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  private router:Router
  constructor(private _router:Router)
  {
    this.router = _router;
  }
  navigateTo(routePage:string){
    this.router.navigate([routePage]);
  }
}
