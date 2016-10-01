package com.algaworks.socialbooks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.kelvearagao.socialbooks.SocialbooksapiApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SocialbooksapiApplication.class)
@WebAppConfiguration
public class SocialbooksapiApplicationTests {

	@Test
	public void contextLoads() {
	}

}
