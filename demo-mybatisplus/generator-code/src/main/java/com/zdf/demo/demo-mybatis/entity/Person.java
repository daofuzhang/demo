package com.zdf.demo.demo-mybatis.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ivanzhang
 * @since 2020-08-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Person extends Model<Person> {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String name;

    private Integer age;

    private LocalDate birthday;


    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String AGE = "age";

    public static final String BIRTHDAY = "birthday";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
