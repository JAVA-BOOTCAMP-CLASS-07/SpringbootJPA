package ar.com.sicos.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "personas")
@Data
@ToString
public class Persona {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;

	private String nombre;
	private String apellido;
	private int dni;
}
