package br.com.minhas_calorias.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;


@Entity
@Table(name = "tb_users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERS_SEQ")
    @SequenceGenerator(name = "USERS_SEQ", sequenceName = "USERS_SEQ", allocationSize = 1)
    private Long id;
    private String name;
    private String email;
    private String password;

}
