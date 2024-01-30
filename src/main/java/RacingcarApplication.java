import service.RacingGame;
import strategy.NumberGenerator;
import strategy.NumberGeneratorImpl;
import ui.InputResult;

import static ui.OutputResult.printMessage;

public class RacingcarApplication {

    public static void main(String[] args) {
        InputResult inputResult = new InputResult();
        NumberGenerator numberGenerator = new NumberGeneratorImpl();
        String carNameFromUser = inputResult.getCarNameFromUser();
        int tryCount = inputResult.getTryCount();
        RacingGame racingGame = new RacingGame(numberGenerator, carNameFromUser);
        printMessage("\n실행 결과:");
        racingGame.play(tryCount);
    }
}
