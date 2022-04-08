package uy.edu.fing.tse.demo;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import uy.edu.fing.tse.data.MySingletonRemote;

/**
 * Session Bean implementation class Calc2021
 */
@Stateless
public class Calc2022 implements Calc2022Remote {
	@EJB MySingletonRemote singleton;
    /**
     * Default constructor. 
     */
    public Calc2022() {
        // TODO Auto-generated constructor stub
    }
    
	public Integer SumarEnteros (Integer i1, Integer j2){
//    	return i1 + j2;
		return singleton.sumar(i1, j2);
    }

    public Integer RestarEnteros (Integer i1, Integer i2){
    	return i1 - i2;
    }

}
