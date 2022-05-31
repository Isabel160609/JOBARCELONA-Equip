package com.init.Jobarcelona.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="champ")
public class Champ {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Id
    private Long id;
    @Column(name = "goal_champ")
    private int goal_champ;
    @Column(name = "assist_champ")
    private int assist_champ;
    @Column(name = "own_goal_champ")
    private int own_goal_champ;
    @Column(name = "yellow_card_champ")
    private int yellow_card_champ;
    @Column(name = "second_yellow_card_champ")
    private int second_yellow_card_champ;
    @Column(name = "red_car_champ")
    private int red_car_champ;
}
