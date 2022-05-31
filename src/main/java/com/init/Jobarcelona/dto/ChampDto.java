package com.init.Jobarcelona.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChampDto {

    private int goal_champ;
    private int assist_champ;
    private int own_goal_champ;
    private int yellow_card_champ;
    private int second_yellow_card_champ;
    private int red_car_champ;
}
