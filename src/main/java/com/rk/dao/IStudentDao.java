package com.rk.dao;

import java.util.List;
import java.util.Map;

import com.rk.model.Students;

public interface IStudentDao {
	public void createStudentTabe();

	public void dropStudendsTable();

	public int insertStudentsRecords(int sno1, String sname1, double smarks1);

	public int deleteStudentRecord(int sno);

	public int updateStudentRecord(int sno1, String sname1, double smarks1);

	public Map getOneRecordAsKeyAndValue(int sno);

	public List getAllRecord();

	public Students getOneObjeUsingObjectMapper(int sno);

	public List<Students> getAllStudentUsingObjectMapper();
}
