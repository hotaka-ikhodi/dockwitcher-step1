package com.hotakakademy.dockwitcher.domain.services

import com.hotakakademy.dockwitcher.contracts.ConductorDto
import com.hotakakademy.dockwitcher.domain.factories.IConductorFactory
import org.springframework.stereotype.Service

@Service
class ConductorService (
        private val conductorFactory: IConductorFactory,
) : IConductorService {
    override fun create(conductorDto: ConductorDto) {
        val conductor = conductorFactory.createFromDto(conductorDto)
        conductor.save()
    }
}
