package listas.enlazadas.Ejercicio12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ArchivoUtil {

	/**
	 * Este metodo recibe una cadena con el contenido que se quiere guardar en el archivo
	 * @param ruta es la ruta o path donde esta ubicado el archivo
	 * @throws IOException
	 */
	public static void guardarArchivo(String ruta,String contenido, Boolean flagAnexarContenido) throws IOException {

		FileWriter fw = new FileWriter(ruta,flagAnexarContenido);
		BufferedWriter bfw = new BufferedWriter(fw);
		bfw.write(contenido);
		bfw.close();
		fw.close();
	}

		/**
	 * ESte metodo retorna el contendio del archivo ubicado en una ruta,con la lista de cadenas.
	 * @param ruta
	 * @return
	 * @throws IOException
	 */
	public static ArrayList<String> leerArchivo(String ruta) throws IOException {

		ArrayList<String>  contenido = new ArrayList<String>();
		//abrir conexion
		FileReader fr=new FileReader(ruta);
		BufferedReader bfr=new BufferedReader(fr);
		// leer
		String linea="";
		while((linea = bfr.readLine())!=null)
		{
			contenido.add(linea);
		}
		//cerrar
		bfr.close();
		fr.close();
		return contenido;
	}




}