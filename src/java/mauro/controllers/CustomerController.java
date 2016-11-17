package mauro.controllers;

import mauro.entities.Customer;
import mauro.ejbs.CustomerFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Named(value = "customerController")
@SessionScoped
public class CustomerController extends AbstractController<Customer> {

    @Inject
    private CustomerFacade ejbFacade;

    /**
     * Initialize the concrete Customer controller bean. The AbstractController
     * requires the EJB Facade object for most operations.
     */
    @PostConstruct
    @Override
    public void init() {
        super.setFacade(ejbFacade);
    }

    public CustomerController() {
        // Inform the Abstract parent controller of the concrete Customer Entity
        super(Customer.class);
    }

}
