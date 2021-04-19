package helperMethods.serviceMethods;

import java.util.List;
import models.searchByTitleModels.Search;
public class OMDBServiceMethods {
	public static Search getMovieByTitle(List<Search> movieList,String title) {
		Search movie = new Search();
		for (int i=0; i<movieList.size(); i++) {
			if (movieList.get(i).getTitle().equals(title)){
				movie = movieList.get(i);
			}
		}
		return movie;
	}
}
