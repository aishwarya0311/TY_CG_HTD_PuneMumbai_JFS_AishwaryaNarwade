import { Pipe, PipeTransform } from '@angular/core';
import { Employee } from './employee';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(employee: Employee[] ,search: string): Employee[] {
    return employee.filter((value,index,array) =>{
      return value.name.toLowerCase().includes(search.toLowerCase());
        });
  }

}
