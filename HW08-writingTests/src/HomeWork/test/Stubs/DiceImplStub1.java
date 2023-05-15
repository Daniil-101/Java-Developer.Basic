package HomeWork.test.Stubs;

import HomeWork.Game.code.DiceImpl;

public class DiceImplStub1 extends DiceImpl {

    private boolean isFirstInputCall = true;
    @Override
    public int roll() {
        int res;
        if (isFirstInputCall){
            res = 5;
            isFirstInputCall = false;
        }else {
            res = 3;
        }
        return res;
    }
}
