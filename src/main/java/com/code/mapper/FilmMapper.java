package com.code.mapper;

import com.code.dto.FilmDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FilmMapper {

    void insertRecode(FilmDTO filmDTO);

}
