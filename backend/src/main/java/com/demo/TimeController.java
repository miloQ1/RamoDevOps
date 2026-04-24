package com.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

@RestController
public class TimeController {

    private final JdbcTemplate jdbc;

    public TimeController(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @GetMapping("/api/hora")
    public String getHora() {
        String time = jdbc.queryForObject("SELECT NOW()::text", String.class);
        String curso = jdbc.queryForObject("SELECT curso FROM curso WHERE id = 1", String.class);
        return "Hola curso "+curso+", la hora es: " + time;
    }
}
