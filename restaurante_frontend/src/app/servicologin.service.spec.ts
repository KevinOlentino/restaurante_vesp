import { TestBed } from '@angular/core/testing';

import { ServicologinService } from './servicologin.service';

describe('ServicologinService', () => {
  let service: ServicologinService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServicologinService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
