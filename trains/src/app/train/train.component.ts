import { Component, OnInit } from '@angular/core';
import {HttpClientService, Trains} from '../service/http-client.service';

@Component({
  selector: 'app-train',
  templateUrl: '/train.component.html',
  styleUrls: ['./train.component.css']
})
export class TrainComponent implements OnInit {
  trains: Trains[] = [];

  constructor(private httpClientService: HttpClientService) { }

  ngOnInit(): void {
    this.httpClientService.getTrains().subscribe((result)=>{
      console.warn(result)
      this.trains=result
    })
  }
  deleteResto(trai: any)
  {
    this.trains.splice(trai-1,1)
    this.httpClientService.deleteResto(trai).subscribe((result: any)=>{
      console.warn("result",result)
    })
  }

}