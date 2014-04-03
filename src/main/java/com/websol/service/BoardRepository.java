package com.websol.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.websol.notice.model.Bean;

@Service //db결과의 저장공간,어노테이션으로 자동으로 연결한다.
public class BoardRepository extends DefaultTransactionDefinition{
	//db 결과의 저장 공간
	@Autowired // contextConfig.xml에서 설정한 빈
	SqlSessionTemplate sqlSessionTemplate;
	
	@Autowired //트랜젝션 관리자
	PlatformTransactionManager tx;
	
	//트랜잭션 상태를 받을수 있는 변수
	TransactionStatus status;
	public List<Bean> selectList()
	{
		Bean bean = new Bean();
		//bean.setCnt(null);
		//bean.setPname("밍");
		return sqlSessionTemplate.selectList("mapper.selectList",bean);
	}
	public Bean selectDetail(Integer id)
	{
		return sqlSessionTemplate.selectOne("mapper.selectDetail",id);
	}
	public int insertOne(Bean bean)
	{
		return sqlSessionTemplate.insert("mapper.insertOne",bean);
	}
	public int insertList(List<Bean> list)
	{
		//현재 클래스에 트랜젝션의 정보를 받을수 있는 인터페이스를 받아와야 구현
		//인터페이스를 직접받지 않고 adapter클래스로 받아옴
		status = tx.getTransaction(this);
		int res = sqlSessionTemplate.insert("mapper.insertList",list);
		//tx.rollback(status);
		tx.commit(status);
		return res;
	}
	public int update()
	{
		return sqlSessionTemplate.update("mapper.update",50);
	}
	public int delete()
	{
		
		return sqlSessionTemplate.delete("mapper.delete","밍또");
	}
}
