package com.example.universityratingsystem.config;

import java.sql.DriverManager;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.example.universityratingsystem.dao.interfaces.StudentMapper;

@Configuration
@MapperScan(basePackages = "com.example.universityratingsystem.dao.interfaces", markerInterface = StudentMapper.class)
public class MyBatisConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception{
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        return sessionFactory.getObject();
    }

    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/university_evaluation_system");
        dataSource.setUsername("root");
        dataSource.setPassword("MySQL1234!");
        return dataSource;

    }

    @Bean
    public MapperFactoryBean<StudentMapper> studentMapper(SqlSessionFactory s) {
        MapperFactoryBean<StudentMapper> factoryBean = new MapperFactoryBean<>();
        factoryBean.setSqlSessionFactory(s);
        return factoryBean;
    }

    // @Bean
    // public StudentMapper studentMapper(SqlSessionFactory sqlSessionFactory) {
    //     SqlSession s = sqlSessionFactory.openSession();
    //     return s.getMapper(StudentMapper.class);
    // }
}
