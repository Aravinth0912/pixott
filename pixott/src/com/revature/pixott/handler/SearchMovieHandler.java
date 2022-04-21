package com.revature.pixott.handler;

import java.util.List;

import com.revature.pixott.app.App;
import com.revature.pixott.dao.SearchMoviedao;
import com.revature.pixott.model.MovieSearch;

public class SearchMovieHandler {
	public static void display() {
		System.out.println("enter the movie name to search ");
		String keyword=App.scanner.nextLine();
		keyword+=App.scanner.nextLine();
		SearchMoviedao search=new  SearchMoviedao();
		List<MovieSearch> movie=search.Search(keyword);
		movie.forEach(System.out::println);
			
		
		}

}
