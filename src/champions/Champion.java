package champions;

import java.util.ArrayList;
import java.util.List;

public class Champion {
    String mName;
    int mPhysical;
    int mAttack;
    List<String> mAttackMents;

    public String getName(){ return mName; }
    public int getPhysical(){ return mPhysical; }
    public int getAttack(){ return mAttack; }

    //멘트 중 한개만 반환
    public String getAttackMent(){
        int index = (int)(Math.random() * (mAttackMents.size() - 1));
        return mAttackMents.get(index);
    }
}
