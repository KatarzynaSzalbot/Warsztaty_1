package Lotto;

import java.util.ArrayList;

public class Application2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<Integer> userList = LottoScanner.startGettingNumbers();
        System.out.println(LottoChecker.getUserScore(userList));
    }
}
