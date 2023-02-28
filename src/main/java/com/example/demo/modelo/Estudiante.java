package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity

@Table(name="estudiante_p")
public class Estudiante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cualquiera")
	@SequenceGenerator(name = "cualquiera", sequenceName = "seq_estu", allocationSize = 1)
	@Column(name="estu_id")
	private Integer id;
	
	@Column(name="estu_nombre_completo")
	private String NombreCompleto;
	
	@Column(name="estu_edad")
	private String edad;
	

}
