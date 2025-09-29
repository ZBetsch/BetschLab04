package com.zblab01.betschlab04.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "profiles")
public class Profile {

    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private User user;

    @Lob
    private String bio;

    @Column(name = "phone_number", length = 15)
    private String phoneNumber;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "loyality_points")
    private Integer loyalityPoints;
}
