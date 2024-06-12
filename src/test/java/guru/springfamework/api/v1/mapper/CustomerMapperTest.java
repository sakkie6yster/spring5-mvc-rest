package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.CustomerDTO;
import guru.springfamework.domain.Customer;
import junit.framework.TestCase;

public class CustomerMapperTest extends TestCase {

    private static final Long ID = 2L;
    private static final String FIRSTNAME = "Tom";
    private static final String LASTNAME = "Clancy";
    CustomerMapper customerMapper = CustomerMapper.INSTANCE;

    public void testCustomerToCustomerDTO() {
        //given
        Customer customer = new Customer();
        customer.setId(ID);
        customer.setFirstname(FIRSTNAME);
        customer.setLastname(LASTNAME);

        //when
        CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);

        assertEquals(ID, customerDTO.getId());
        assertEquals(FIRSTNAME, customerDTO.getFirstname());
        assertEquals(LASTNAME, customerDTO.getLastname());
    }
}