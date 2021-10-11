import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpClientTestingModule ,HttpTestingController} from '@angular/common/http/testing';
import { HttpClientModule } from '@angular/common/http';
import { PnrComponent } from './pnr.component';

describe('PnrComponent', () => {
  let component: PnrComponent;
  let fixture: ComponentFixture<PnrComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports:[
        HttpClientModule,
        HttpClientTestingModule,
      ],
      declarations: [ PnrComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PnrComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });
  /*
  it('should create', () => {
    expect(component).toBeTruthy();
  });*/
});
