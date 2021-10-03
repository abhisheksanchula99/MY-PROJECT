import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router} from '@angular/router';
import { HttpClientService, Trains } from '../service/http-client.service';
import { TraindataService } from '../service/traindata.service';
import { UserServiceService } from '../service/user-service.service';

@Component({
  selector: 'app-reservation',
  templateUrl: './reservation.component.html',
  styleUrls: ['./reservation.component.css']
})
export class ReservationComponent implements OnInit {
  [x: string]: any;
  bookSeats=new FormGroup(
    {
      id: new FormControl(''),
      train: new FormControl(''),
      startStation: new FormControl(''),
      endStation:new FormControl(''),
      name:new FormControl(''),
      age:new FormControl(''),
      gender:new FormControl(''),
      credit:new FormControl(''),
      address:new FormControl(''),
      berth:new FormControl(''),
      bankname:new FormControl(''),
      date: new FormControl(''),
      email: new FormControl('')

    })
    trains: Trains[]=[];
    constructor(private httpClientService: UserServiceService, private router: Router, private httpClientServic: HttpClientService, private httpClientServi: TraindataService) { }
  
    ngOnInit(): void {
      this.httpClientServic.getTrains().subscribe((result)=>{
        console.warn(result)
        this.trains=result
      })
    }
    
    collectTicks()
    {
      //console.warn(this.addResto.value)
      this.httpClientService.saveTrains(this.bookSeats.value).subscribe((result: any)=>{
      console.warn("result",result);
      (<any>this.router).navigate(["/pnr"])
      alert('Booked your ticket!!')
      })
    }
   
search()
{
 // console.warn(this.editResto.value);
  this.httpClientServi.updateResto(this.text).subscribe((result: any)=>{
    console.warn(result)
    this.trains=result
  })
}

search1()
{
 // console.warn(this.editResto.value);
  this.httpClientServi.updateRest(this.text1).subscribe((result: any)=>{
    console.warn(result)
    this.trains=result
  })
}
  }
    
