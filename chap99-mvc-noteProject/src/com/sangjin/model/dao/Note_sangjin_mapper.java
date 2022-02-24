package com.sangjin.model.dao;

import com.sangjin.model.dto.MnoteDTO;
import com.sangjin.model.dto.RecordDTO;

public interface Note_sangjin_mapper {

	int newNote(MnoteDTO mnoteDTO);

	int newNoteRecord(RecordDTO recordDTO);

	int updateNote(MnoteDTO mnoteDTO);

	int updateRecord(RecordDTO recordDTO);

	int delNote(MnoteDTO mnoteDTO);

	int delNoteRecord(RecordDTO recordDTO);

}
