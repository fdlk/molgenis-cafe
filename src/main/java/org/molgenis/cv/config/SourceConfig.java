package org.molgenis.cv.config;

import org.molgenis.cv.source.DebCentral;
import org.molgenis.cv.source.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SourceConfig {
  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }

  @Bean
  public Source debCentral() {
    return new DebCentral(restTemplate());
  }
}
