package composite.structcode;

/**
 * Created by fisbii on 16-4-20.
 */
public class Client {
    public static void main(String args[]){
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));
        root.display(1);
        root.LineOfDuty();
    }
}
