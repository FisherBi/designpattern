package prototype.structcode;

/**
 * 该实例为浅复制，注意若有变量为引用类型时，要把引用对象的变量指向复制过的新对象，而不是原有的引用对象
 * Created by fisbii on 16-3-25.
 */
public class Client {
    public static void main(String args[]){
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男","29");
        a.setWorkExperience("1998-5-6","xx公司");

        Resume b = (Resume)a.clone();
        b.setWorkExperience("2001-4-2","YY企业");

        Resume c = (Resume)a.clone();
        c.setPersonalInfo("男","24");

        a.display();
        b.display();
        c.display();
    }
}
