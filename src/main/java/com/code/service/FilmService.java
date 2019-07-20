package com.code.service;

import com.code.dto.FilmDTO;

/**
 * Created by hande on 2019/7/20.
 */
public interface FilmService {

    void insertFail(FilmDTO filmDTO);

    void insertSuccess(FilmDTO filmDTO);
}
