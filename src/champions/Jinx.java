package champions;

import java.util.List;

public class Jinx extends Champion {

    private Jinx(){}
    public Jinx(int nameIndex){
        mPhysical = 400;
        mAttack = 400;
        mAttackMents = List.of(
                "가만히 좀 있어봐, 총 좀 쏘게!",
                "셋을 셀 동안 기회를 주지. 셋, 끝이야! 헤헷!",
                "엎드려! 농담이야~ 헷! 그래봤자 소용없어!");
        mName = "징크스" + nameIndex;
    }
}
