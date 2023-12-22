package champions;

import java.util.List;

public class Garen extends Champion {
    private Garen(){}

    public Garen(int nameIndex){
        mPhysical = 1000;
        mAttack = 100;
        mAttackMents = List.of(
                "승리가 눈 앞에 있다!",
                "저주받을 악당 놈들.",
                "악행과 싸워라!");
        mName = "가렌" + nameIndex;
    }
}
