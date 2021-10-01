package co.edu.uniandes.dse.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.uniandes.dse.parcial.entities.AbogadoEntity;


@Repository
public interface AbogadoRepository extends JpaRepository<AbogadoEntity, Long> {

}