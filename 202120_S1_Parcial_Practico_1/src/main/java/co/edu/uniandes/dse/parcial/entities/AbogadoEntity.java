package co.edu.uniandes.dse.parcial.entities;


import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class AbogadoEntity extends BaseEntity {

	
	private Long 	ID	;
	private String 	nombre ;
	private String 	apellido ;
	private Boolean activo ;
	private String 	especialidad ;
	
	
}
