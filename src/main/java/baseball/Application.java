package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static List<Integer> makeRandomAnswer() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    public static List<Integer> getUserTrialInput() {
        String userInput = camp.nextstep.edu.missionutils.Console.readLine(); // 항상 올바른 입력값이라고 가정함
        // todo: 유저 입력값 검사

        List<Integer> userInputList = new ArrayList<>();
        for (char c : userInput.toCharArray()) {
            userInputList.add(c - '0');
        }

        camp.nextstep.edu.missionutils.Console.close();

        return userInputList;
    }

    public static void main(String[] args) {
        List<Integer> answerList = makeRandomAnswer();
        List<Integer> userInputList = getUserTrialInput();

        System.out.println(answerList);
        System.out.println(userInputList);
    }
}
