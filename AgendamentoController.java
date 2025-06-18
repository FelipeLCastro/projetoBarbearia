package com.barbearia.assinatura.controller;

import com.barbearia.assinatura.model.Agendamento;
import com.barbearia.assinatura.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    @PostMapping
    public Agendamento agendar(@RequestBody Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<Agendamento> listarPorUsuario(@PathVariable Long usuarioId) {
        return agendamentoRepository.findByUsuarioId(usuarioId);
    }
}
