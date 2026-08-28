package com.nt.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name="PROFILE_INFO")
public class Profile {

	@Id
	@SequenceGenerator(name="gen1",sequenceName = "profile_Id",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String phone;

    private String address;

    @OneToOne(mappedBy = "profile")
    private User user;

   

    public Profile(String phone, String address) {
        this.phone = phone;
        this.address = address;
    }



    @Override
    public String toString() {
        return "Profile [id=" + id +
                ", phone=" + phone +
                ", address=" + address + "]";
    }
}