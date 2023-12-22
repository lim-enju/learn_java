package champions;

import java.util.List;

public class Sol extends Champion {
    private Sol(){}
    public Sol(int nameIndex){
        mPhysical = 300;
        mAttack = 500;
        mAttackMents = List.of(
                "네 자리를 찾아주지.",
                "파멸이 임박했다. 짜릿하지 않나?",
                "내가 너희를 친히 격멸해주마.");
        mName = "아우렐리온 솔" + nameIndex;
    }
}
