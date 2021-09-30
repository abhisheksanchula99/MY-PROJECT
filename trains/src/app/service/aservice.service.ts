import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';


export class login {
  constructor(
    public  username: String,
    public  password: String,
  ) {
  }
}

@Injectable({
  providedIn: 'root'
})
export class AserviceService {

  constructor(private httpClient: HttpClient) {
  }
  saveResto(data: any)
   {
      return this.httpClient.post<login[]>('http://localhost:8682/auth',data)
   }
}
