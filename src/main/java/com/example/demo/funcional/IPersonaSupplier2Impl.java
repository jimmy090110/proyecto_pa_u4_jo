package com.example.demo.funcional;

public class IPersonaSupplier2Impl implements IPersonaSupplier<Persona>{

	@Override
	public Persona getNombre() {
		// TODO Auto-generated method stub
		 Persona per = new Persona();
		 per.setApellido("Ortega1");
		 per.setNombre("Jimmy1");
		 return per;
	}

}
