package com.agroeti.domain;
 
import lombok.Data;


import jakarta.persistence.*;

import java.util.UUID;


@Entity
@Data
public class Device {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	UUID id ;
	
	@Column(name = "name")

    String name;

}
