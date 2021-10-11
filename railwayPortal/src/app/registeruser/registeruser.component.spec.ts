import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpClientTestingModule ,HttpTestingController} from '@angular/common/http/testing';
import { HttpClientModule } from '@angular/common/http';
import { RegisteruserComponent } from './registeruser.component';

describe('RegisteruserComponent', () => {
  let component: RegisteruserComponent;
  let fixture: ComponentFixture<RegisteruserComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports:[
        HttpClientModule,
        HttpClientTestingModule,
      ],
      declarations: [ RegisteruserComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RegisteruserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });
/*
  it('should create', () => {
    expect(component).toBeTruthy();
  });*/
});
