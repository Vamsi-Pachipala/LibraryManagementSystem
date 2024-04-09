package com.example.LibraryManagementSystem.DTO.ResponceDto;

import com.example.LibraryManagementSystem.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CardResponseDto {

    private int id;

    private Date issueDate;

    private Date updatedOn;

    private Status cardStatus;

    private String validTill;
}
