package com.studentmanagement.domain;

import com.studentmanagement.shared.Degrees;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.equals.RooEquals;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.classpath.operations.jsr303.RooUploadedFile;

@RooJavaBean
@RooToString
@RooJpaEntity
@RooEquals
public class Student {

    @NotNull
    @Size(max = 25)
    private String name;

    @NotNull
    @Size(max = 25)
    private String surname;

    @Past
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date birthDate;

    @NotNull
    @Column(unique = true)
    @Size(min = 5, max = 15)
    private String login;

    @NotNull
    @Size(min = 5, max = 15)
    private String password;

    @NotNull
    @Enumerated
    private Degrees degree;

    @RooUploadedFile(contentType = "image/jpeg")
    @Lob
    private byte[] image;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "student")
    private Set<Subject> subjects = new HashSet<Subject>();
}
