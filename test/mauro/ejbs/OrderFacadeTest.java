/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mauro.ejbs;

import java.util.List;
import java.util.Map;
import javax.ejb.embeddable.EJBContainer;
import mauro.entities.Order;
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
public class OrderFacadeTest {
    
    public OrderFacadeTest() {
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
     * Test of create method, of class OrderFacade.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Order entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        OrderFacade instance = (OrderFacade)container.getContext().lookup("java:global/classes/OrderFacade");
        instance.create(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class OrderFacade.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Order entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        OrderFacade instance = (OrderFacade)container.getContext().lookup("java:global/classes/OrderFacade");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class OrderFacade.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Order entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        OrderFacade instance = (OrderFacade)container.getContext().lookup("java:global/classes/OrderFacade");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class OrderFacade.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Object id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        OrderFacade instance = (OrderFacade)container.getContext().lookup("java:global/classes/OrderFacade");
        Order expResult = null;
        Order result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class OrderFacade.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        OrderFacade instance = (OrderFacade)container.getContext().lookup("java:global/classes/OrderFacade");
        List<Order> expResult = null;
        List<Order> result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class OrderFacade.
     */
    @Test
    public void testFindRange_intArr() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        OrderFacade instance = (OrderFacade)container.getContext().lookup("java:global/classes/OrderFacade");
        List<Order> expResult = null;
        List<Order> result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class OrderFacade.
     */
    @Test
    public void testCount_0args() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        OrderFacade instance = (OrderFacade)container.getContext().lookup("java:global/classes/OrderFacade");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class OrderFacade.
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
        OrderFacade instance = (OrderFacade)container.getContext().lookup("java:global/classes/OrderFacade");
        List<Order> expResult = null;
        List<Order> result = instance.findRange(first, pageSize, sortField, sortOrder, filters);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class OrderFacade.
     */
    @Test
    public void testFindRange_4args() throws Exception {
        System.out.println("findRange");
        int first = 0;
        int pageSize = 0;
        Map<String, String> sortFields = null;
        Map<String, Object> filters = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        OrderFacade instance = (OrderFacade)container.getContext().lookup("java:global/classes/OrderFacade");
        List<Order> expResult = null;
        List<Order> result = instance.findRange(first, pageSize, sortFields, filters);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class OrderFacade.
     */
    @Test
    public void testCount_Map() throws Exception {
        System.out.println("count");
        Map<String, Object> filters = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        OrderFacade instance = (OrderFacade)container.getContext().lookup("java:global/classes/OrderFacade");
        int expResult = 0;
        int result = instance.count(filters);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
