package co.edu.uniandes.dse.parcial.dto;

import lombok.Data;

@Data
public class AbogadoDTO {
	
	private Long 	ID	;
	private String 	nombre ;
	private String 	apellido ;
	private Boolean activo ;
	private String 	especialidad ;
}
