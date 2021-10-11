import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

export class Trains {
  constructor(
    public  train_id: number,
    public  train_name: String,
    public  from: String,
    public  to: String,
    public  fare: number,
    public  berths:number
  ) {
  }
}

@Injectable({
  providedIn: 'root'
})

export class TraindataService{
  [x: string]: any;
  constructor(
    private httpClient: HttpClient
  ) { }

  getTrains(){
      console.log('Test Call');
      return this.httpClient.get<Trains[]>('AdminControls/Trains');
  }
  
  updateResto(data:any)
  {
    return this.httpClient.post<Trains[]>('AdminControls/regexfrom',data)
  }

  updateRest(data:any)
  {
    return this.httpClient.post<Trains[]>('AdminControls/regexto',data)
  }

}