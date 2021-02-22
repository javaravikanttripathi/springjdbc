package com.rk.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rk.dao.IStudentDao;
import com.rk.model.Students;
import com.rk.objmapper.StudentMapper;

@Repository
public class StudentDaoImpl implements IStudentDao {
	private static final String CREATE_STUDENT = "CREATE TABLE STUDENTS(SNO NUMBER,SNAME VARCHAR2(20),SMARKS FLOAT)";
	private static final String DROB_TABLE = "DROP TABLE STUDENTS";
	private static final String INSERT_STUDENTS_RECORDS = "INSERT INTO STUDENTS VALUES(?,?,?)";
	private static final String DELECT_STUDENT = "DELETE FROM STUDENTS WHERE SNO=?";
	// private static final String UPDATE_STUDENT = "UPDATE STUDENTS SET
	// SNAME=?,SMARKS=? WHERE SNO=?";
	public static final String SELECT_STUDENT_ONE_RECORD = "SELECT * FROM STUDENTS WHERE SNO=?";
	public static final String SELECT_ALL_RECORDS = "SELECT * FROM STUDENTS";
	public static final String CREATE_TABLE_FOR_MYSQL = "CREATE TABLE STUDENTS(SNO INT,SNAME VARCHAR(20),SMARKS FLOAT)";
	public static final String INSERT_STUDENT_FOR_MYSQL = "INSERT INTO STUDENTS VALUES(?,?,?)";
	@Autowired
	private JdbcTemplate jt;
	@Autowired
	private StudentMapper sm;

	@Override
	public void createStudentTabe() {
		jt.execute(CREATE_TABLE_FOR_MYSQL);
	}

	@Override
	public void dropStudendsTable() {
		jt.execute(DROB_TABLE);
	}

	@Override
	public int insertStudentsRecords(int sno1, String sname1, double smarks1) {
		int id = jt.update(INSERT_STUDENT_FOR_MYSQL, sno1, sname1, smarks1);
		return id;
	}

	@Override
	public int deleteStudentRecord(int sno) {
		int id = jt.update(DELECT_STUDENT, sno);
		return id;
	}

	@Override
	public int updateStudentRecord(int sno, String sname, double smarks) {
		// int id = jt.update(UPDATE_STUDENT, sno, sname, smarks);
		return 0;
	}

	@Override
	public Map getOneRecordAsKeyAndValue(int sno) {
		Map map = jt.queryForMap(SELECT_STUDENT_ONE_RECORD, sno);
		return map;
	}

	@Override
	public List getAllRecord() {
		List list = jt.queryForList(SELECT_ALL_RECORDS);
		return list;
	}

	@Override
	public Students getOneObjeUsingObjectMapper(int sno) {
		Students st = jt.queryForObject(SELECT_STUDENT_ONE_RECORD, sm, sno);
		return st;
	}

	@Override
	public List<Students> getAllStudentUsingObjectMapper() {
		List<Students> list = jt.query(SELECT_ALL_RECORDS, sm);
		return list;
	}

}
