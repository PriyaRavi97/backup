import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { StorageServiceModule, WebStorageService} from 'angular-webstorage-service';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AlertModule } from 'ngx-bootstrap';
import { ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { DropdownSplitComponent } from './dropdown-split/dropdown-split.component';
import { CardsDemoComponent } from './cards-demo/cards-demo.component';
import { SaveEverythingComponent } from './save-everything/save-everything.component';
import { StarRatingComponent } from './star-rating/star-rating.component';
import {ChartsModule} from 'ng2-charts';
import { ModalTestComponent } from './modal-test/modal-test.component';
import { SkillsInputComponent } from './skills-input/skills-input.component';
import { AddSkillsComponent } from './add-skills/add-skills.component';
import { AddSkillsToAssociateComponent } from './add-skills-to-associate/add-skills-to-associate.component';
import { LoginPageComponent } from './login-page/login-page.component';
import {MatButtonModule} from '@angular/material/button';
import { ScrollToService, ScrollToConfigOptions, ScrollToModule } from '@nicky-lenaers/ngx-scroll-to';
@NgModule({
  declarations: [
    AppComponent,
    DropdownSplitComponent,
    CardsDemoComponent,
    SaveEverythingComponent,
    StarRatingComponent,
    ModalTestComponent,
    SkillsInputComponent,
    AddSkillsComponent,
    AddSkillsToAssociateComponent,
    LoginPageComponent
  ],
  imports: [
    BrowserModule,
    NgbModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    ChartsModule,
    AppRoutingModule,
    AlertModule.forRoot(),
    MatButtonModule,
    ScrollToModule.forRoot(),
    BrowserModule,
    StorageServiceModule
  ],
  providers: [CardsDemoComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
