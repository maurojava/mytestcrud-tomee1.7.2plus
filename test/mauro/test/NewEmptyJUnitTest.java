/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mauro.test;
import java.util.Properties;
import junit.framework.TestCase;
import javax.ejb.embeddable.EJBContainer;
import javax.inject.Inject;
import javax.naming.NamingException;
import mauro.ejbs.CustomerFacade;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author mauronew
 */
public class NewEmptyJUnitTest extends TestCase{

    
    
@Inject
private CustomerFacade custFacade; 
    
    private static EJBContainer container;

    public NewEmptyJUnitTest() {
    }

    @BeforeClass
    public static void start() {
        Properties p = new Properties();
        
        // create some resources
p.put("ildatabase", "new://Resource?type=DataSource");
p.put("ildatabase.JdbcDriver", "org.hsqldb.jdbcDriver");
p.put("ildatabase.JdbcUrl", "jdbc:hsqldb:mem:testdb");
p.put("ildatabase.JtaManaged", "true");
        container = EJBContainer.createEJBContainer(p);

    }

    @AfterClass
    public static void tearDownClass() {
      container.close();}

    @Before
    public void inject() throws NamingException {
        container.getContext().bind("inject", this);
    }

    @After
    public static void stop() {
        
    }

    
    @Test
     public void hello() {
     assertNotNull(custFacade);
     }
}
