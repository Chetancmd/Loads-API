package com.springloadrest.springloadrest.services;
import java.util.*;

import com.springloadrest.springloadrest.entities.Load;

public interface LoadService {
	
	public List<Load> getLoads();
	
	public Load getLoad(long shipperId);
	
	public Load addLoad(Load load);

	public Load updateLoad(Load load);
	
	public void deleteLoad(long ParseLong);
	

}
