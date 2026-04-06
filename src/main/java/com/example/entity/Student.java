package com.example.entity;

import lombok.*;

@Data
@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor
public class Student {

    @NonNull
    int id;

    @NonNull
    int rollNo;

    String name;

    String gender;
}
