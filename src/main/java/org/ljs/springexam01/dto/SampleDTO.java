package org.ljs.springexam01.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor //모든 필드를 가진 생성자
@NoArgsConstructor //디폴트 생성자
public class SampleDTO {
    private int idx;
    private String name;
    private int age;
    private String phone;
    private Date postdate;

}
