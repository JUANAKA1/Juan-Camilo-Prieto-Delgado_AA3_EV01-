package alpha.zapatos.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
//http://localhost:8081/auth/login
//http://localhost:8081/auth/register
/*{
	"username": "usuarioEjemplo",
	"password": "123234",
	"firstname": "Juan",
	"lastname": "Pérez",
	"country": "México"
 }*/
  