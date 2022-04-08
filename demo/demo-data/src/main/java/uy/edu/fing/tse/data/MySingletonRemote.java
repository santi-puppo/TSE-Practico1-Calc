package uy.edu.fing.tse.data;

import javax.ejb.Remote;

@Remote
public interface MySingletonRemote {
	public Integer sumar (Integer i, Integer j);

}
