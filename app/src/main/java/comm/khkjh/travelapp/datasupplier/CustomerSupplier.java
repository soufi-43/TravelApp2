package comm.khkjh.travelapp.datasupplier;

import java.util.ArrayList;
import java.util.List;

import comm.khkjh.travelapp.model.Customer;

public class CustomerSupplier {

    public static List<Customer> getCustomer() {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "ahmed",
                "belhamara", "soufi@h.com",
                "https://api.adorable.io/avatars/285/abott@adorable.png",
                "123 somewhere", "+2135486974", 25));
        customers.add(new Customer(2, "ahmed1",
                "belhamara", "soufi@h.com",
                "https://api.adorable.io/avatars/285/abott@adorable.png",
                "123 somewhere", "+2135486974", 25));
        customers.add(new Customer(3, "ahmed2",
                "belhamara", "soufi@h.com",
                "https://api.adorable.io/avatars/285/abott@adorable.png",
                "123 somewhere", "+2135486974", 25));
        customers.add(new Customer(4, "ahmed3",
                "belhamara", "soufi@h.com",
                "https://api.adorable.io/avatars/285/abott@adorable.png",
                "123 somewhere", "+2135486974", 25));

        customers.add(new Customer(5, "ahmed4",
                "belhamara", "soufi@h.com",
                "https://api.adorable.io/avatars/285/abott@adorable.png",
                "123 somewhere", "+2135486974", 25));


        return customers;
    }
}
