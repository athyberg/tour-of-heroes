package fr.lteconsulting.angular2gwt.demos.tourofheroes.client;

import fr.lteconsulting.angular2gwt.ng.core.Component;
import jsinterop.annotations.JsType;

@Component(
		selector = "my-app",
		template = "<h1>{{title}}</h1>"
				+ "<a routerLink='/heroes'>Heroes</a>"
				+ "<router-outlet></router-outlet>" )
@JsType
public class ApplicationComponent
{
	public String title = "Tour of Heroes";
}
