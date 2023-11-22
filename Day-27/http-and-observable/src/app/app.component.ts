import { Component, OnInit, } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { catchError, of } from 'rxjs';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  httpclient:HttpClient;
  users:any;
  isLoading:boolean = false;

  url = "https://api.github.com/users?per_page=100&page=1"
  constructor(private _httpclient:HttpClient){
    this.httpclient = _httpclient;
  }

  ngOnInit(): void {
    this.isLoading = true;
    this.getUsers();  
  }

  getUsers()
  {
    this.httpclient.get(this.url).subscribe( res =>{
      this.isLoading = false;
      console.log("success");
      console.log(res);
      this.users = res;
    },
    error =>{
      console.log("error");
      console.log(error);
    },
    () =>{
      
    }
    );
  }

  goToGithub(githubURL:string){
    window.open(githubURL, '_blank');
  }
}
