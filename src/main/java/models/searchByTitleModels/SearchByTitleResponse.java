package models.searchByTitleModels;

import java.util.List;

public class SearchByTitleResponse {
    private List<Search> Search;
    private String totalResults;
    private boolean Response;
	public List<Search> getSearch() {
		return Search;
	}
	public void setSearch(List<Search> search) {
		Search = search;
	}
	public String getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}
	public boolean isResponse() {
		return Response;
	}
	public void setResponse(boolean response) {
		Response = response;
	}
	
}