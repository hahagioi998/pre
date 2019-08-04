package com.xd.pre.modules.codegen.service.Impl;

import com.xd.pre.modules.codegen.domain.CodeGenConfig;
import com.xd.pre.modules.codegen.domain.SysColumnEntity;
import com.xd.pre.modules.codegen.domain.SysTableEntity;
import com.xd.pre.modules.codegen.mapper.SysCodeMapper;
import com.xd.pre.modules.codegen.service.SysCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname SysCodeServiceImpl
 * @Description 代码生成服务实现类
 * @Author Created by Lihaodong (alias:小东啊) lihaodongmail@163.com
 * @Date 2019-08-02 14:21
 * @Version 1.0
 */
@Service
public class SysCodeServiceImpl implements SysCodeService {

    @Autowired
    private SysCodeMapper sysCodeMapper;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.driver-class-name}")
    private String driverName;




    @Override
    public List<SysTableEntity> findTableList(String tableSchema) {
        return sysCodeMapper.findTableList(tableSchema);
    }

    @Override
    public List<SysColumnEntity> findColumnList(String tableName, String tableSchema) {
        return sysCodeMapper.findColumnList(tableName, tableSchema);
    }

    @Override
    public boolean generatorCode(CodeGenConfig codeGenConfig) {

        return false;
    }
}
