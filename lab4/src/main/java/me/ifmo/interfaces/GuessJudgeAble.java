package me.ifmo.interfaces;

import me.ifmo.exceptions.JudgeNotFoundException;

@FunctionalInterface
public interface GuessJudgeAble{
    String guessJudge() throws JudgeNotFoundException;
}
