import { Component, OnInit } from '@angular/core';
import { DeleteService } from '../service/delete.service';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {

  id:any;
  Seats:any;
  constructor(private httpClientService: DeleteService) { }

public getbookbyid(){
  let ord=this.httpClientService.getCurrentResto(this.id);
  ord.subscribe((data)=>this.Seats=data)

}

deleteResto(id: any)
  {
    this.httpClientService.deleteResto(id).subscribe((result: any)=>{
      console.warn("result",result)
    })
  }


  ngOnInit(): void {
    let ord=this.httpClientService.getorders();
    ord.subscribe((data)=>this.Seats=data); 
  }

}

