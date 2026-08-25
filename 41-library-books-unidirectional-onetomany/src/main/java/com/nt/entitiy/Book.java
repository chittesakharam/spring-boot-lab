package com.nt.entitiy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@Entity
@Table(name="OTM_Book")
public class Book {

	@Id
	@SequenceGenerator(name="gen1",sequenceName = "Cust_Id",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
    private Long bookId;
	@Column(length=30)
	@NonNull
    private String bookTitle;
	@Column(length=30)
	@NonNull
    private String authorName;
	@NonNull
    private Double price;

   
    @Override
    public String toString() {
        return "Book Details \n------------------------------------------\nBook Id=" + bookId +
                "\nbookTitle=" + bookTitle +
                "\nauthorName=" + authorName +
                "\nprice=" + price ;
    }
}