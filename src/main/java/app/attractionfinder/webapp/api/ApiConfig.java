package app.attractionfinder.webapp.api;

import app.attractionfinder.webapp.common.repository.AttractionRepository;
import app.attractionfinder.webapp.common.repository.AttractionTagRepository;
import app.attractionfinder.webapp.common.repository.TagRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {
	@Bean
	public ApiHandler apiHandler(final TagRepository tagRepo, final AttractionRepository attractionRepo, final AttractionTagRepository attractionTagRepo) {
		return new ApiHandler(tagRepo, attractionRepo, attractionTagRepo);
	}

	@Bean
	public ApiController apiController(final ApiHandler apiHandler) {
		return new ApiController(apiHandler);
	}
}
