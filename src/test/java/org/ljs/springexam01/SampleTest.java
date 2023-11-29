package org.ljs.springexam01;


import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.ljs.springexam01.dto.SampleDTO;
import org.ljs.springexam01.sample.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:/src/main/webapp/WEB-INF/root-context.xml")
public class SampleTest {

    private SampleDTO sampleDTO;



}
