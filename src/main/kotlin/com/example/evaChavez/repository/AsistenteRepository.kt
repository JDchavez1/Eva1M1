package com.example.evaChavez.repository

import com.example.evaChavez.model.Asistente
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository

interface AsistenteRepository:JpaRepository<Asistente, Long?> {

}