package com.code.runner;

import com.code.dto.FilmDTO;
import com.code.service.FilmService;
import com.code.util.SpringContextUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Component
public class ApplicationRunnerImpl implements ApplicationRunner {

    @Value("${FILM_TITLE}")
    private String title;

    @Value("${FILM_DESCRIPTION}")
    private String description;

    @Value("${FILM_LANGUAGE_ID}")
    private int languageId;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Film Title:");
        System.out.println(title);
        System.out.println("Film Description:");
        System.out.println(description);
        System.out.println("Film languageId:");
        System.out.println(languageId);
        FilmDTO filmDTO = new FilmDTO(title, description, languageId, 1, new BigDecimal(1.0), new BigDecimal(1.0), new Date());
        FilmService filmService = SpringContextUtil.getApplicationContext().getBean(FilmService.class);
//        filmService.insertFail(filmDTO);
        filmService.insertSuccess(filmDTO);
    }
}
