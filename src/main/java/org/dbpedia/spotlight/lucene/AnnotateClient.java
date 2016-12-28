package org.dbpedia.spotlight.lucene;

import org.dbpedia.spotlight.common.Modules;
import org.dbpedia.spotlight.core.FeignConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = Modules.SPOTLIGHT_TF_IDF, configuration = FeignConfiguration.class)
public interface AnnotateClient {
}
