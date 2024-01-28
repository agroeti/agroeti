package com.agroeti.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Telemetry {


    @GeneratedValue(strategy = GenerationType.UUID)
            @Id
    UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
            @JoinColumn(name = "device_id")
    Device device;

    @Column
    Double value;
}
