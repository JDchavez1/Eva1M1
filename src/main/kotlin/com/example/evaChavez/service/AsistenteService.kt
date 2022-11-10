package com.example.evaChavez.service

import com.example.evaChavez.model.Asistente
import com.example.evaChavez.repository.AsistenteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class AsistenteService {
    @Autowired
    lateinit var asistenteRepository: AsistenteRepository
    fun save (asistente:Asistente): Asistente{
        return asistenteRepository.save(asistente)
    }
    fun list ():List<Asistente>{
        return asistenteRepository.findAll()
    }
}