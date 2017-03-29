import { Component } from '@angular/core';

@Component({
    selector : 'my-animation',
    template : `<h1>{{title}}<h1>
    <div class="room"> </div>`
})
export class AnimationComponent{

    title = "Angular Animation";
}

