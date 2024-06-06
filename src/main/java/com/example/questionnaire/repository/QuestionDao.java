package com.example.questionnaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.questionnaire.entity.Question;

<<<<<<< HEAD
@Repository //Dao只是來繼承JPA語法
public interface QuestionDao extends JpaRepository<Question, Integer>{

	public void deleteAllByQnIdIn(List<Integer> qnIdList); //刪除問卷問題,刪除多筆
	
	public void deleteAllByQnIdAndQuIdIn(int qnId,List<Integer> quIdList);
	
	public List<Question> findByQuIdInAndQnId(List<Integer> idList,int qnId);

	public List<Question> findAllByQnIdIn(List<Integer> qnIdList);
	
	public List<Question> findAllByQnId(int qnid);
	
//	SQL語法練習	
	@Query(value = "insert into question(id, qn_id, q_title, option_type, is_necessary, q_option)"
			+ " values(?1, ?2, ?3, ?4, ?5, ?6)", nativeQuery = true)
	public void insert(int id, int qnid, String qtitle, String optionType, boolean isNecessary, String qoption);
	
=======
@Repository
public interface QuestionDao extends JpaRepository<Question,Integer>{
>>>>>>> 3574534accc9673b71bf9cd8bd9e82d904ab7dc0

}
