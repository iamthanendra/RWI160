import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AnalyzeWordComponent } from './analyze-word.component';

describe('AnalyzeWordComponent', () => {
  let component: AnalyzeWordComponent;
  let fixture: ComponentFixture<AnalyzeWordComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AnalyzeWordComponent]
    });
    fixture = TestBed.createComponent(AnalyzeWordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
