import {Directive,ElementRef, HostListener} from '@angular/core';

@Directive({
    selector:'[appColor]'
})
export class ColorDirective{
    constructor (private e : ElementRef){
        this.e.nativeElement.style.backgroundColor="blue";
        this.e.nativeElement.style.color="white";
        this.e.nativeElement.style.padding='5px';

    }
@HostListener('mouseenter')
    mouseEnter (){
console.log('mouse Entered...');
this.e.nativeElement.style.background='red';
    }

    @HostListener('mouseleave')
    mouseLeave(){
        console.log('mouse left...')
        this.e.nativeElement.style.background='green';
    }
}