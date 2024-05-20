package com.hotakakademy.dockwitcher.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class RecogidasController {
    @GetMapping("/recogidas")
    fun listadoRecogidas(model: Model
    ): String {
        model.addAttribute("items", null)
        return "listadorecogidas"
    }
}
