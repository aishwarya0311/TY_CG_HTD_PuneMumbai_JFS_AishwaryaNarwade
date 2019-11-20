import{Injectable} from '@angular/core';
@Injectable({
    providedIn:'root'

})
export class SampleService {
    laptop='DELL';

    printService() {
        console.log('function is running from sample service');
        
    }
}