package com.hotakakademy.dockwitcher.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class RecepcionesController {
    @GetMapping("/recepciones")
    fun listadoRecogidas(model: Model
    ): String {
        model.addAttribute("recepciones", null)
        return "listadorecepciones"
    }
}
