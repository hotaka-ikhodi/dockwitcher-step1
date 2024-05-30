package com.hotakakademy.dockwitcher.domain.factories

import com.hotakakademy.dockwitcher.contracts.ConductorDto
import com.hotakakademy.dockwitcher.domain.entities.Conductor
import com.hotakakademy.dockwitcher.domain.repositories.IConductorRepository
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Service


@Service
class ConductorFactory (
        private val repository: IConductorRepository,
        private val modelMapper: ModelMapper
        ): IConductorFactory {
    override fun createFromDto(conductorDto: ConductorDto): Conductor {
        val conductor = Conductor()
        conductor.setRepository(repository)
        modelMapper.map(conductorDto, conductor)
        return conductor
    }

}
