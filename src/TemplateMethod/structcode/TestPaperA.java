package TemplateMethod.structcode;

/**
 * Created by fisbii on 16-3-28.
 */
public class TestPaperA extends TestPaper {
    @Override
    public String answer1() {
        return "a";
    }

    @Override
    public String answer2() {
        return "b";
    }

    @Override
    public String answer3() {
        return "c";
    }
}
