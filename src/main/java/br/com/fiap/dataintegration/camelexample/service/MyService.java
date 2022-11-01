package br.com.fiap.dataintegration.camelexample.service;

import br.com.fiap.dataintegration.camelexample.dto.MyDTO;

public class MyService {

    public static void example(MyDTO dto){
        dto.setName("Dado processado:" + dto.getName());
        dto.setId(dto.getId()+10);
    }
}
