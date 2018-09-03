package hellosbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This app was designed to be loosely-coupled with specific implementations of consumers/suppliers
 * for orders and clients or order processors to be pluggable via the Spring profiles.
 *
 * For example, To use the default implementations that work with orders.txt and clients.txt files,
 * match orders, and write the results into the result.txt file, please, run this app with the
 * [onetime-on-startup, file-based, default] active profiles.
 *
 * onetime-on-startup profile means that the run-once order processor service will be executed.
 */
@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}