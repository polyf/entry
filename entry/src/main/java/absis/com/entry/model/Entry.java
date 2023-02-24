package absis.com.entry.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Entry {
    private String title;
    private String description;
    private String auth;
    private boolean https;
    private String cors;
    private String link;
    private String category;

    public Entry() {

    }

    @JsonCreator
    public Entry(@JsonProperty("API") String title, @JsonProperty("Description") String description, @JsonProperty("Auth") String auth, @JsonProperty("HTTPS") boolean https, @JsonProperty("Cors") String cors, @JsonProperty("Link") String link, @JsonProperty("Category") String category) {
        this.title = title;
        this.description = description;
        this.auth = auth;
        this.https = https;
        this.cors = cors;
        this.link = link;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public boolean isHttps() {
        return https;
    }

    public void setHttps(boolean https) {
        this.https = https;
    }

    public String getCors() {
        return cors;
    }

    public void setCors(String cors) {
        this.cors = cors;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return  "            \"API\": \"" + title + "\"" + ",\n" +
                "            \"description\": \"" + description + "\"" + ",\n" +
                "            \"auth\": \"" + auth + "\"" + ",\n" +
                "            \"https\": " + https + ",\n" +
                "            \"cors\": \"" + cors + "\"" + ",\n" +
                "            \"link\": \"" + link + "\"" + ",\n" +
                "            \"category\": \"" + category + "\"" + "\n";
    }
}
