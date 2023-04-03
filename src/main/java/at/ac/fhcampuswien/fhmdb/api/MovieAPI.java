package at.ac.fhcampuswien.fhmdb.api;

import at.ac.fhcampuswien.fhmdb.models.Genre;

public class MovieAPI {

    private static final String URL = "https://prog2.fh-campuswien.ac.at/movies";
    private static final String DELIMITER = "&";

    private static String buildURL(String query, Genre genre, String releaseYear, String ratingFrom) {

        StringBuilder url = new StringBuilder(URL);

        if((query != null && !query.isEmpty()) || genre != null || releaseYear != null || ratingFrom != null) {

            url.append("?");

            if(query != null && !query.isEmpty()) {
                url.append("query=").append(query).append(DELIMITER);
            }
            if(genre != null) {
                url.append("genre=").append(genre).append(DELIMITER);
            }
            if(releaseYear != null) {
                url.append("releaseYear=").append(releaseYear).append(DELIMITER);
            }
            if(ratingFrom != null) {
                url.append("ratingFrom=").append(ratingFrom).append(DELIMITER);
            }
        }
        return url.toString();
    }

}
