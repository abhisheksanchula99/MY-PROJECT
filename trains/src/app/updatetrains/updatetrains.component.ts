import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { HttpClientService } from '../service/http-client.service';

@Component({
  selector: 'app-updatetrains',
  templateUrl: './updatetrains.component.html',
  styleUrls: ['./updatetrains.component.css']
})
export class UpdatetrainsComponent implements OnInit {
  editResto=new FormGroup(
    {
      train_id: new FormControl(''),
      train_name: new FormControl(''),
      from: new FormControl(''),
      to:new FormControl('') ,
      fare: new FormControl('')
    })

  constructor(private router:ActivatedRoute,private httpClientService: HttpClientService) { }

  ngOnInit(): void {
   // console.warn(this.router.snapshot.params.id)
    this.httpClientService.getCurrentResto(this.router.snapshot.params.id).subscribe((result: any)=>{
   console.warn("result",result)
  }
  
  )
  }
  collection()
  {
   // console.warn(this.editResto.value);
    this.httpClientService.updateResto(this.router.snapshot.params.id,this.editResto.value).subscribe((result: any)=>{
      console.warn(result)
    })
  }

}