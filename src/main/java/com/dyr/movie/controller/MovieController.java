package com.dyr.movie.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dyr.movie.domain.Movie;
import com.dyr.movie.service.MovieService;
import com.dyr.movie.vo.MovieVo;
import com.github.pagehelper.PageInfo;


@Controller
public class MovieController {
	
	@Resource
	private MovieService moService;
	
	@RequestMapping("selects")
	public String list(MovieVo movieVo,Model model,@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue = "2")Integer pageSize) {
		PageInfo<Movie> info = moService.selects(movieVo,page,pageSize);
		
		model.addAttribute("info", info);
		model.addAttribute("movieVo", movieVo);
		
		return "movie";
	}
	
	@ResponseBody
	@RequestMapping("deleteBatch")
	public boolean deleteBatch(@RequestParam("ids[]") Integer[] ids) {
		
		return moService.deleteBatch(ids) >0;
	}
}
