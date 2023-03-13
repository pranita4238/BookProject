import { TestBed } from '@angular/core/testing';

import { ThisbooklistserviceService } from './thisbooklistservice.service';

describe('ThisbooklistserviceService', () => {
  let service: ThisbooklistserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ThisbooklistserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
