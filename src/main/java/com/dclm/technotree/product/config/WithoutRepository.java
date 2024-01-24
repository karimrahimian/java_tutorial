package com.dclm.technotree.product.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("without-repositories")
public class WithoutRepository {
}
