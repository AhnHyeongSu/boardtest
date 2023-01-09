package com.example.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.board.vo.BoardVO;
import com.example.board.vo.Criteria;

@Mapper
@Repository("boardDAO")
public interface BoardDAO {
	
	public List<BoardVO> boardListAll() throws Exception;
	
	public List<Map<String, Object>> boardList(Criteria cri) throws Exception;
	 
	public int boardListCnt() throws Exception;

	
}
