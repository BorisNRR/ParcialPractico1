package co.edu.uniandes.dse.parcial.controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uniandes.dse.parcial.entities.AbogadoEntity;
import co.edu.uniandes.dse.parcial.services.AbogadoService;
import co.edu.uniandes.dse.parcial.dto.AbogadoDTO;


@RestController
@RequestMapping("/abogados")
public class AbogadoController {

	
	@Autowired
	private AbogadoService abogadoService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	
	@GetMapping
	@ResponseStatus(code= HttpStatus.OK)
	public List<AbogadoDTO> findAll(){
		List<AbogadoEntity> bicicletas = abogadoService.getAbogados();
		return modelMapper.map(bicicletas, new TypeToken<List<AbogadoDTO>>(){
		}.getType());
		
	}
}
