package org.ljs.springexam01.sample;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@ToString
//@AllArgsConstructor
public class SampleService {
    @Autowired
    private SampleDAO sampleDAO;

//    인터페이스 상속, 아무지정도 안함
//    @Autowired
//    private ISampleDAO iSampleDAO1;

//    인터페이스 상속, qualifier로 설정
    @Autowired
    @Qualifier("normal")
    private ISampleDAO iSampleDAO2;

}
