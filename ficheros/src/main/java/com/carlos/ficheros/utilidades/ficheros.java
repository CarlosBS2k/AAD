package com.carlos.ficheros.utilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ficheros {
	
	/**
	 * Leer un Fichero en Java 5
	 * Dado un nombre de fichero devolverá sus líneas hasta un máximo
	 * de 65536
	 * @param nombre Nombre del fichero en la carpeta del proyecto
	 * @return Array de líneas del fichero
	 */
	public static String[] leerFichero5(String nombre) {
		return leerFichero5(nombre,65536);
	}
	/**
	 * Leer un Fichero en Java 5
	 * Dado un nombre de fichero devolverá sus líneas
	 * @param nombre Nombre del fichero en la carpeta del proyecto
	 * @param maxLineas Número de líneas a leer
	 * @return Array de líneas del fichero
	 */
	public static String[] leerFichero5(String nombre, int maxLineas) {
		String[] lineas = new String[maxLineas];
		int cont = 0;
		// Primero vemos si el fichero existe
		if (!(new File(nombre)).exists()) {
			System.out.println("No he encontrado ejemplo.txt");
			return null;
		}
		// En caso de que exista, intentamos leer
		System.out.println("Leyendo fichero...");
		try {
			BufferedReader ficheroEntrada = new BufferedReader(new FileReader(new File(nombre)));
			String linea = ficheroEntrada.readLine();
			while (linea != null && cont<maxLineas) {
				lineas[cont] = linea;
				cont++;
				linea = ficheroEntrada.readLine();
			}
			ficheroEntrada.close();
			return lineas;
		} catch (IOException errorDeFichero) {
			System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
		}
		System.out.println("Fin de la lectura.");
		return lineas;
	}
	
	
	/**
	 * Devuelve el contenido de un fichero en una lista
	 * @param directorio
	 * @param nombreFichero
	 * @param charset Conjunto de caracteres a leer.
	 * @return List<String>
	 */
	public static List<String> leerFichero8(String directorio, String nombreFichero, Charset charset){
		try {
			return Files.readAllLines(Paths.get(directorio + "/" + nombreFichero), charset);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Devuelve el contenido de un fichero en una lista
	 * @param directorio
	 * @param nombreFichero
	 * @return List<String>
	 */
	public static List<String> leerFichero8(String directorio, String nombreFichero){
		return leerFichero8(directorio, nombreFichero, Charset.defaultCharset());
	}
	
	/**
	 * Dada una ruta completa de un fichero devuelve su contenido.
	 * @param rutaCompletaFichero Ruta incluyendo el fichero.
	 * @return List<String>
	 */
	public static List<String> leerFichero8(String rutaCompletaFichero){
		File f = new File(rutaCompletaFichero);
		return leerFichero8(f.getParent(), f.getName());
	}
	/**
	 * Dada una ruta completa de un fichero devuelve su contenido.
	 * @param rutaCompletaFichero Ruta incluyendo el fichero.
	 * @param charset Conjunto de caracteres a leer.
	 * @return List<String>
	 */
	public static List<String> leerFichero8(String rutaCompletaFichero, Charset charset){
		File f = new File(rutaCompletaFichero);
		return leerFichero8(f.getParent(), f.getName(), charset);
	}
	/**
	 * Dada la ruta completa de un fichero lo devuelve en una cadena.
	 * @param rutaCompletaFichero
	 * @return String
	 */
	public static String leerFichero11(String rutaCompletaFichero){
		try {
			return Files.readString(Path.of(rutaCompletaFichero), Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Dada la ruta completa de un fichero lo devuelve en una cadena.
	 * @param rutaCompletaFichero
	 * @param charset Conjunto de caracteres a leer
	 * @return String
	 */
	public static String leerFichero11(String rutaCompletaFichero, Charset charset){
		try {
			return Files.readString(Path.of(rutaCompletaFichero), charset);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static Boolean añadirFichero(String directorio, String nombreFichero, List<String>lineas, Charset charset, StandardOpenOption opcionApertura) {
		try {
			Files.write(Path.of(directorio+"/"+nombreFichero), lineas, charset, opcionApertura);
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
