package com.nt.entitiy;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@Entity
@Table(name="OTM_Library")
public class Library {

	@Id
	@SequenceGenerator(name="gen1",sequenceName = "Cust_Id",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
    private Long libraryId;
	@Column(length=30)
	@NonNull
    private String libraryName;
	@Column(length=30)
	@NonNull
    private String location;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "library_id") 
    private List<Book> books;


    @Override
    public String toString() {
        return "Library Details \n----------------------------\nLibrary Id=" + libraryId +
                "\nlibraryName=" + libraryName +
                "\nlocation=" + location ;
    }
}