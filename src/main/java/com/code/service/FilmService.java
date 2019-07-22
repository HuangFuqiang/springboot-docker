package com.code.service;

import com.code.dto.FilmDTO;

public interface FilmService {

    void insertFail(FilmDTO filmDTO);

    void insertSuccess(FilmDTO filmDTO);
}
