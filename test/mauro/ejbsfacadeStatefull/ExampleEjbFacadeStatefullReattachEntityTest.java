/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mauro.ejbsfacadeStatefull;

import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import static javax.ejb.TransactionAttributeType.REQUIRES_NEW;
import javax.ejb.embeddable.EJBContainer;
import javax.inject.Inject;
import javax.naming.Context;
import javax.naming.NamingException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mauronew
 */
public class ExampleEjbFacadeStatefullReattachEntityTest {

    private static EJBContainer container;
    private Context context;

    @EJB
    private Caller transactionalCaller;
    @Inject
    ExampleEjbFacadeStatefullReattachEntity ejbstatefull;

    public ExampleEjbFacadeStatefullReattachEntityTest() {
    }

    @BeforeClass
    public static void setUpClass() {
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
        container.close();
    }

    @Before
    public void setUp() {
        context = container.getContext();
        try {
            this.context.bind("Inject", this);
        } catch (NamingException ex) {
            Logger.getLogger(ExampleEjbFacadeStatefullReattachEntityTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of createCustomer method, of class
     * ExampleEjbFacadeStatefullReattachEntity.
     */
    
    
    private void doWork() throws Exception {
    
   
        System.out.println("createCustomer");
        String name = "pippo";
        long resultid
                = ejbstatefull.createCustomer(name);
        
      //  long expResult = 0L;
          /*assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
        
        System.out.println("The id of Custoemr created is:"+resultid);
        assertTrue("the id created is >0",resultid>0);
    }

    /**
     * Test of checkout method, of class
     * ExampleEjbFacadeStatefullReattachEntity.
     */
  /*
     /*
    @Test
    public void testCheckout() throws Exception {
        System.out.println("checkout");
        ExampleEjbFacadeStatefullReattachEntity instance = new ExampleEjbFacadeStatefullReattachEntity();
        instance.checkout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of getOrdersCollection method, of class
     * ExampleEjbFacadeStatefullReattachEntity.
     */
    
     /*
    @Test
    public void testGetOrdersCollection() throws Exception {
        System.out.println("getOrdersCollection");
        ExampleEjbFacadeStatefullReattachEntity instance = new ExampleEjbFacadeStatefullReattachEntity();
        Collection<Order> expResult = null;
        Collection<Order> result = instance.getOrdersCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of getCustomeratached method, of class
     * ExampleEjbFacadeStatefullReattachEntity.
     */
    
     /*
    @Test
    public void testGetCustomeratached() throws Exception {
        System.out.println("getCustomeratached");
        ExampleEjbFacadeStatefullReattachEntity instance = new ExampleEjbFacadeStatefullReattachEntity();
        Customer expResult = null;
        Customer result = instance.getCustomeratached();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of setCustomeratached method, of class
     * ExampleEjbFacadeStatefullReattachEntity.
     */
    /*
    @Test
    public void testSetCustomeratached() throws Exception {
        System.out.println("setCustomeratached");
        Customer customerToReattach = null;
        ExampleEjbFacadeStatefullReattachEntity instance = new ExampleEjbFacadeStatefullReattachEntity();
        instance.setCustomeratached(customerToReattach);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    
     public static interface Caller {
        public <V> V call(Callable<V> callable) throws Exception;
    }

    /**
     * This little bit of magic allows our test code to execute in
     * the scope of a container controlled transaction.
     */
    @Stateless
    @TransactionAttribute(REQUIRES_NEW)
    public static class TransactionBean implements Caller {

        public <V> V call(Callable<V> callable) throws Exception {
            return callable.call();
        }
    }
   
     
     public void testWithTransaction() throws Exception {
        transactionalCaller.call(new Callable() {
            public Object call() throws Exception {
                doWork();
                return null;
            }
        });
    }
}
