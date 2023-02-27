package com.edubridge;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDeleteRowsIntable {
   static DeleteRowsIntable dl=null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	dl=new DeleteRowsIntable();
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
	void DeleteRowsIntableTest() throws ClassNotFoundException, SQLException {
		//assertNotNull(dl.mySqlStatement());
		assertEquals(1,dl.DeleteValues());
	}
}
