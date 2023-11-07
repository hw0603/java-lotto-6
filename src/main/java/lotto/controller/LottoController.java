package lotto.controller;

import lotto.service.LottoAnswerService;
import lotto.service.LottoService;
import lotto.service.ResultService;
import lotto.service.UserService;
import lotto.view.InputView;
import lotto.view.OutputView;


public class LottoController {
    private LottoAnswerService lottoAnswerService;
    private LottoService lottoService;
    private ResultService resultService;
    private UserService userService;


    public LottoController(
            LottoAnswerService lottoAnswerService,
            LottoService lottoService,
            ResultService resultService,
            UserService userService
    ) {
        this.lottoAnswerService = lottoAnswerService;
        this.lottoService = lottoService;
        this.resultService = resultService;
        this.userService = userService;
    }

    public void start() {

    }



    public int readUserBudget() {
        OutputView.printBudgetInputDescription();
        int budget = 0;
        try {
            budget = InputView.inputBudget();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        return budget;
    }

}
