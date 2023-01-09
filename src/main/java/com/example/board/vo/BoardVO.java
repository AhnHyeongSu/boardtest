package com.example.board.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("boardVO")
public class BoardVO {
	
	private int board_num;
	private String board_title;
	private String member_name;
	private Date board_date;
	
	public BoardVO() {
		
	}

	public BoardVO(int board_num, String board_title, String member_name, Date board_date) {
		this.board_num = board_num;
		this.board_title = board_title;
		this.member_name = member_name;
		this.board_date = board_date;
	}

	public int getBoard_num() {
		return board_num;
	}

	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public Date getBoard_date() {
		return board_date;
	}

	public void setBoard_date(Date board_date) {
		this.board_date = board_date;
	}
	
	
	
	
}
