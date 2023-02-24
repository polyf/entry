package absis.com.entry;

import absis.com.entry.service.EntryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

/**
 * @author polyf
 */

@EnableFeignClients
@SpringBootApplication
public class EntryApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EntryApplication.class, args);
		EntryService entryService = context.getBean("entryService", EntryService.class);
		entryService.getEntries();

	}

}
