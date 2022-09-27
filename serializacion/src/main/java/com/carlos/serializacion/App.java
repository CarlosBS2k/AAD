package com.carlos.serializacion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.carlos.serializacion.entidades.Coche;
import com.carlos.serializacion.entidades.Persona;
import com.carlos.serializacion.utils.Serializacion;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        List<Persona> personas = new ArrayList();
        personas.add(new Persona("111x", "Fran"));
        personas.add(new Persona("111x", "Fran2"));
        personas.add(new Persona("111x", "Fran3"));
        personas.add(new Persona("111x", "Fran4"));

        List<Coche> coches = new ArrayList<>();
        coches.add(new Coche("Coche1", 4));
        coches.add(new Coche("Coche2", 4));
        coches.add(new Coche("Coche3", 4));
        Serializacion.serializarListaObjetos("C:/Ficheros", "personas.txt", personas);
        Serializacion.serializarListaObjetos("C:/Ficheros", "coches.txt", coches);
        
    }
}
