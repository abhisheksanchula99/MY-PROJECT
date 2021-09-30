import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

export class Seats {
  constructor(
    public  id: String,
    public  quantity: String,
    public  startStation: String,
    public  endStation: String,
    public  date: String,
    public  name:String,
  	public  age:String,
  	public  gender:String,
	  public  credit:String,
	  public  address:String,
	  public  berth:String,
	  public  bankname:String,
    public  email:String,
    public  phone:String,
  ) {
  }
}


@Injectable({
  providedIn: 'root'
})
export class PnrService {
  constructor(private httpClient: HttpClient) { }

  getorders()
  {
    return this.httpClient.get<Seats[]>('http://localhost:8081/orders') 
   }

  
}





