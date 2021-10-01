package co.edu.uniandes.dse.parcial.services;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uniandes.dse.parcial.entities.AbogadoEntity;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;


@ExtendWith(SpringExtension.class)
@DataJpaTest
@Transactional
@Import(AbogadoService.class)
public class AbogadoServiceTest {
	
	@Autowired
	private AbogadoService abogadoService;
	
	@Autowired
	private TestEntityManager entityManager;
	
	private PodamFactory factory = new PodamFactoryImpl();
	
	private List<AbogadoEntity> abogadoList = new ArrayList<>();
	
	@BeforeEach
	void setUp() throws Exception {
		clearData();
		insertData();
	}
	
	
	private void clearData()
	{
		entityManager.getEntityManager().createQuery("delete from FacturaCompraOriginalEntity").executeUpdate();
	}
	
	private void insertData()
	{
		for (int i= 0;i<3;i++)
		{
			AbogadoEntity abogadoEntity = factory.manufacturePojo(AbogadoEntity.class);
			entityManager.persist(abogadoEntity);
			abogadoList.add(abogadoEntity);
		}
	}
	
	
	@Test
	void testGetAbogados() {
		List<AbogadoEntity> list = abogadoService.getAbogados();
		assertEquals(list.size(), abogadoList.size());
	}

}












