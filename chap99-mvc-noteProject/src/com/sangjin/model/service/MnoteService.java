package com.sangjin.model.service;

import org.apache.ibatis.session.SqlSession;

import com.sangjin.model.dao.Note_sangjin_mapper;
import com.sangjin.model.dto.MnoteDTO;
import com.sangjin.model.dto.RecordDTO;

import static com.sangjin.common.Template.getSqlSession;

public class MnoteService {
	
	private Note_sangjin_mapper mapper;

	public int newNote(MnoteDTO mnoteDTO) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(Note_sangjin_mapper.class);
		
		int result = mapper.newNote(mnoteDTO);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		return result;
	}

	public int newNoteRecord(RecordDTO recordDTO) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(Note_sangjin_mapper.class);
		
		int result = mapper.newNoteRecord(recordDTO);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		return result;
	}

	public int updateNote(MnoteDTO mnoteDTO) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(Note_sangjin_mapper.class);
		
		int result = mapper.updateNote(mnoteDTO);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		return result;
	}

	public int updateRecord(RecordDTO recordDTO) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(Note_sangjin_mapper.class);
		
		int result = mapper.updateRecord(recordDTO);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		return result;
	}

	public int delNote(MnoteDTO mnoteDTO) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(Note_sangjin_mapper.class);
		
		int result = mapper.delNote(mnoteDTO);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		return result;
	}

	public int delNoteRecord(RecordDTO recordDTO) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(Note_sangjin_mapper.class);
		
		int result = mapper.delNoteRecord(recordDTO);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		return result;
	}

}
