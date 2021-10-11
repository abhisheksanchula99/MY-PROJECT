import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';


export class Seats {
  constructor(
    public  id: String,
    public  train: String,
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
    public  email:String
  ) {
  }
}

@Injectable({
  providedIn: 'root'
})
export class DeleteService {

  constructor(private httpClient: HttpClient) { }

  getCurrentResto(id: string)
  {
    return this.httpClient.get("book/orders/"+id)
  }


  getorders()
  {
    return this.httpClient.get<Seats[]>('book/orders') 
   }

   deleteResto(id: any)
   {
     return this.httpClient.delete<Seats[]>(`${'book/orders/delete'}/${id}`)
   }
}
