package mul.cam.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mul.cam.a.dao.BbsDao;
import mul.cam.a.dto.BbsComment;
import mul.cam.a.dto.BbsDto;
import mul.cam.a.dto.BbsParam;

@Service
@Transactional
public class BbsService {

	@Autowired
	BbsDao dao;
	
	public List<BbsDto> bbslist(BbsParam param) {
		return dao.bbslist(param);
	}
	
	public int getAllBbs(BbsParam param) {
		return dao.getAllBbs(param);
	}
	
	public BbsDto getBbs(int seq) {
		return dao.getBbs(seq);
	}
	
	public boolean writeBbs(BbsDto bbs) {
		int n = dao.writeBbs(bbs);
		return n>0?true:false;
	}
	
	public boolean answerBbs(BbsDto bbs) {
		dao.answerBbsUpdate(bbs);
		int n = dao.answerBbsInsert(bbs);
		return n>0?true:false;
	}
	
	public boolean updateBbs(BbsDto bbs) {
		int n = dao.updateBbs(bbs);
		return n>0?true:false;
	}
	
	public boolean deleteBbs(int seq) {
		int n = dao.deleteBbs(seq);
		return n>0?true:false;
	}
		
	public boolean commentWrite(BbsComment bbs) {
		int n = dao.commentWrite(bbs);
		return n>0?true:false;
	}
	
	public List<BbsComment> commentList(int seq) {
		return dao.commentList(seq);
	}
}





