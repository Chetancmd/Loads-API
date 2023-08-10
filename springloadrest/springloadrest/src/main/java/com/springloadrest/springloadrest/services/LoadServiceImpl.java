package com.springloadrest.springloadrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springloadrest.springloadrest.dao.LoadDao;
import com.springloadrest.springloadrest.entities.Load;

@Service
public class LoadServiceImpl implements LoadService {
	
	@Autowired
	private LoadDao loadDao;

	
//	List <Load> list;
	
	public LoadServiceImpl() {
		
//		list = new ArrayList<>();
	}
	@Override
	public List<Load> getLoads() {
		// TODO Auto-generated method stub
		return loadDao.findAll();
	}
	@Override
	public Load getLoad(long shipperId) {
//		Load l=null;
//		for(Load load:list) {
//			if(load.getShipperId()==shipperId) {
//				l=load;
//				break;
//			}
//		}
		return loadDao.getOne(shipperId);
	}
	@Override
	public Load addLoad(Load load) {
//		list.add(load);
		loadDao.save(load);
		return load;
	}
	@Override
	public Load updateLoad(Load load) {
//		list.forEach(e ->{
//			if(e.getShipperId() ==load.getShipperId()){
//				e.setLoadingPoint(load.getLoadingPoint());
//				e.setUnloadingPoint(load.getUnloadingPoint());
//				e.setTruckType(load.getTruckType());
//				e.setProductType(load.getProductType());
//				e.setWeight(load.getWeight());
//				e.setOptional(load.getOptional());
//				e.setNoOfTrucks(load.getNoOfTrucks());
//				e.setDate(load.getDate());
//				e.setShipperId(load.getShipperId());
//			
//		}
//		});
		
		loadDao.save(load);
		return load;
	}
	@Override
	public void deleteLoad(long ParseLong) {
//		list=this.list.stream().filter(e->e.getShipperId()!=ParseLong).collect(Collectors.toList());
	Load entity = loadDao.getOne(parseLong);
	loadDao.delete(entity);
	
	}

}
