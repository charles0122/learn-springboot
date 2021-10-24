package top.arce.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: bootstudy
 * @description: 宠物实体类
 * @author: charles
 * @create: 2021-10-23 18:09
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {

    private String name;
    private Double weight;


}
