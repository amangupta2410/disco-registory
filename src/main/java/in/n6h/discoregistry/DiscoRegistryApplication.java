package in.n6h.discoregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoRegistryApplication.class, args);
    }

}
