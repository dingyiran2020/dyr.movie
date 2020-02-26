package com.dyr.movie.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dyr.movie.dao.MovieMapper;
import com.dyr.movie.domain.Movie;
import com.dyr.movie.service.MovieService;
import com.dyr.movie.vo.MovieVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class MovieServiceImpl implements MovieService {

	@Resource
	private MovieMapper movieMapper;
	
	@Override
	public PageInfo<Movie> selects(MovieVo movieVo,Integer page,Integer pageSize) {
		PageHelper.startPage(page,pageSize);
		List<Movie> list = movieMapper.selects(movieVo);
		return   new PageInfo<Movie>(list);
	}

	@Override
	public int deleteBatch(Integer[] ids) {
		// TODO Auto-generated method stub
		return movieMapper.deleteBatch(ids);
	}

}
