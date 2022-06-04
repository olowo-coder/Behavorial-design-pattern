package memento;

import java.util.Objects;
import java.util.stream.Stream;

public class MementoDemo {
    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();

        Employee employee = new Employee();

        employee.setName("John Doe");
        employee.setAddress("12 main Streert");
        employee.setPhone("888-123-456");

        System.out.println("Employee before saved: " + employee);

        careTaker.save(employee);

        employee.setPhone("444-938-479");

        careTaker.save(employee);

        System.out.println("Employee after changed of phone number: " + employee);

        employee.setPhone("333-567-909"); // we have not called save!

        careTaker.revert(employee);

        System.out.println("Reverts to last: " + employee);

        careTaker.revert(employee);

        System.out.println("Reverts to original: " + employee);

        careTaker.revert(employee);

        System.out.println("Reverts to original: " + employee);

//        employee.setPhone(null);

        System.out.println(employee);
        System.out.println(Stream.of(employee.getName(), employee.getPhone()).anyMatch(Objects::isNull));

    }
}
