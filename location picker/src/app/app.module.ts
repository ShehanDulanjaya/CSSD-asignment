import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AgmCoreModule } from '@agm/core';
import { Angular2Txt } from 'angular2-txt/Angular2-txt';
import { AppComponent } from './app.component';
import { HttpClientModule} from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { AppRoutes } from './app.routes.service';
import { DirectionComponent } from './direction/direction.component';
import { PickerComponent } from './picker/picker.component';

@NgModule({
  declarations: [
    AppComponent,
    DirectionComponent,
    PickerComponent,
   
    
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutes,
    RouterModule,
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyCCu1RHF_poxJ-UnzJIessLJ_2CMLlyPI8'
    })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
