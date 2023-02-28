package com.example.demo.funcional;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class MainParalelloStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> idEstudiantes = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			idEstudiantes.add(i);
		}
		idEstudiantes.forEach(numero -> System.out.println("Estudiante" + numero));
		// Procesas cada estudiante
		long tiempoInicial = System.currentTimeMillis();

		List<String> listaFinal = idEstudiantes.parallelStream().map(id -> procesarIdEstudiante(id))
				.collect(Collectors.toList());

		long tiempoFinal = System.currentTimeMillis();
		long tiempoTranscurrido = (tiempoFinal - tiempoInicial) / 1000;
		listaFinal.forEach(cadena -> System.out.println(cadena));
		System.out.println("Tiempo transcurrido en seg: " + tiempoTranscurrido);

	}

	public static String procesarIdEstudiante(Integer idEstudiante) {
		// Convertir a string
		String idConvertido = "E" + idEstudiante.toString();
		// Insertar en la base
		System.out.println("Insertando estudiante:" + idConvertido + " Hilo " + Thread.currentThread().getName());
		// 1 segundo
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return idConvertido;
	}

}