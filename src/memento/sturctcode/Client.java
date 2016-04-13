package memento.sturctcode;

/**
 * Created by fisbii on 16-4-13.
 */
public class Client {

    public static void main(String args[]){
        //大战boss前
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.getInitState();
        lixiaoyao.stateDisplay();

        //保存进度
        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setMemento(lixiaoyao.saveState());

        //大战boss损耗严重
        lixiaoyao.fight();
        lixiaoyao.stateDisplay();

        //回复之前状态
        lixiaoyao.RecoveryState(stateAdmin.getMemento());
        lixiaoyao.stateDisplay();
    }
}
