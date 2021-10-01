package co.edu.uniandes.dse.parcial.services;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uniandes.dse.parcial.entities.AbogadoEntity;
import co.edu.uniandes.dse.parcial.repositories.AbogadoRepository;

@Service
public class AbogadoService {
	
	@Autowired
	AbogadoRepository abogadoRepository;
	
	@Transactional
	public List<AbogadoEntity> getAbogados(){
		return abogadoRepository.findAll();
	}
}
