package democlient;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import uy.edu.fing.tse.demo.Calc2022Remote;

public class Main {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		
		Properties props = new Properties();
		props.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");  
		props.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");  
		props.put(Context.PROVIDER_URL,"remote+http://localhost:8080"); 
		
		Context ctx  = new InitialContext(props);
		String jndiName = "ejb:demo/demo-ejb/Calc2022!uy.edu.fing.tse.demo.Calc2022Remote";
		
		Calc2022Remote calculadora = (Calc2022Remote)ctx.lookup(jndiName);
		
		Integer x = 4;
		Integer y = 4;
		
		System.out.println("##########################################");
		System.out.println("La suma es: " + calculadora.SumarEnteros(x, y));
		System.out.println("##########################################");

	}

}
