package TemplateMethod.structcode;

/**
 * Created by fisbii on 16-3-28.
 */
public class TestPaperB extends TestPaper {
    @Override
    public String answer1() {
        return "b";
    }

    @Override
    public String answer2() {
        return "a";
    }

    @Override
    public String answer3() {
        return "c";
    }
}
