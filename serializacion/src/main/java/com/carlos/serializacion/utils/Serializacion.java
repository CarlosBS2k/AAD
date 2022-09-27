package com.carlos.serializacion.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.carlos.serializacion.entidades.Persona;

public class Serializacion<T> {
	public static boolean SerializarPersona(String directorio, String nombreFichero, Persona p) {
		File fichero = new File(directorio+"/"+nombreFichero);
		try {
			FileOutputStream ficheroSalida = new FileOutputStream(fichero);
			ObjectOutputStream ficheroObjetos = new ObjectOutputStream(ficheroSalida);
			ficheroObjetos.writeObject(p);
			ficheroObjetos.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	public static boolean SerializarListaPersona(String directorio, String nombreFichero, List<Persona> personas) {
		try (ObjectOutputStream ficheroObjetos = new ObjectOutputStream( new FileOutputStream(new File(directorio+"/"+nombreFichero)))){
			ficheroObjetos.writeObject(personas);
			ficheroObjetos.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public static <T> boolean serializarListaObjetos(String directorio, String nombreFichero, List<T> objetos) {
		try (ObjectOutputStream ficheroObjetos = new ObjectOutputStream( new FileOutputStream(new File(directorio+"/"+nombreFichero)))){
			ficheroObjetos.writeObject(objetos);
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T> List<T> desSerializarListaObjetos(String directorio, String nombreFichero) {
		try (ObjectInputStream ficheroObjetos = new ObjectInputStream( new FileInputStream(new File(directorio+"/"+nombreFichero)))){
			return (List<T>)ficheroObjetos.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
