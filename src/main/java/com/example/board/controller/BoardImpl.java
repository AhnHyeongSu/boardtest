package com.example.board.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.board.service.BoardService;
import com.example.board.vo.BoardVO;
import com.example.board.vo.Criteria;
import com.example.board.vo.Paging;

@Controller("boardController")
public class BoardImpl {
	
	@Autowired
	private BoardService boardService;
	
	private static final Logger log = LoggerFactory.getLogger(BoardImpl.class);
	
	@RequestMapping(value="/boardTest.do", method = RequestMethod.GET)
	public ModelAndView boardsList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		log.info("들어 왔는지 확인");
		String viewName = (String) request.getAttribute("viewName");
		ModelAndView mav = new ModelAndView();
		List<BoardVO> boardList = boardService.boardListAll();
		mav.addObject("boardList", boardList);
		mav.setViewName(viewName);
		return mav;
	}
	
	@RequestMapping(value="/boardList.do")
    public String boardList(Criteria cri, Model model) throws Exception {
		System.out.println(cri);
		System.out.println(cri.getPageStart());
        // 전체 글 개수
        int boardListCnt = boardService.boardListCnt();
        
        // 페이징 객체
        Paging paging = new Paging();
        //System.out.println("페이징1");
        //System.out.println(paging);
        
        paging.setCri(cri);
        paging.setTotalCount(boardListCnt);    
        //System.out.println("페이징2");
        //System.out.println(paging);
        
        List<Map<String, Object>> list = boardService.boardList(cri);
        
        model.addAttribute("list", list);    
        model.addAttribute("paging", paging);    
                
        return "/boardList";
    }

	
}
