package com.qbo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.qbo.interfaces.DeDos;
import com.qbo.model.Alumno;

@SpringBootApplication
public class AppQboSbd2FundamentosApplication implements CommandLineRunner {
	
	private static Logger LOG = LoggerFactory
			.getLogger(AppQboSbd2FundamentosApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AppQboSbd2FundamentosApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		final String institucion = "QBO Institute"; 
		String curso = "Spring Boot Developer";
		Integer edad;
		edad = 30;
		Double precio;
		Boolean activo = true;
		precio = 456.9;
		//Conversiones:
		Double precioProducto= 13.0;
		String precioProducto2 = "13";
		Integer cantidadCompra = 11;
		Integer totalCompra = Integer.parseInt(precioProducto2) * cantidadCompra;
		//LOG.info("Total de compra: " +totalCompra);
		//imprimirMensaje(diaDeSemana(5));
		//buclesRepetitivos(10);
		//imprimirListaAlumnos();
		imprimirSerie();
	}
	
	private void imprimirMensaje(String mensaje) {
		LOG.info(mensaje);
	}
	
	private String longitudPalabra(String palabra1, String palabra2) {
		//Condicionales
		String palabraLarga = "";
		if(palabra1.length() > palabra2.length()) {
			palabraLarga = palabra1;
		}else if(palabra2.length() > palabra1.length()) {
			palabraLarga = palabra2;
		}else {
			palabraLarga = "Ambas palabras tienen la misma longitud";
		}
		return palabraLarga;
	}
	
	private String diaDeSemana(Integer numerodia) {
		String respuesta = "";
		switch(numerodia) {
			case 1: respuesta = "Lunes"; break;
			case 2: respuesta = "Martes"; break;
			case 3: respuesta = "Miércoles"; break;
			case 4: respuesta = "Jueves"; break;
			case 5: respuesta = "Viernes"; break;
			case 6: respuesta = "Sábado"; break;
			case 7: respuesta = "Domingo"; break;
			default: respuesta = "Día ínvalido"; break;
		}
		return respuesta;
	}

	private void buclesRepetitivos(Integer numero) {
		Integer x = 1;
		while(x <= numero) {
			imprimirMensaje("Valor de x = " + x);
			x++;
		}
		for(int y = 2; y <= numero; y++) {
			imprimirMensaje("Valor de Y = " + y);
		}
		Integer z = 21;
		do {
			imprimirMensaje("Valor de Z = " + z);
			z--;
		}while(z > numero);
		
	}
	
	private void imprimirListaAlumnos() {
		Alumno objAlumno1 = new Alumno();
		objAlumno1.setId(1);
		objAlumno1.setNombre("Luis Angel");
		objAlumno1.setApellido("Salvatierra");
		Alumno objAlumno2 = new Alumno();
		objAlumno2.setId(2);
		objAlumno2.setNombre("Henry");
		objAlumno2.setApellido("Torres");
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		listaAlumnos.add(objAlumno1);
		listaAlumnos.add(objAlumno2);
		for(Alumno obj : listaAlumnos) {
			imprimirMensaje(obj.getNombre());
		}
	}

	private void imprimirSerie() {
		DeDos objDeDos = new DeDos();
		for(int i =0; i<5; i++) {
			imprimirMensaje("Siguiente valor es: "+objDeDos.getSiguiente());
		}
		imprimirMensaje("Reiniciando");
		objDeDos.reiniciar();
		for(int i=0; i<5; i++) {
			imprimirMensaje("Siguiente valor es: "+objDeDos.getSiguiente());
		}
		objDeDos.setComenzar(100);
		for(int i=0; i<5; i++) {
			imprimirMensaje("Siguiente valor es: " + objDeDos.getSiguiente());
		}
		
	}
	

}
