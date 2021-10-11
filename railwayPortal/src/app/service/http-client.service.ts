import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

export class Trains {
  constructor(
    public  train_id: number,
    public  train_name: String,
    public  from: String,
    public  to: String,
    public  fare: number,
    public  berths:number,
  ) {
  }
}

@Injectable({
  providedIn: 'root'
})

export class HttpClientService{
  [x: string]: any;
  constructor(
    private httpClient: HttpClient
  ) { }

  getTrains(){
      console.log('Test Call');
      return this.httpClient.get<Trains[]>('AdminControls/Trains');
  }
  saveTrain(data: any)
  {
     return this.httpClient.post<Trains[]>('AdminControls/Trains',data)
  }
  deleteTrains(id: any)
  {
    return this.httpClient.delete<Trains[]>(`${'AdminControls/Trains'}/${id}`)
  }
  getCurrentResto(id: any)
  {
    return this.httpClient.get<Trains[]>(`${'AdminControls/Trains'}/${id}`)
  }
  updateResto(id: any,data: any)
  {
    return this.httpClient.put<Trains[]>(`${'AdminControls/Trains'}/${id}`,data)
  }
}