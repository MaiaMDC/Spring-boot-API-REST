package sng.veiculos.api.financiado;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sng.veiculos.api.dto.DadosCadastroFinanciado;

import java.security.PrivilegedAction;

@Table(name = "financiado")
@Entity(name = "Financiado")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Financiado {

    @Id @generatedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    String numChassi;
    String numDocumentoDevedor;
    String nomeAgenteDevedor;
    String nomeNovoFinanciado;
    Double numApontamento;

    public Financiado(DadosCadastroFinanciado dados) {
        this.numChassi = dados.numChassi();
        this.numDocumentoDevedor = dados.numDocumentoDevedor();
        this.nomeAgenteDevedor = dados.nomeAgenteDevedor();
        this.nomeNovoFinanciado = dados.nomeNovoFinanciado();
        this.numApontamento = dados.numApontamento();
    }
}
