import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpClientTestingModule ,HttpTestingController} from '@angular/common/http/testing';
import { HttpClientModule } from '@angular/common/http';
import { UpdatetrainsComponent } from './updatetrains.component';

describe('UpdatetrainsComponent', () => {
  let component: UpdatetrainsComponent;
  let fixture: ComponentFixture<UpdatetrainsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports:[
        HttpClientModule,
        HttpClientTestingModule,
      ],
      declarations: [ UpdatetrainsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdatetrainsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });
/*
  it('should create', () => {
    expect(component).toBeTruthy();
  });*/
});
