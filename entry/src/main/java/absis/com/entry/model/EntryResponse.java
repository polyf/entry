package absis.com.entry.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class EntryResponse {
    int count;
    List<Entry> entries;

    public EntryResponse() {

    }

    @JsonCreator
    public EntryResponse(@JsonProperty("count") int count, @JsonProperty("entries") List<Entry> entries) {
        this.count = count;
        this.entries = entries;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    @Override
    public String toString() {
        return "EntryResponse{" + "\n" +
                "count=" + count + ",\n" +
                "entries=" + entries + "\n" +
                '}' + "\n";
    }
}
