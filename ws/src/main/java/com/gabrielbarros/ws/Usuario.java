package com.gabrielbarros.ws;

import javax.persistence.*;
import lombok.*;


@Entity @NoArgsConstructor @Getter @Setter
public class Usuario {
	@Id @GeneratedValue(strategy = GenerationType.AUTO) 
	private int id;
	
	private String nome;
	private String usuario;
	private String senha;
}
