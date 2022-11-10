package com.example.evaChavez.controller

import com.example.evaChavez.model.Asistente
import com.example.evaChavez.service.AsistenteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/asistente")

class AsistenteController {
    @Autowired
    lateinit var asistenteService: AsistenteService
    @PostMapping
    fun  save (@RequestBody asistente:Asistente):Asistente{
        return  asistenteService.save(asistente)
    }
    @GetMapping
    fun list ():List<Asistente>{
        return asistenteService.list()
    }
}