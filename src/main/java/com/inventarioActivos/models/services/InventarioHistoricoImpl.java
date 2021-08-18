package com.inventarioActivos.models.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.inventarioActivos.dto.InventarioDto;
import com.inventarioActivos.model.entity.InventarioHistorico;
import com.inventarioActivos.models.dao.IInventarioHistoricoDao;

@Service
public class InventarioHistoricoImpl implements IInventarioHistoricoService {

	@Autowired
	public IInventarioHistoricoDao inventarioDao;
	
	public static ObjectMapper mapper=new ObjectMapper();
	@Override
	public List<InventarioHistorico> findAll() {
		
		return (List<InventarioHistorico>) inventarioDao.findAll();
	}
	
	@Override
	@Transactional
	public InventarioHistorico save(InventarioHistorico inventario) {
		
		return inventarioDao.save(inventario);
	}

	@Override

	public InventarioHistorico findById(long idHistorico) {
		// TODO Auto-generated method stub
		return inventarioDao.findById(idHistorico).orElse(null);
	}

	@Override
	public void saveAll(List<InventarioDto> inventario) {
		try {
			
			Iterable<InventarioHistorico> list = inventario.stream().map(item->{
				InventarioHistorico obj= new InventarioHistorico();
				obj.setIdHistorico(item.getIdHistorico());
				System.out.println(item.getRealizado().toString());
				InventarioHistorico obj1 = findById(obj.getIdHistorico());
				obj1.setRealizado(item.getRealizado());
				return obj1;
			}).collect(Collectors.toList());
			
			
			System.out.println("paso"+list);
			inventarioDao.saveAll(list);
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}



	
	
	
	
	
}
