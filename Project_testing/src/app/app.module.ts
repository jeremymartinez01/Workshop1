import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { MenuComponent } from './shared/menu/menu.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { ConductoresComponent } from './pages/conductores/conductores.component';
import { EmpresasComponent } from './pages/empresas/empresas.component';
import { CampaignComponent } from './pages/campaign/campaign.component';
import { SolicitudesComponent } from './pages/solicitudes/solicitudes.component';
import { VerificacionesComponent } from './pages/verificaciones/verificaciones.component';
import { NotificacionesComponent } from './pages/notificaciones/notificaciones.component';
import { PermisosComponent } from './pages/permisos/permisos.component';
import { ConfiguracionComponent } from './pages/configuracion/configuracion.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    MenuComponent,
    DashboardComponent,
    ConductoresComponent,
    EmpresasComponent,
    CampaignComponent,
    SolicitudesComponent,
    VerificacionesComponent,
    NotificacionesComponent,
    PermisosComponent,
    ConfiguracionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
