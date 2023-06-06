package HelloWorld.TaskOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class TaskOneApplication {
	public static void main(String[] args) {
		SpringApplication.run(TaskOneApplication.class, args);
	}
	@RestController
	public static class HelloController {
		@GetMapping("/")
		public Mono<String> getIndex() {
			return Mono.just("Hello World!");
		}
	}
}
