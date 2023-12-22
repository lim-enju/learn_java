import champions.Champion;
import champions.Garen;
import champions.Jinx;
import champions.Sol;

import java.util.ArrayList;
import java.util.List;

public class GameManager {

    ArrayList<Champion> champions = new ArrayList();

    GameManager() {
        //게임 캐릭터 세팅
        champions.addAll(
            List.of(new Garen(1), new Garen(2), new Garen(3),
                    new Jinx(1), new Jinx(2), new Jinx(3), new Jinx(4),
                    new Sol(1), new Sol(2), new Sol(3), new Sol(4), new Sol(5)
            ));
    }

    void start() {
        int round = 0;

        while(champions.size() > 1){
            round++;

            System.out.println(round + "회차 토너먼트 진행..==============\n");

            ArrayList<Champion> winners = new ArrayList<>();
            for(int i = 0; i < champions.size(); i += 2){

                //플레이어 수가 홀수인 경우 부전승 처리
                if((champions.size() % 2 == 1) && (champions.size() - 1 == i)){
                    Champion winnerByDefault = champions.get(champions.size() - 1);
                    winners.add(winnerByDefault);
                    break;
                }

                //게임 진행
                Champion winner = runTournament(champions.get(i), champions.get(i + 1));
                winners.add(winner);
            }

            //승자만 게임 진행
            champions = winners;
            System.out.println("winner " + winners.size());

            //한명만 남는 경우 게임 종료
            if(champions.size() == 1){
                System.out.println("승리자 " + champions.get(0).getName() + "회차 토너먼트 종료..");
                System.out.println("게임 종료..");
            }
        }

    }

    Champion runTournament(Champion player1, Champion player2){
        int player1Physical = player1.getPhysical();
        int player2Physical = player2.getPhysical();

        System.out.println("(" + player1.getName() + "," + player2.getName() + ")" + "이 싸움을 시작합니다.");

        while(true){
            int player1Attack = (int)(Math.random() * player1.getAttack());
            int player2Attack = (int)(Math.random() * player2.getAttack());

            //player1 의 공격
            System.out.println(player1.getAttackMent());
            System.out.println(player1.getName() + "이 " + player2.getName() + "에게 " + player1Attack + "만큼 공격했다.");

            player2Physical = player2Physical - player1Attack;
            //System.out.println(player2.getName() + "의 남은 체력 " + player2Physical);

            if(player1Physical < 0) return player2;

            //player2의 공격
            System.out.println(player2.getAttackMent());
            System.out.println(player2.getName() + "이 " + player1.getName() + "에게 " + player2Attack + "만큼 공격했다.");

            player1Physical = player1Physical - player2Attack;
            System.out.println(player1.getName() + "의 남은 체력 " + player1Physical);

            if(player2Physical < 0) return player1;
        }
    }
}
