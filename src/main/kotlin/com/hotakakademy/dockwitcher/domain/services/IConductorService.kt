package com.hotakakademy.dockwitcher.domain.services

import com.hotakakademy.dockwitcher.contracts.ConductorDto

interface IConductorService {
    fun create(conductorDto: ConductorDto)
}