package guru.springfamework.bootstrap;

import guru.springfamework.domain.Category;
import guru.springfamework.domain.Customer;
import guru.springfamework.repositories.CategoryRepository;
import guru.springfamework.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final CustomerRepository customerRepository;

    public Bootstrap(CategoryRepository categoryRepository, CustomerRepository customerRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadFruits();
        loadCustomers();
    }

    private void loadFruits() {
        Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        dried.setName("Dried");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");

        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(fresh);
        categoryRepository.save(exotic);
        categoryRepository.save(nuts);

        System.out.println("Categories Loaded = " + categoryRepository.count());
    }

    private void loadCustomers() {
        Customer carlos = new Customer();
        carlos.setFirstname("Carlos");
        carlos.setLastname("Sánchez");

        Customer garrick = new Customer();
        garrick.setFirstname("Carrick");
        garrick.setLastname("Barnett");

        Customer larry = new Customer();
        larry.setFirstname("Larry");
        larry.setLastname("Lawson");

        Customer helen = new Customer();
        helen.setFirstname("Helen");
        helen.setLastname("Andrus");

        Customer ted = new Customer();
        ted.setFirstname("Ted");
        ted.setLastname("Walters");

        customerRepository.save(carlos);
        customerRepository.save(garrick);
        customerRepository.save(larry);
        customerRepository.save(helen);
        customerRepository.save(ted);

        System.out.println("Customers Loaded = " + customerRepository.count());
    }
}
