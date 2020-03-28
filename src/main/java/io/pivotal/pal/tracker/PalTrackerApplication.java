package io.pivotal.pal.tracker;

import io.pivotal.pal.repo.JdbcTimeEntryRepository;
import io.pivotal.pal.repo.TimeEntryRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.TimeZone;

@SpringBootApplication
public class PalTrackerApplication {

    public static void main(String[] args) {

        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        SpringApplication.run(PalTrackerApplication.class, args);
    }

    @Bean
    public TimeEntryRepository getTimeRepo(DataSource dataSource){
        return new JdbcTimeEntryRepository(dataSource);
    }
}
