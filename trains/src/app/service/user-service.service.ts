import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';


export class orders {
  constructor(
    public  id: String,
    public  quantity: String,
    public  startStation: String,
    public  emdStation: String,
  ) {
  }
}
@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  constructor(private httpClient: HttpClient) {
 }
 saveResto(data: any)
  {
     return this.httpClient.post<orders[]>('http://localhost:8081/orders/addOrder',data)
  }
}
