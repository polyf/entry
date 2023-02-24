package absis.com.entry.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "entry", url = "https://api.publicapis.org/entries")
public interface EntryClient {

    @GetMapping()
    public String findAll();
}
