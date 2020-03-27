package com.home.springbootthymeleafdemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class User {

    @NotNull
    @Size(min = 3, max = 10)
    private String userId;
    @NotNull
    @Size(min = 5, max = 20)
    private String userName;
    private String gender;
    private String profile;
    private Boolean married;
}
