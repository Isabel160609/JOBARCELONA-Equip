package com.init.Jobarcelona.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CupDto {

    private int goal_cup;
    private int assist_cup;
    private int own_goal_cup;
    private int yellow_card_cup;
    private int second_yellow_card;
    private int red_card_cup;
}
