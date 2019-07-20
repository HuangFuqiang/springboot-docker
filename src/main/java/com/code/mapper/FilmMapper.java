package com.code.mapper;

import com.code.dto.FilmDTO;
import org.apache.ibatis.annotations.Mapper;


/**
 * Created by hande on 2019/7/20.
 */
@Mapper
public interface FilmMapper {

    void insertRecode(FilmDTO filmDTO);

}
