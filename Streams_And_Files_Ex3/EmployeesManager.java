package Second_Evaluation.Streams_And_Files_Ex3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeesManager {
    private String fileName;

    public EmployeesManager(String fileName){
        this.fileName=fileName;
    }

    public void saveEmployees(List<Employee> employeeList){
        FileOutputStream fos=null;
        ObjectOutputStream oos= null;

        try{
            fos=new FileOutputStream(this.fileName);
            oos=new ObjectOutputStream(fos);

            for(Employee employee:employeeList){
                oos.writeObject(employee);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(oos!=null){
                    oos.close();
                }
            }catch (IOException e){
                e.printStackTrace();
                }
            try{
                if(fos!=null){
                    fos.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void displayEmployees(){
        FileInputStream fis=null;
        ObjectInputStream ois=null;

        try{
            fis=new FileInputStream(this.fileName);
            ois=new ObjectInputStream(fis);

            Employee e=(Employee) ois.readObject();
            while(e!=null){
                e.display();
                e=(Employee) ois.readObject();

            }
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(ois!=null){
                    ois.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            try{
                if(fis!=null){
                    fis.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public Employee searchEmployee(String name){
        FileInputStream fis=null;
        ObjectInputStream ois=null;

        Employee foundEmployee=null;

        try{
            fis=new FileInputStream(this.fileName);
            ois=new ObjectInputStream(fis);

            boolean found=false;

            Employee e=(Employee) ois.readObject();
            while(e!=null && !found){
                if(e.getName().equals(name)){
                    found=true;
                    foundEmployee=e;
                }
                e=(Employee) ois.readObject();

            }
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return foundEmployee;
    }



    public static void main(String[] args) {
        EmployeesManager em=new EmployeesManager("employee.data");

        Employee e1=new Employee("Eneko", 123f, new MobilePhone(12354234, 15f));
        Employee e2=new Employee("Kevin", 173f, new MobilePhone(22456754, 45f));
        Employee e3=new Employee("Izan", 213f, new MobilePhone(12341213, 32f));

        List<Employee> lEmployees=new ArrayList<>();
        lEmployees.add(e1);
        lEmployees.add(e2);
        lEmployees.add(e3);

        em.saveEmployees(lEmployees);
        em.displayEmployees();

        Employee e= em.searchEmployee("Kevin");
        e.display();
    }
}

