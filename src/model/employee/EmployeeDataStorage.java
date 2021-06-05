package model.employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import util.AppLog;

public class EmployeeDataStorage implements EmployeeDataStorageInterface {

    private static EmployeeDataStorage uniqueInstance;

    private ArrayList<EmployeeModelInterface> employees;

    static {
        uniqueInstance = new EmployeeDataStorage();
    }

    private EmployeeDataStorage() {
        employees = new ArrayList<>();
    }

    public static EmployeeDataStorageInterface getInstance() {
        return uniqueInstance;
    }

    @Override
    public void updateFromDB(Connection connection) {
        try {
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM " + EmployeeModel.TABLE_NAME;

            ResultSet resultSet = statement.executeQuery(query);

            employees.clear();

            while (resultSet.next()) {
                EmployeeModelInterface employee = new EmployeeModel();
                employee.setProperty(resultSet);
                employees.add(employee);
            }

            AppLog.getLogger().info("Update employee database: sucessfully, "
                    + employees.size() + " rows inserted.");

        } catch (SQLException ex) {
            AppLog.getLogger().fatal("Update employee database: error.");
        }
    }

    @Override
    public EmployeeModelInterface getEmployee(String employeeIDText) {
        for (EmployeeModelInterface element : employees) {
            if (element.getEmployeeIDText().equals(employeeIDText)) {
                return element;
            }
        }
        throw new IllegalArgumentException("Employee id '" + employeeIDText + "' is not existed.");
    }

    @Override
    public int getSize() {
        return this.employees.size();
    }

    @Override
    public EmployeeModelInterface createEmployee() {
        EmployeeModelInterface newEmployee = new EmployeeModel();
        this.employees.add(newEmployee);
        return newEmployee;
    }
}
