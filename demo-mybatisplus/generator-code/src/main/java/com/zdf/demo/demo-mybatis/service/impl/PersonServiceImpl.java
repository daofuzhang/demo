package com.zdf.demo.demo-mybatis.service.impl;

import com.zdf.demo.demo-mybatis.entity.Person;
import com.zdf.demo.demo-mybatis.dao.PersonDao;
import com.zdf.demo.demo-mybatis.service.PersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ivanzhang
 * @since 2020-08-21
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonDao, Person> implements PersonService {

}
