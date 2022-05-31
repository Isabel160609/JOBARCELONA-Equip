package com.init.Jobarcelona;import com.fasterxml.jackson.core.type.TypeReference;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.init.Jobarcelona.dto.PlayerDto;
import com.init.Jobarcelona.service.PlayerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class Jobarcelona22Application {

    public static void main(String[] args) {
        SpringApplication.run(Jobarcelona22Application.class, args);
    }

  /*  @Bean
    CommandLineRunner runner(PlayerService servicePlayer) {
        return args -> {
            // read json and write to db
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<PlayerDto>> typeReference = new TypeReference<>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream("/json/points_collection.json");
            try {
                List<PlayerDto> points = mapper.readValue(inputStream, typeReference);

                for (PlayerDto u : points) {
                    try {
                        servicePlayer.createPlayer(u);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
                System.out.println("Points Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save points: " + e.getMessage());
            }
        };
    }
*/
}
