import { Component, OnInit } from '@angular/core';
import { HttpClientService, Trains} from '../service/http-client.service';

@Component({
  selector: 'app-timetable',
  templateUrl: './timetable.component.html',
  styleUrls: ['./timetable.component.css']
})
export class TimetableComponent implements OnInit {
  trains: Trains[] = [];

  constructor(private httpClientService: HttpClientService) { }

  ngOnInit(): void {
    this.httpClientService.getTrains().subscribe((result)=>{
      console.warn(result)
      this.trains=result
    })
  }
}
