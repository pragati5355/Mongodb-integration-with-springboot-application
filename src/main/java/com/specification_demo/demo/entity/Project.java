package com.specification_demo.demo.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;

/**
 * 
 * @author Mindbowser | pragati.gawade@mindbowser.com
 *
 */
@Document(collection = "projects")
public class Project extends BaseEntity {

    @Column
    private String name;

    @Column(name = "status")
    private String status;
    
}
