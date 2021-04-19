package OMDBSearch;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import helperMethods.ListenerTest;
import helperMethods.serviceMethods.OMDBServiceMethods;
import java.util.List;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import models.searchByIDModels.SearchByIDResponse;
import models.searchByTitleModels.Search;
import models.searchByTitleModels.SearchByTitleResponse;
import responseServices.OMDBServices;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@Listeners(ListenerTest.class)	
public class OMDBSearchTestCases {
	Search movie = new Search();
	@Test()
	void getMoviesbyTitle(){
		RestAssured.baseURI = "http://www.omdbapi.com";
		Response response = OMDBServices.searchByTitleAndType("Harry Potter", "movie");
		SearchByTitleResponse searchByTitleResponse = response
				.body()
				.as(SearchByTitleResponse.class);
		List<Search> movies = searchByTitleResponse.getSearch();
		movie = OMDBServiceMethods.getMovieByTitle(movies, "Harry Potter and the Sorcerer's Stone");
		response.then().statusCode(200);
		Assert.assertEquals(movie.getTitle(), "Harry Potter and the Sorcerer's Stone", "An error was encountered because the requested movie could not be obtained.");
}
	@Test(dependsOnMethods = "getMoviesbyTitle")
	void getMoviesbyID(){
		RestAssured.baseURI = "http://www.omdbapi.com";
		Response response = OMDBServices.searchByID(movie.getImdbID());
		SearchByIDResponse searchByIDResponse = response
				.body()
				.as(SearchByIDResponse.class);
		response.then().statusCode(200);
		Assert.assertEquals(searchByIDResponse.getImdbID(), movie.getImdbID(), "Data could not be retrieved from the desired ID.");
		assertThat("Title could not be empty.",searchByIDResponse.getTitle(), is(notNullValue()));
		assertThat("Year could not be empty.",searchByIDResponse.getYear(), is(notNullValue()));
		assertThat("Released date could not be empty.",searchByIDResponse.getReleased(), is(notNullValue()));
	}
}
