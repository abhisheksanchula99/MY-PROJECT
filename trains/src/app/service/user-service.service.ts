import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';


export class orders {
  constructor(
    public  id: String,
    public  time: String,
    public  startStation: String,
    public  endStation: String,
    public  name:String,
  	public  age:String,
  	public  gender:String,
	  public  credit:String,
	  public  address:String,
	  public  berth:String,
	  public  bankname:String,
    public  date:String,
    public  Email:String
  ) {
  }
}
@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  constructor(private httpClient: HttpClient) {
 }
 saveTrains(data: any)
  {
     return this.httpClient.post<orders[]>('http://localhost:8081/orders/addOrder',data)
  }
}
