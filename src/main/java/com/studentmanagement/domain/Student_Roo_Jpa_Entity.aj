// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.studentmanagement.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Student_Roo_Jpa_Entity {
    
    declare @type: Student: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private java.lang.Long Student.id;
    
    @Version
    @Column(name = "version")
    private java.lang.Integer Student.version;
    
    public java.lang.Long Student.getId() {
        return this.id;
    }
    
    public void Student.setId(java.lang.Long id) {
        this.id = id;
    }
    
    public java.lang.Integer Student.getVersion() {
        return this.version;
    }
    
    public void Student.setVersion(java.lang.Integer version) {
        this.version = version;
    }
    
}
