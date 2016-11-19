/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mauro.ejbs;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.embeddable.EJBContainer;
import javax.inject.Inject;
import javax.naming.Context;
import javax.naming.NamingException;
import mauro.entities.Customer;
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
public class CustomerFacadeTest {
      private static EJBContainer container;
    private static Context context;
    @Inject
     CustomerFacade instance ;
    public CustomerFacadeTest() {
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
   container.close();  }
    
    @Before
    public void setUp() {
          try {
              context.bind("inject",this) ;
          } catch (NamingException ex) {
              Logger.getLogger(CustomerFacadeTest.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    @After
    public void tearDown() {
   }

    /**
     * Test of create method, of class CustomerFacade.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Customer customer  = new Customer("pippo");
           instance.create(customer) ;
     int numercustomer=  instance.count();
        assertTrue(numercustomer!=0);
      
       
    }

    /**
     * Test of edit method, of class CustomerFacade.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Customer entity = null;
         instance.edit(entity);
      
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class CustomerFacade.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        instance.remove(entity);
       
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class CustomerFacade.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Object id = null;
        Customer expResult = null;
        Customer result = instance.find(id);
        assertEquals(expResult, result);
      
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class CustomerFacade.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        List<Customer> expResult = null;
        List<Customer> result = instance.findAll();
        assertEquals(expResult, result);
      
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class CustomerFacade.
     */
    @Test
    public void testFindRange_intArr() throws Exception {
        System.out.println("findRange");
        int[] range = null;
         List<Customer> expResult = null;
        List<Customer> result = instance.findRange(range);
        assertEquals(expResult, result);
       
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class CustomerFacade.
     */
    @Test
    public void testCount_0args() throws Exception {
        System.out.println("count");
         int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
      
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class CustomerFacade.
     */
    @Test
    public void testFindRange_5args() throws Exception {
        System.out.println("findRange");
        int first = 0;
        int pageSize = 0;
        String sortField = "";
        String sortOrder = "";
        Map<String, Object> filters = null;
         List<Customer> expResult = null;
        List<Customer> result = instance.findRange(first, pageSize, sortField, sortOrder, filters);
        assertEquals(expResult, result);
       
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class CustomerFacade.
     */
    @Test
    public void testFindRange_4args() throws Exception {
        System.out.println("findRange");
        int first = 0;
        int pageSize = 0;
        Map<String, String> sortFields = null;
        Map<String, Object> filters = null;
        List<Customer> expResult = null;
        List<Customer> result = instance.findRange(first, pageSize, sortFields, filters);
        assertEquals(expResult, result);
      
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class CustomerFacade.
     */
    @Test
    public void testCount_Map() throws Exception {
        System.out.println("count");
        Map<String, Object> filters = null;
        int expResult = 0;
        int result = instance.count(filters);
        assertEquals(expResult, result);
      
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
