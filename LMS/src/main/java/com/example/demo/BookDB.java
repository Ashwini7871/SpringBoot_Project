package com.example.demo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

public interface BookDB extends CrudRepository<Book, Integer> {
//	@Transactional
//    @Modifying
//    @Query("update Book bk set bk.Bname=?1,bk.Aname=?2,bk.Category=?3,bk.Pname=?4,bk.Edition=?5,bk.Pages=?6,where bk.Isbn=?7")
//      void updateBook(String bname,String aname,String category,String pname,int edition,int pages, int isbn);
	
//	  studentDB.updateStudent(stud.getStudentName(), stud.getRollNo());
//
}
