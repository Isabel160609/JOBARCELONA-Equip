package com.init.Jobarcelona.core.mappers.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContinentDto {

    private int goal_continent;
    private int assist_continent;
    private int own_goal_continent;
    private int yellow_card_continent;
    private int second_yellow_card_continent;
    private int red_card_continent;
}
