package org.dbpedia.spotlight.common;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Query {

    private String text;

    private String inUrl;

    private Double confidence;

    private Integer support;

    private String dbpediaTypes;

    private String sparqlQuery;

    private String policy;

    private Boolean coreferenceResolution;

    private String spotterName;

    private String disambiguatorName;

}
