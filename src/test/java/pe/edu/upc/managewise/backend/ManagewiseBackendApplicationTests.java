package pe.edu.upc.managewise.backend;

import io.github.cdimascio.dotenv.Dotenv;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ManagewiseBackendApplicationTests {

	@BeforeAll
	static void setupEnvironment() {
		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
		System.setProperty("recaptcha.secret", dotenv.get("RECAPTCHA_SECRET_KEY"));
		System.setProperty("recaptcha.verify.url", dotenv.get("RECAPTCHA_VERIFY_URL"));
	}

	@Test
	void contextLoads() {
	}

}
