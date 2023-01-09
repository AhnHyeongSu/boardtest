package com.example.board.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.board.dao.BoardDAO;
import com.example.board.vo.BoardVO;
import com.example.board.vo.Criteria;



@Service("boardService")
@Transactional(propagation = Propagation.REQUIRED)
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO boardDAO;
	
	
	@Override
	public List<BoardVO> boardListAll() throws Exception {
		return boardDAO.boardListAll();
	}
	
	@Override
	public int boardListCnt() throws Exception {
        return boardDAO.boardListCnt();
	}
 
	@Override
	public List<Map<String, Object>> boardList(Criteria cri) throws Exception {
        return boardDAO.boardList(cri);
	}

}
