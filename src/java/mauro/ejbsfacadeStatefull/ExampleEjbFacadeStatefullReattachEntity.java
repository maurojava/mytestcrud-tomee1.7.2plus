/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mauro.ejbsfacadeStatefull;

import maurointerfaces.EjbFacadeForStatefulReattachEntityInterface;
import java.util.Collection;
import javax.ejb.EJB;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import mauro.entities.Customer;
import mauro.entities.Order;

/**
 *
 * @author mauronew
 */
@Stateful
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class ExampleEjbFacadeStatefullReattachEntity implements EjbFacadeForStatefulReattachEntityInterface {

        
    @PersistenceContext(unitName = "mytestcrud-tomee1.7.2plusPU",type = PersistenceContextType.EXTENDED)
    private EntityManager em;
    //@EJB StatelessLocal stateless;
    private Customer customeratached;

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    @Override
    public long createCustomer(String name) {
        Customer customernew = new Customer();
        customernew.setName(name);
        em.persist(customernew);
        this.setCustomeratached(customernew);
        return customernew.getId();
    }

    @Remove
    @Override
    public void checkout() {
        this.em.clear();
    }

    @Override
    public Collection<Order> getOrdersCollection() {
        return this.customeratached.getOrders();
    }

    @Override
    public Customer getCustomeratached() {
        return customeratached;
    }

    @Override
    public void setCustomeratached(Customer customerToReattach) {
        Customer customerreattached = this.em.merge(customerToReattach);
        this.customeratached = customerreattached;

    }

}
