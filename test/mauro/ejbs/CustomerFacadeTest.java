/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mauro.ejbs;

import java.util.List;
import java.util.Map;
import javax.ejb.embeddable.EJBContainer;
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
    
    public CustomerFacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
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
        Customer entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerFacade instance = (CustomerFacade)container.getContext().lookup("java:global/classes/CustomerFacade");
        instance.create(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class CustomerFacade.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Customer entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerFacade instance = (CustomerFacade)container.getContext().lookup("java:global/classes/CustomerFacade");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class CustomerFacade.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Customer entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerFacade instance = (CustomerFacade)container.getContext().lookup("java:global/classes/CustomerFacade");
        instance.remove(entity);
        container.close();
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
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerFacade instance = (CustomerFacade)container.getContext().lookup("java:global/classes/CustomerFacade");
        Customer expResult = null;
        Customer result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class CustomerFacade.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerFacade instance = (CustomerFacade)container.getContext().lookup("java:global/classes/CustomerFacade");
        List<Customer> expResult = null;
        List<Customer> result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
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
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerFacade instance = (CustomerFacade)container.getContext().lookup("java:global/classes/CustomerFacade");
        List<Customer> expResult = null;
        List<Customer> result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class CustomerFacade.
     */
    @Test
    public void testCount_0args() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerFacade instance = (CustomerFacade)container.getContext().lookup("java:global/classes/CustomerFacade");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
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
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerFacade instance = (CustomerFacade)container.getContext().lookup("java:global/classes/CustomerFacade");
        List<Customer> expResult = null;
        List<Customer> result = instance.findRange(first, pageSize, sortField, sortOrder, filters);
        assertEquals(expResult, result);
        container.close();
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
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerFacade instance = (CustomerFacade)container.getContext().lookup("java:global/classes/CustomerFacade");
        List<Customer> expResult = null;
        List<Customer> result = instance.findRange(first, pageSize, sortFields, filters);
        assertEquals(expResult, result);
        container.close();
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
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerFacade instance = (CustomerFacade)container.getContext().lookup("java:global/classes/CustomerFacade");
        int expResult = 0;
        int result = instance.count(filters);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
