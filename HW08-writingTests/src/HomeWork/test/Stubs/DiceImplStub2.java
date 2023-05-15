package HomeWork.test.Stubs;

import HomeWork.Game.code.DiceImpl;

public class DiceImplStub2 extends DiceImpl {
    private boolean isFirstInputCall = true;
    @Override
    public int roll() {
        int res;
        if ( isFirstInputCall){
            res = 3;
            isFirstInputCall = false;
        }else {
            res = 5;
        }
        return res;
    }
}
