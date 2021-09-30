import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { HttpClientService } from '../service/http-client.service';

@Component({
  selector: 'app-addtrains',
  templateUrl: './addtrains.component.html',
  styleUrls: ['./addtrains.component.css']
})
export class AddtrainsComponent implements OnInit {

  addTrains=new FormGroup(
    {
        train_id: new FormControl(''),
        train_name: new FormControl(''),
        from: new FormControl(''),
        to:new FormControl('') ,
        fare: new FormControl('')
    })
    constructor(private httpClientService: HttpClientService) { }
  
    ngOnInit(): void {
    }
    collectTrains()
    {
      this.httpClientService.saveTrain(this.addTrains.value).subscribe((result: any)=>{
      console.warn("result",result)})
    }
  
  }


  