package com.rk.test;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rk.config.AppConfig;
import com.rk.dao.IStudentDao;
import com.rk.dao.impl.StudentDaoImpl;
import com.rk.model.Students;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		IStudentDao dao = ac.getBean("studentDaoImpl", StudentDaoImpl.class);
		// dao.createStudentTabe();
		// dao.dropStudendsTable();
		// System.out.println("TABLE iS CREATED");

		/*
		 * int id = dao.insertStudentsRecords(101, "Pankaj", 100); if (id == 0) {
		 * System.out.println("Record is not Inserted"); } else {
		 * System.out.println("Record is Inserted"); }
		 */

		/*
		 * int id = dao.deleteStudentRecord(105); if (id == 0) {
		 * System.out.println("Record not Deleted"); } else {
		 * System.out.println("Record is Deleted"); }
		 * 
		 * 
		 * int id = dao.updateStudentRecord(104, "Suraj Kumar", 425); if (id == 0) {
		 * System.out.println("Record is not updated"); } else {
		 * System.out.println("Record is Updated"); }
		 */

		/*
		 * Map map = dao.getOneRecordAsKeyAndValue(102); System.out.println(map);
		 */
		/*
		 * List list = dao.getAllRecord(); list.forEach(e -> System.out.println(e));
		 */
		/*
		 * Students st = dao.getOneObjeUsingObjectMapper(101); System.out.println(st);
		 */

		List<Students> list = dao.getAllStudentUsingObjectMapper();
		list.forEach(r -> System.out.println(r));
	}

}
