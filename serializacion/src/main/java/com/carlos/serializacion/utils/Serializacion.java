package com.carlos.serializacion.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serializacion<T> {
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
