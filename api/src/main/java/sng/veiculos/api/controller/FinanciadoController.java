package sng.veiculos.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sng.veiculos.api.dto.DadosCadastroFinanciado;
import sng.veiculos.api.financiado.Financiado;
import sng.veiculos.api.repository.FinanciadoRepository;

@RestController
@RequestMapping("/financiado")
public class FinanciadoController {

    @Autowired
    private FinanciadoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroFinanciado dados){
        repository.save(new Financiado(dados));
    }

}
