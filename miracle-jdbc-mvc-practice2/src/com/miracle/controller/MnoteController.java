package com.miracle.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.miracle.model.dto.MnoteDTO;
import com.miracle.model.service.MnoteService;
import com.miracle.view.ResultView;

public class MnoteController {


	MnoteService mnoteService = new MnoteService();
	Scanner sc = new Scanner(System.in);
	ResultView resultView = new ResultView();
	
	
	
	public void newNote() {
		
		MnoteDTO mnoteDTO = new MnoteDTO();
		
		System.out.print("노트 제목을 입력해주세요 : ");
		String title = sc.nextLine();
		
		System.out.print("노트 내용을 입력해주세요 : ");
		String content = sc.nextLine();
	 	
		java.util.Date mnoteTime = new java.util.Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy/MM/dd");
		String date = dateFormat.format(mnoteTime);
		
		mnoteDTO.setTitle(title);
		mnoteDTO.setContent(content);
		mnoteDTO.setDate(date);
		
		int result = mnoteService.newNote(mnoteDTO);
		
		if(result > 0) {
			resultView.Success();
		} else {
			resultView.failed();
		}
	}

	public void selNote() {
		
		List<MnoteDTO> mnoteDTO = new ArrayList<>();
		
		mnoteDTO = mnoteService.selNote();
		
		for(MnoteDTO mnoteDTO1 : mnoteDTO) {
			System.out.println(mnoteDTO1);
		}
		
	}

	public void updateNote() {
		
		MnoteDTO mnoteDTO = new MnoteDTO();
		
		System.out.print("수정할 노트 번호를 입력해주세요 : ");
		int selNo = sc.nextInt();
		
		mnoteService.selNoteNo(selNo);
		mnoteDTO.setMemoNo(selNo);
		
		sc.nextLine();
		
		System.out.print("수정할 제목을 입력해주세요 : ");
		String title = sc.nextLine();
		
		System.out.print("수정할 내용을 입력해주세요 : ");
		String content = sc.nextLine();
		
		
		mnoteDTO.setTitle(title);
		mnoteDTO.setContent(content);
		
		
		int result = 0;
		result = mnoteService.updateNote(mnoteDTO);
		
		if(result > 0) {
			resultView.updateSuccess();
		} else {
			resultView.updatefailed();
		}
	}

	public void delNote() {
		
		MnoteDTO mnoteDTO = new MnoteDTO();
		
		System.out.print("삭제할 노트 번호를 입력해주세요 : ");
		int selNo = sc.nextInt();
		
		int result = mnoteService.delNote(selNo);
	
		
		if(result > 0) {
			resultView.deleteSuccess();
		} else {
			resultView.deletefailed();
		}
		
	}

	
	
	
	
}
