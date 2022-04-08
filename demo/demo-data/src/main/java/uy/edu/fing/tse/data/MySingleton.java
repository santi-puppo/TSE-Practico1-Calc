package uy.edu.fing.tse.data;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;

/**
 * Session Bean implementation class MySingleton
 */
@Singleton
public class MySingleton implements MySingletonRemote, MySingletonLocal {

    /**
     * Default constructor. 
     */
    public MySingleton() {
        // TODO Auto-generated constructor stub
    }
    
    public Integer sumar (Integer i, Integer j) {
    	return i+j;
    }

}
