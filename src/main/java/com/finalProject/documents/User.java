package com.finalProject.documents;

import com.finalProject.models.common.Address;
import com.finalProject.models.common.Location;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class User {

    @Id
    private String _id;
    private String nameOfUser;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String gender;
    private LocalDate dateOfBirth;
    private String countryCode;
    private String phoneNumber;
    private Address address;
    private Location location;
    private Location latestLocation;
    private String email;
    private String displayImageUrl;
    private String role;

}
