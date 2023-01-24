package sng.veiculos.api.controller;

import org.springframework.web.bind.annotation.*;
import sng.veiculos.api.dto.DadosCadastroFinanciado;

@RestController
@RequestMapping("financiado")
public class FinanciadoController {


    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroFinanciado dados){
        System.out.println(dados);
    }

}
