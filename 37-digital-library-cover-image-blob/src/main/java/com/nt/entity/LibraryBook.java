package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Liberary__Book")
@Data
public class LibraryBook {
	@Id
	private Long bookId;
	private String bookTitle;
	private String authorName;
	
	@Lob
	@Column(columnDefinition = "BLOB")
	private byte[]coverImage;

}
