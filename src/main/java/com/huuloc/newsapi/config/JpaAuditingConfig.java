package com.huuloc.newsapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

@Configuration
// @EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class JpaAuditingConfig implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("huuloc");
    }
}
