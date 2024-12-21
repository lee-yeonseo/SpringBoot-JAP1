package jpabook.jpashop;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter @Setter

public class Member {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
}


