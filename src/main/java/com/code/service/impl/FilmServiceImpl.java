package com.code.service.impl;

import com.code.annotation.FilmAnnotation;
import com.code.dto.FilmDTO;
import com.code.mapper.FilmMapper;
import com.code.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmMapper filmMapper;

    @Override
    public void insertFail(FilmDTO filmDTO) {
        filmMapper.insertRecode(filmDTO);
        throw new RuntimeException("error");
    }

    @Override
    @FilmAnnotation
    public void insertSuccess(FilmDTO filmDTO) {
        filmMapper.insertRecode(filmDTO);
    }
}
