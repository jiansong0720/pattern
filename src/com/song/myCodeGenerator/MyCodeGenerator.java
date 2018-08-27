package com.song.myCodeGenerator;

import com.song.codeGenerator.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyCodeGenerator {

    public static final String ENTER = "\n";//换行
    public static final String NOW_DATE = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    public static final String BASE_PACKAGE = "com.song.test";
    public static final String DOMAIN_PACKAGE = BASE_PACKAGE + ".domain";
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".controller";
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";
    public static final String REPOSITORY_PACKAGE = BASE_PACKAGE + ".repository";
    public static final String AUTHOR = "jiansong0720@gmail.com";

    public static void main(String[] args) {
        MyCodeGenerator myCodeGenerator = new MyCodeGenerator();
        String table = "Order";
        myCodeGenerator.createRepositoryClass(table, "订单");
        myCodeGenerator.createServiceClass(table, "订单");
        myCodeGenerator.createControllerClass(table,"订单");
    }

    public void createRepositoryClass(String className, String describe) {
        StringBuilder buffer = new StringBuilder();
        //引入包
        buffer.append("package " + REPOSITORY_PACKAGE + ";").append(ENTER);
        buffer.append(ENTER);
        buffer.append("import " + DOMAIN_PACKAGE + "." + className + ";").append(ENTER);
        buffer.append("import org.springframework.data.jpa.repository.JpaRepository;").append(ENTER);
        buffer.append("import org.springframework.data.jpa.repository.JpaSpecificationExecutor;").append(ENTER);
        buffer.append(ENTER);

        //填写作者信息
        authorMessage(describe, buffer);

        //类生成
        buffer.append("public interface " + className + "Repository extends JpaRepository<" + className + ", Long>, JpaSpecificationExecutor<" + className + "> {");
        buffer.append(ENTER);
        buffer.append(ENTER);
        buffer.append("}");
        FileUtils.save("src/" + REPOSITORY_PACKAGE.replaceAll("\\.", "/") + "/" + className + "Repository.java", buffer.toString());
    }

    /***
     * 创建Service的接口
     * createServiceClass
     */
    public void createServiceClass(String className, String describe) {
        StringBuilder buffer = new StringBuilder();
        buffer.append("package " + SERVICE_PACKAGE + ";").append(ENTER);
        buffer.append(ENTER);
        buffer.append("import " + DOMAIN_PACKAGE + "." + className + ";").append(ENTER);
        buffer.append("import " + REPOSITORY_PACKAGE + "." + className + "Repository;").append(ENTER);
        buffer.append("import org.springframework.stereotype.Service;").append(ENTER);
        buffer.append(ENTER);

        //填写作者信息
        authorMessage(describe, buffer);

        buffer.append("@Service").append(ENTER);
        buffer.append("public class " + className + "Service {").append(ENTER);
        buffer.append(ENTER);
        buffer.append("}");
        buffer.append(ENTER);
        FileUtils.save("src/" + SERVICE_PACKAGE.replaceAll("\\.", "/") + "/" + className + "Service.java", buffer.toString());
    }

    /***
     * 创建控制层类Controller
     */
    public void createControllerClass(String className, String describe) {
        StringBuilder buffer = new StringBuilder();
        buffer.append("package " + CONTROLLER_PACKAGE + ";").append(ENTER);
        buffer.append(ENTER);

        buffer.append("import " + DOMAIN_PACKAGE + "." + className + ";").append(ENTER);
        buffer.append("import " + SERVICE_PACKAGE + "." + className + "Service;").append(ENTER);

        buffer.append("import io.swagger.annotations.Api;").append(ENTER);
        buffer.append("import io.swagger.annotations.ApiOperation;").append(ENTER);
        buffer.append("import org.springframework.web.bind.annotation.*;").append(ENTER);
        buffer.append(ENTER);

        //填写作者信息
        authorMessage(describe, buffer);


        buffer.append("@RestController").append(ENTER);
        buffer.append("@RequestMapping(\"/").append(StringUtils.uncapitalize(className)).append("/\")").append(ENTER);
        buffer.append("@Api(tags = \"").append(describe).append("\", produces = \"application/json\"").append(")").append(ENTER);

        buffer.append("public class " + className + "Controller {").append(ENTER);
        buffer.append(ENTER);
        buffer.append("@Resource").append(ENTER);
        buffer.append("private ").append(className).append("Service ").append(StringUtils.uncapitalize(className)).append("Service;").append(ENTER);
        buffer.append(ENTER);

        buffer.append("}");
        FileUtils.save("src/" + CONTROLLER_PACKAGE.replaceAll("\\.", "/") + "/" + className + "Controller.java", buffer.toString());
    }

    private void authorMessage(String describe, StringBuilder buffer) {
        buffer.append("/** ").append(ENTER);
        buffer.append(" * @Author " + AUTHOR).append(ENTER);
        buffer.append(" * @Describe " + describe).append(ENTER);
        buffer.append(" * @Date " + NOW_DATE).append(ENTER);
        buffer.append(" */").append(ENTER);
    }

}

