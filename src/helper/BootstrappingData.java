package helper;

import java.util.ArrayList;
import java.util.List;

public class BootstrappingData<T> {
    private Class<T> clazz;

    public BootstrappingData(Class<T> clazz)
    {
        this.clazz = clazz;
    }
    public T buildOne() throws InstantiationException,
            IllegalAccessException
    {
        return clazz.newInstance();
    }


    public void bootStrapData() {
        List<T> employeeList = new ArrayList<>();

        /*employeeList.add(new T ("arul suju", 81, "12 lAKH P.A"));
        employeeList.add(new Employee("gyan yadav", 85, "10 lAKH P.A"));
        employeeList.add(new Employee("anita yadav", 70, "15 lAKH P.A"));
        employeeList.add(new Employee("naveen", 60, "16 lAKH P.A"));*/
    }

    private void classType(String arul_suju, int i, String s) {
    }

}
