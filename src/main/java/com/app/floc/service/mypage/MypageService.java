package com.app.floc.service.mypage;

import com.app.floc.domain.DTO.MyPloggingPagination;
import com.app.floc.domain.DTO.PloggingDTO;
import com.app.floc.domain.DTO.Search;
import com.app.floc.domain.VO.PloggingVO;
import com.app.floc.domain.VO.UserVO;

import java.util.List;
import java.util.Optional;

public interface MypageService {
    //    게시글 목록
    public List<PloggingDTO> getList(MyPloggingPagination myPloggingPaginationpagination, Search search);

    //    게시글 추가
    public void write(PloggingDTO ploggingDTO);

    //    게시글 조회
    public Optional<PloggingDTO> read(Long id);

    //    게시글 수정
    public void modify(PloggingDTO ploggingDTO);

    //    게시글 삭제
    public void remove(Long id);

    //    게시글 전체 개수 조회
    public int getTotal(Search search);

    //  회원 정보 수정
    public void modifyUser(UserVO userVO);

    //  비밀번호 수정
    public void modifyPassword(UserVO userVO);

    //  회원탈퇴
    public void exitUser(UserVO userVO);
}
