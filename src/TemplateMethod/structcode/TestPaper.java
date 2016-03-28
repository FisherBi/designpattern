package TemplateMethod.structcode;

/**
 * Created by fisbii on 16-3-28.
 */
public abstract class TestPaper {
    public void TestQuestion1(){
        System.out.println("问题1【】a. b. c. d.");
        System.out.printf("答案：" + answer1());
        System.out.println();
    }
    public void TestQuestion2(){
        System.out.println("问题2【】a. b. c. d.");
        System.out.printf("答案：" + answer2());
        System.out.println();
    }
    public void TestQuestion3(){
        System.out.println("问题3【】a. b. c. d.");
        System.out.printf("答案：" + answer3());
        System.out.println();
    }

    public abstract String answer1();

    public abstract String answer2();

    public abstract String answer3();

}
