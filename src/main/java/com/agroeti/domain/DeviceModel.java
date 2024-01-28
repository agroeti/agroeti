package com.agroeti.domain;


import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DeviceModel {

		@Id
		@GeneratedValue(strategy = GenerationType.UUID)
        UUID id;
        String name;
}
