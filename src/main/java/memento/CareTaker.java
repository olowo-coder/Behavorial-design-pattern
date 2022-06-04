package memento;

import java.util.Stack;

//caretaker
public class CareTaker {

    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee emp){
        employeeHistory.push(emp.save());
    }

    public void revert(Employee emp){
        if(employeeHistory.empty()) return;
        emp.revert(employeeHistory.pop());
    }
}
