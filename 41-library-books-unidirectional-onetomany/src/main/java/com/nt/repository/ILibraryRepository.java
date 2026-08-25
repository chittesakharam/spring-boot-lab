package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entitiy.Library;

public interface ILibraryRepository extends JpaRepository<Library, Long> {

}
