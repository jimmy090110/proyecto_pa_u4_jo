package com.example.demo.paralelo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainSecuencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>idEstudiante= new ArrayList<>();
		for(int i=0; i<10;i++ ) {
			idEstudiante.add(i);
}
		idEstudiante.forEach(numero->System.out.println("Estudiante: "+numero));
	//Procesar cada estudiante
		long tiempoInicial= System.currentTimeMillis();
		List<String >listaFinal = new ArrayList<>();
		for(Integer id:idEstudiante) {
			listaFinal.add(procesarIdEstudiante(id));
		}
		long tiempoFinal= System.currentTimeMillis();
		long tiempoTranscurrido = (tiempoFinal-tiempoInicial)/1000;
		listaFinal.forEach(cadena -> System.out.println(cadena));
		System.out.println("Tiempo transcurrido en segundos: "+tiempoTranscurrido);
	}
	
	public static String procesarIdEstudiante(Integer idEstudiante) {
		String idConvertido = "E"+idEstudiante.toString();
		System.out.println("Insertando estudiante:"+ idConvertido+"Hilo: "+ Thread.currentThread().getName());
		//1 segundo
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return idConvertido;
	}

}
