package com.miracle.model.service;

import static com.miracle.common.JDBCTemplate.commit;
import static com.miracle.common.JDBCTemplate.getConnection;
import static com.miracle.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.miracle.model.dao.MnoteDAO;
import com.miracle.model.dto.MnoteDTO;

public class MnoteService {

	MnoteDAO mnoteDAO = new MnoteDAO();
	
	public int newNote(MnoteDTO mnoteDTO) {
		
		Connection con = getConnection();
		
		int result = mnoteDAO.newNote(con, mnoteDTO);
		
	
		if(result > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		
		
	
		return result;
	}

	public List<MnoteDTO> selNote() {
	
		Connection con = getConnection();
		
		List<MnoteDTO> mnoteDTO = new ArrayList<>();
		
		mnoteDTO = mnoteDAO.selNote(con);
		
		return mnoteDTO;
	}

	public int updateNote(MnoteDTO mnoteDTO) {
		
		Connection con = getConnection();
		
		int result = mnoteDAO.updateNote(con, mnoteDTO);
		
		if(result > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		
		
		return result;
	}

	public List<MnoteDTO> selNoteNo(int selNo) {
		
		Connection con = getConnection();
		
		List<MnoteDTO> mnoteDTO = new ArrayList<>();
		
		mnoteDTO = mnoteDAO.selNoteNo(con, selNo);
		
		return mnoteDTO;
		
	}

	
	
	
	
}
