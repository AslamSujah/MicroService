import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomepageDoctorsDetailsComponent } from './homepage-doctors-details.component';

describe('HomepageDoctorsDetailsComponent', () => {
  let component: HomepageDoctorsDetailsComponent;
  let fixture: ComponentFixture<HomepageDoctorsDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HomepageDoctorsDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomepageDoctorsDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
