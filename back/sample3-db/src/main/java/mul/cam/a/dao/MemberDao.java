package mul.cam.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import mul.cam.a.dto.MemberDto;

@Mapper
@Repository
public interface MemberDao {

	List<MemberDto> allMember();
}
