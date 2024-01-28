package br.com.agroeti.iotdevice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;


class IOTDeviceControllerTest {

    @Autowired
    private IOTDeviceController controller;

    @Test
    void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }





}