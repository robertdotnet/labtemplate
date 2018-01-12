import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.less']
})
export class LoginFormComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit() {
  }

  loginUser(e) {
  	e.preventDefault();
  	console.log(e);
  	var email = e.target.elements[0].value;
    var password = e.target.elements[1].value;
    
    if(email == 'admin' && password == 'admin') {
     // this.user.setUserLoggedIn();
      this.router.navigate(['home']);
    }
  }

}
