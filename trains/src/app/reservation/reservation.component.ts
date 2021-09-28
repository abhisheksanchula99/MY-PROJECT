import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { UserServiceService } from '../service/user-service.service';

@Component({
  selector: 'app-reservation',
  templateUrl: './reservation.component.html',
  styleUrls: ['./reservation.component.css']
})
export class ReservationComponent implements OnInit {
  bookSeats=new FormGroup(
    {
        id: new FormControl(''),
        quantity: new FormControl(''),
        startStation: new FormControl(''),
        endStation:new FormControl('') 
    })
    constructor(private httpClientService: UserServiceService) { }
  
    ngOnInit(): void {
    }
    collectTicks()
    {
      //console.warn(this.addResto.value)
      this.httpClientService.saveResto(this.bookSeats.value).subscribe((result: any)=>{
      console.warn("result",result)})
    }
  


  }
    
