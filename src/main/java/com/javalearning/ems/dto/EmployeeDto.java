package com.javalearning.ems.dto;

import lombok.*;

//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//public class EmployeeDto {
//
//    private Long id;
//    private String firstName;
//    private String lastName;
//    private String email;
//
//}

/* Using Record class for DTO */
public record EmployeeDto(Long id,
                          String firstName,
                          String lastName,
                          String email) {
}


