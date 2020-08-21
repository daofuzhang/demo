package com.zdf.demo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MysqlGenerator { /**
     * ����
     */
    private static final String PACKAGE_NAME = "com.zdf.demo";
    /**
     * ģ������
     */
    private static final String MODULE_NAME = "demo-mybatis";
    /**
     * ����ļ���·��
     */
    private static final String OUT_PATH = System.getProperty("user.dir")+ "/generator-code/src/main/java";
    /**
     * ����������
     */
    private static final String AUTHOR = "ivanzhang";

    /**
     * JDBC�������
     */
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://192.168.137.145:3306/demo";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "Welcome1";
    
    /**
     * table name
     */
    private static final String TABLE_NAME = "person";
    /**
     * <p>
     * MySQL ������ʾ
     * </p>
     */
    public static void main(String[] args) {
        // �Զ�����Ҫ�����ֶ�
        List<TableFill> tableFillList = new ArrayList<TableFill>();
        //�� ÿ�ű���һ������ʱ�䡢�޸�ʱ��
        //����������Ͼ���ͨ�õ��ˣ�����ʱ������ʱ����޸�ʱ��ͬʱ�޸�
        //�޸�ʱ���޸�ʱ����޸ģ�
        //��Ȼ��Mysql���ݿ����Զ����¼�ֻ������ORACLE�����ݿ��û���ˣ�
        //ʹ�ù����ֶ���书�ܣ��Ϳ���ʵ�֣��Զ������������ˡ�
        //����������
        TableFill createField = new TableFill("create_date", FieldFill.INSERT); 
        TableFill modifiedField = new TableFill("modified_date", FieldFill.INSERT_UPDATE); 
        tableFillList.add(createField);
        tableFillList.add(modifiedField);
        
        // ����������
        AutoGenerator mpg = new AutoGenerator().setGlobalConfig(
                // ȫ������
                new GlobalConfig().setOutputDir(OUT_PATH)// ���Ŀ¼
                        .setFileOverride(true)// �Ƿ񸲸��ļ�
                        .setActiveRecord(true)// ���� activeRecord ģʽ
                        .setEnableCache(false)// XML ��������
                        .setBaseResultMap(false)// XML ResultMap
                        .setBaseColumnList(true)// XML columList
                        .setAuthor(AUTHOR)
                        // �Զ����ļ�������ע�� %s ���Զ�����ʵ�����ԣ�
                        .setXmlName("%sMapper").setMapperName("%sDao")
         .setServiceName("%sService")
         .setServiceImplName("%sServiceImpl")
         .setControllerName("%sController")
        ).setDataSource(
                // ����Դ����
                new DataSourceConfig().setDbType(DbType.MYSQL)// ���ݿ�����
                .setDriverName(DRIVER).setUsername(USER_NAME).setPassword(PASSWORD).setUrl(URL))
                .setStrategy(
                        // ��������
                        new StrategyConfig()
                                // .setCapitalMode(true)// ȫ�ִ�д����
                                //.setDbColumnUnderline(true)// ȫ���»�������
                                // .setTablePrefix(new String[]{"unionpay_"})// �˴������޸�Ϊ���ı�ǰ׺
                                .setNaming(NamingStrategy.underline_to_camel)// �������ɲ���
                                 .setInclude(new String[] {TABLE_NAME}) // ��Ҫ���ɵı�
                                // .setExclude(new String[]{"test"}) // �ų����ɵı�
                                // �Զ���ʵ�壬�����ֶ�
                                // .setSuperEntityColumns(new String[]{"test_id"})
                                .setTableFillList(tableFillList)
                                // �Զ���ʵ�常��
                                // .setSuperEntityClass("com.baomidou.demo.base.BsBaseEntity")
                                // // �Զ��� mapper ����
                                // .setSuperMapperClass("com.baomidou.demo.base.BsBaseMapper")
                                // // �Զ��� service ����
                                // .setSuperServiceClass("com.baomidou.demo.base.BsBaseService")
                                // // �Զ��� service ʵ���ุ��
                                // .setSuperServiceImplClass("com.baomidou.demo.base.BsBaseServiceImpl")
                                // �Զ��� controller ����
                                // .setSuperControllerClass("com.baomidou.demo.TestController")
                                // ��ʵ�塿�Ƿ������ֶγ�����Ĭ�� false��
                                // public static final String ID = "test_id";
                                .setEntityColumnConstant(true)
                                // ��ʵ�塿�Ƿ�Ϊ������ģ�ͣ�Ĭ�� false��
                                // public User setName(String name) {this.name = name; return this;}
                                .setEntityBuilderModel(true)
                                // ��ʵ�塿�Ƿ�Ϊlombokģ�ͣ�Ĭ�� false��<a href="https://projectlombok.org/">document</a>
                                .setEntityLombokModel(true)
                // Boolean�����ֶ��Ƿ��Ƴ�isǰ׺����
                 .setEntityBooleanColumnRemoveIsPrefix(true)
                 .setRestControllerStyle(true)
                 .setControllerMappingHyphenStyle(true)
                ).setPackageInfo(
                        // ������
                        new PackageConfig().setModuleName(MODULE_NAME).setParent(PACKAGE_NAME)// �Զ����·��
                                .setController("controller")// �����ǿ�����������Ĭ�� web
                                .setXml("mapper").setMapper("dao")

                ).setCfg(
                        // ע���Զ������ã������� VM ��ʹ�� cfg.abc ���õ�ֵ
                        new InjectionConfig() {
                            @Override
                            public void initMap() {
                                Map<String, Object> map = new HashMap<String, Object>();
                                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                                this.setMap(map);
                            }
                        }.setFileOutConfigList(
                                Collections.<FileOutConfig>singletonList(new FileOutConfig("/templates/mapper.xml.vm") {
                                    // �Զ�������ļ�Ŀ¼
                                    @Override
                                    public String outputFile(TableInfo tableInfo) {
                                        return OUT_PATH + "/xml/" + tableInfo.getEntityName() + "Mapper.xml";
                                    }
                                })))
                .setTemplate(
                        // �ر�Ĭ�� xml ���ɣ��������� �� ��Ŀ¼
                        new TemplateConfig().setXml(null)
        // �Զ���ģ�����ã�ģ����Բο�Դ�� /mybatis-plus/src/main/resources/template ʹ�� copy
        // ������Ŀ src/main/resources/template Ŀ¼�£�ģ������Ҳ���Զ����������ã�
        // .setController("...");
        // .setEntity("...");
        // .setMapper("...");
        // .setXml("...");
        // .setService("...");
        // .setServiceImpl("...");
        );

        // ִ������
        mpg.execute();
    }
 }
