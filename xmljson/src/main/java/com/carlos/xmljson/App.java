package com.carlos.xmljson;

import java.sql.Types;

import javax.lang.model.type.ReferenceType;

import com.carlos.xmljson.entidades.Film;
import com.carlos.xmljson.entidades.People;
import com.carlos.xmljson.utilidades.InternetUtils;
import com.carlos.xmljson.utilidades.JsonUtils;
import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*XmlUtils.procesarXmlSax("c:/ficheros", "asignaturas.xml").stream()
    	.forEach(a->System.out.println(a));*/
		//XmlUtils.mostrarXmlDom("c:/ficheros/asignaturas.xml");
		/*XmlUtils.procesarXmlDom("c:/ficheros", "asignaturas.xml").stream()
	    	.forEach(a->System.out.println(a));*/
		//System.out.println(InternetUtils.readUrl("https://e00-marca.uecdn.es/rss/portada.xml"));
		/*InternetUtils.readUrlList("https://e00-marca.uecdn.es/rss/portada.xml").stream()
		.forEach(l->System.out.println(l));*/
		// create a formater
		/*Noticia n = new Noticia("a","b","c",LocalDate.parse("Mon, 03 Oct 2022 05:13:05 +0200",DateTimeFormatter.RFC_1123_DATE_TIME));
		System.out.println(n);*/
		/*XmlUtils.procesarMarcaDom("https://e00-marca.uecdn.es/rss/portada.xml").stream()
		.filter(n->n.getTitle().contains("Madrid") || n.getDescription().contains("Madrid"))
		.forEach(n->System.out.println(n));*/
		//JsonUtils.leerJsonDesdeFichero("c:/ficheros/profesor.json");
		//JsonUtils.escribirJsonSimple();
    	/*JsonUtils.devolverGsonGenerico("https://jsonplaceholder.typicode.com/todos",Tarea[].class).stream()
    	.filter(e->e.isCompleted()==false)
		.forEach(e->System.out.println(e));/**/
    	/*JsonUtils.devolverArrayGsonGenerico("https://jsonplaceholder.typicode.com/todos",Tarea[].class)
    					.stream().filter(e->e.isCompleted()==false).forEach(e->System.out.println(e));/**/
    	//System.out.println(JsonUtils.devolverObjetoGsonGenerico("https://swapi.dev/api/people/1?format=json",People.class));
    	/*JsonUtils.devolverObjetoGsonGenerico("https://swapi.dev/api/people/1?format=json",People.class).getFilms()
    					.stream().forEach(f->System.out.println(JsonUtils.devolverObjetoGsonGenerico(f+"?format=json", Film.class).getTitle()));/**/
    	
    	/*
    	JsonUtils.devolverObjetoGsonGenerico("https://swapi.dev/api/people/1?format=json",People.class).getFilms() // Esto es marear por marear
		.stream().forEach(f->{
			String peli = new Gson().fromJson(InternetUtils.readUrl(f+"?format=json"), Object.class).toString();
			System.out.println(peli.substring(peli.indexOf("title=")+6, peli.indexOf(',')));
		});*/ 
    	System.out.println(InternetUtils.readUrl("https://api.football-data.org/v4/teams/86/matches?status=SCHEDULED", "c4fd0d14fafd486798401ada7722441d"));
    }
}
