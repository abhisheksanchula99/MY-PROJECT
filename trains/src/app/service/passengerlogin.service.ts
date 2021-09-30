import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

export class userlogin {
  constructor(
    public  username: String,
    public  password: String,
  ) {
  }
}


@Injectable({
  providedIn: 'root'
})
export class PassengerloginService {

  constructor(private httpClient: HttpClient) {
  }
  saveResto(data: any)
   {
      return this.httpClient.post<userlogin[]>('http://localhost:8683/auth',data)
   }
}
