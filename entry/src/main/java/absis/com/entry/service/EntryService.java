package absis.com.entry.service;

import absis.com.entry.feign.EntryClient;
import absis.com.entry.model.EntryResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntryService {

    @Autowired
    EntryClient entryClient;

    @Autowired
    ObjectMapper objectMapper;

    public void getEntries() {
        String entryText = entryClient.findAll();
        try {
            EntryResponse entryResponse = objectMapper.readValue(entryText, EntryResponse.class);
            System.out.println("{");
            System.out.println("    count: " + entryResponse.getCount());
            System.out.println("    entries: [" );
            entryResponse.getEntries().forEach(entry -> {
                System.out.println("        {" + "\n" +  entry + "\n" + "        }" );
            });
            System.out.println("    ]");
            System.out.println("}");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
