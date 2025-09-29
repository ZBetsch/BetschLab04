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
    private Long id; // same value as users.id

    @OneToOne
    @MapsId
    @JoinColumn(name = "id") // PK is also FK to users.id
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private User user;

    @Lob
    private String bio;

    @Column(name = "phone_number", length = 15)
    private String phoneNumber;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    // Note: follow the lab's spelling "loyality_points"
    @Column(name = "loyality_points")
    private Integer loyalityPoints;
}
