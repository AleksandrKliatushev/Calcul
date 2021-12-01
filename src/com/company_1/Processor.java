package com.company_1;

import com.company_1.actions.*;

import java.util.Map;

import static java.util.Objects.requireNonNull;

public class Processor {

    private final static String ACTION_REGEX = "([0-9]|\\.|,|/s)";
    private final static String X_Y_REGEX = "([+\\-*/])";

    private final static Map<String, Action> actions = Map.of(
            "+", new Amount(),
            "-", new Difference(),
            "*", new Multiplication(),
            "/", new Division()
    );

    public Action chooseAction(String expression) {
       return actions.get(requireNonNull(expression)
                .replaceAll(ACTION_REGEX, "")
                .trim());
    }

    public int applyAction(String expression, Action action) {
        var members = requireNonNull(expression)
                .split(X_Y_REGEX);

        return action.apply(Integer.parseInt(members[0]), Integer.parseInt(members[1]));
    }
}
