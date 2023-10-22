package baseball;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    public void vaildUserTrialInput(String userInput) {
        if (userInput.length() != 3) {
            throw new IllegalArgumentException("3자리의 숫자를 입력하세요.");
        }

        for (char c : userInput.toCharArray()) {
            if (c < '1' || c > '9') {
                throw new IllegalArgumentException("올바른 숫자를 입력하세요.");
            }
        }

        for (int i = 0; i < userInput.length() - 1; i++) {
            for (int j = i + 1; j < userInput.length(); j++) {
                if (userInput.charAt(i) == userInput.charAt(j)) {
                    throw new IllegalArgumentException("중복되지 않은 숫자를 입력하세요.");
                }
            }
        }
    }

    public List<Integer> getUserTrialInput() {
        System.out.print("숫자를 입력해주세요 : ");
        String userInput = camp.nextstep.edu.missionutils.Console.readLine();
        vaildUserTrialInput(userInput);

        List<Integer> userInputList = new ArrayList<>();
        for (char c : userInput.toCharArray()) {
            userInputList.add(c - '0');
        }

        return userInputList;
    }

    public void vaildUserRestartInput(String userInput) {
        if (userInput.length() != 1) {
            throw new IllegalArgumentException("1자리의 숫자를 입력하세요.");
        }

        for (char c : userInput.toCharArray()) {
            if (c < '1' || c > '2') {
                throw new IllegalArgumentException("올바른 숫자를 입력하세요.");
            }
        }
    }

    public int getUserRestartInput() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        String userInput = camp.nextstep.edu.missionutils.Console.readLine();
        vaildUserRestartInput(userInput);

        return Integer.parseInt(userInput);
    }
}
