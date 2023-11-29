package org.ljs;


import com.mysql.cj.xdevapi.SessionFactory;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.ljs.springexam01.dto.SampleDTO;
import org.ljs.springexam01.dao.SampleDAO1;
import org.ljs.springexam01.mapper.SampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/root-context.xml")
public class DBConnectionTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private SampleDAO1 sampleDAO1;


    @Autowired(required = false)
    private SampleMapper mapper;

    @Test
    public void mapperTest() throws Exception{
        log.info(mapper.getTime());
        List<SampleDTO> list= mapper.getList();
        for(int i=0; i<list.size(); i++){
            log.info(list.get(i));
    }
    }



    @Test
    public void testSelect() throws Exception{
        List<SampleDTO> list= sampleDAO1.selectList();
        for(int i=0; i<list.size(); i++){
            log.info(list.get(i));
        }

    }

    @Test
    public void testConnect() throws Exception{
        Connection connection=dataSource.getConnection();
        log.info(connection);
        connection.close();
    }





}
