package com.rk.objmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.rk.model.Students;

@Component
public class StudentMapper implements RowMapper<Students> {

	@Override
	public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
		Students st = new Students();
		st.setStdId(rs.getInt("sno"));
		st.setStdSname(rs.getString("sname"));
		st.setStdSmarks(rs.getDouble("smarks"));
		return st;
	}

}
