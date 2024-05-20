package com.hotakakademy.dockwitcher.controllers

import com.hotakakademy.dockwitcher.domain.repositories.ITractoraRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class TractorasController (
        private val repository: ITractoraRepository
) {

    @GetMapping("/tractoras")
    fun listadoRecogidas(model: Model
    ): String {
        val tractoras = repository.findAll()
        model.addAttribute("tractoras", tractoras)
        return "listadotractoras"
    }
}