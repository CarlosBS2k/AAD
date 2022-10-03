package com.carlos.xmljson;

import org.w3c.dom.ls.LSOutput;

import com.carlos.xmljson.utilidades.XmlUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*XmlUtils.procesarXmlSax("c:/ficheros", "asignaturas.xml").stream()
    	.forEach(a->System.out.println(a));/**/
    	//XmlUtils.mostrarXmlDom("C:/Ficheros/XML/asignaturas.xml");
    	XmlUtils.procesarMarcaDom("https://e00-marca.uecdn.es/rss/portada.xml").forEach(a->System.out.println(a));
    }
}
