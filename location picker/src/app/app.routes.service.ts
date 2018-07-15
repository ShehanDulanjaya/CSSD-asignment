
import { RouterModule, Route } from '@angular/router';
import { ModuleWithProviders } from '@angular/core';
import { DirectionComponent } from './direction/direction.component';
import { PickerComponent } from './picker/picker.component';


const routes: Route[] = [
  { path: '', pathMatch: 'full', redirectTo: 'picker' },
  { path: 'direction', component: DirectionComponent },
  { path: 'picker', component: PickerComponent },


];

export const AppRoutes: ModuleWithProviders = RouterModule.forRoot(routes);
