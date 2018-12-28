package com.config;

import javax.annotation.PostConstruct;

import org.springframework.batch.core.configuration.annotation.BatchConfigurer;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.explore.support.MapJobExplorerFactoryBean;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.MapJobRepositoryFactoryBean;
import org.springframework.batch.support.transaction.ResourcelessTransactionManager;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class CutomBatchConfig implements BatchConfigurer {

  PlatformTransactionManager transactionManager;
  JobRepository jobRepository;
  JobLauncher jobLauncher;
  JobExplorer jobExplorer;

  @Override
  public JobRepository getJobRepository() {
    return jobRepository;
  }

  @Override
  public PlatformTransactionManager getTransactionManager() {
    return transactionManager;
  }

  @Override
  public JobLauncher getJobLauncher() {
    return jobLauncher;
  }

  @Override
  public JobExplorer getJobExplorer() {
    return jobExplorer;
  }

  @PostConstruct
  void initialize() throws Exception {

    if (this.transactionManager == null) {
      this.transactionManager = new ResourcelessTransactionManager();
    }

    MapJobRepositoryFactoryBean jobRepositoryFactory = new MapJobRepositoryFactoryBean(this.transactionManager);
    jobRepositoryFactory.afterPropertiesSet();
    this.jobRepository = jobRepositoryFactory.getObject();

    MapJobExplorerFactoryBean jobExplorerFactory = new MapJobExplorerFactoryBean(jobRepositoryFactory);
    jobExplorerFactory.afterPropertiesSet();
    this.jobExplorer = jobExplorerFactory.getObject();
    this.jobLauncher = createJobLauncher();
  }

  private JobLauncher createJobLauncher() throws Exception {
    SimpleJobLauncher jobLauncher = new SimpleJobLauncher();
    jobLauncher.setJobRepository(jobRepository);
    jobLauncher.afterPropertiesSet();
    return jobLauncher;
  }

}
