package chainofresponsibility.structcode;

/**
 * Created by fisbii on 16-5-13.
 */
public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if(request.getRequestType().equals("请假") && request.getNumber() <= 2){
            System.out.println(name +":" + request.getRequestContent() + "数量" + request.getNumber() + "被批准");
        }else{
            if(superior != null){
                superior.requestApplications(request);
            }
        }
    }
}
