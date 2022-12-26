import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RadarsComponent } from './radars/radars.component';
import { InfractionsComponent } from './infractions/infractions.component';
import { ImmatriculationComponent } from './immatriculation/immatriculation.component';

const routes: Routes = [
  {path:"immatriculation", component:ImmatriculationComponent},
  {path:"radars", component:RadarsComponent},
  {path:"infractions", component:InfractionsComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
