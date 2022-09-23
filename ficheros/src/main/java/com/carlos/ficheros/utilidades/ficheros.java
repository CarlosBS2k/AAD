package com.carlos.ficheros.utilidades;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ficheros {
	public static List<String> leerFichero(String directorio, String fichero) {
		try {
			return Files.readAllLines((Path) Path.of(directorio+fichero), Charset.defaultCharset());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static List<String> leerFichero(String fichero){
		return leerFichero("", fichero);
	}
}
