package com.dyr.movie.service;

import java.util.List;

import com.dyr.movie.domain.Movie;
import com.dyr.movie.vo.MovieVo;
import com.github.pagehelper.PageInfo;

public interface MovieService {
	
	//Ä£ºý²éÑ¯
	PageInfo<Movie> selects(MovieVo movieVo,Integer page,Integer pageSize);
	
	int deleteBatch(Integer[] ids);
	
}
