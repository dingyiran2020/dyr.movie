package com.dyr.movie.dao;

import java.util.List;

import com.dyr.movie.domain.Movie;
import com.dyr.movie.vo.MovieVo;

public interface MovieMapper {
	
	//ģ����ѯ
	List<Movie> selects(MovieVo movieVo);
	
	int deleteBatch(Integer[] ids);
}
