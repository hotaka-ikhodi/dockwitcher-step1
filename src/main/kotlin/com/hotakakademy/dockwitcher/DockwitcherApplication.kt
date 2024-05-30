package com.hotakakademy.dockwitcher

import com.hotakakademy.dockwitcher.builders.MapperBuilder
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DockwitcherApplication {

	@Autowired
	private val mapperBuilder : MapperBuilder? = null

	@Bean
	fun getMapper(): ModelMapper? {
		return mapperBuilder!!.build()
	}
}

fun main(args: Array<String>) {
	runApplication<DockwitcherApplication>(*args)
}
