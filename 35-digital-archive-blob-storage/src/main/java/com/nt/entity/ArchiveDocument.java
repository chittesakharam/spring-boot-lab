package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class ArchiveDocument {
	
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "Doc_seq",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Long documentId;
	@Column(length=50)
	@NonNull
	private String documentTitle;
	@NonNull
	@Column(length=50)
	private String ownerName;
	@NonNull
	@Column(length=50)
	private String fileName;
	@Lob
	private byte[] documentData;

}
