package com.barbearia.assinatura.repository;

import com.barbearia.assinatura.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    List<Agendamento> findByUsuarioId(Long usuarioId);
}
