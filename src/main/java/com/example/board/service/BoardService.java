package com.example.board.service;

import java.util.List;
import java.util.Map;

import com.example.board.vo.BoardVO;
import com.example.board.vo.Criteria;

public interface BoardService {
	
	//전체 게시물 조회
	public List<BoardVO> boardListAll() throws Exception;
	
	public int boardListCnt() throws Exception;
	
	public List<Map<String, Object>> boardList(Criteria cri) throws Exception;
	
}
