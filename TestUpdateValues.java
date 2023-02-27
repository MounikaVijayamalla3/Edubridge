package com.edubridge;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestUpdateValues {
static UpdateValues u = null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		u=new UpdateValues();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void UpdatevalueTest() throws ClassNotFoundException, SQLException {
		assertNotNull(u.mySqlStatement());
	}

}
