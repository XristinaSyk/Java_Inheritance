public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public void retire(boolean isRetired){
        this.isRetired=isRetired;
        if(isRetired==true)
            System.out.println("Employee " + name + "is retired");
        else
            System.out.println("Employee " + name + "is not retired");
    }
}
