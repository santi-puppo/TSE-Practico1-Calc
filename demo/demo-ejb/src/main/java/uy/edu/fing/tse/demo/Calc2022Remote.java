package uy.edu.fing.tse.demo;

import javax.ejb.Remote;

@Remote
public interface Calc2022Remote {
	
	public Integer SumarEnteros (Integer i1, Integer j2);

    public Integer RestarEnteros (Integer i1, Integer i2);

}
