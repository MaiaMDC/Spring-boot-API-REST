package sng.veiculos.api.repository;

import org.hibernate.boot.archive.internal.JarProtocolArchiveDescriptor;
import org.springframework.data.jpa.repository.JpaRepository;
import sng.veiculos.api.financiado.Financiado;

public interface FinanciadoRepository extends JpaRepository<Financiado, String> {
}
