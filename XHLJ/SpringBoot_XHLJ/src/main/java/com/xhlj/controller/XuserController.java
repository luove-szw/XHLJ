package com.xhlj.controller;


import com.xhlj.entity.Xuser;
import com.xhlj.service.IXuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 老当益壮
 * @since 2024-01-02
 */
@RestController
@RequestMapping("/xuser")
public class XuserController {

    @Autowired
    private IXuserService xuserService;
    //全部用户
    @GetMapping("/list")
    public List<Xuser> list(){
        return xuserService.list();
    }
    //新增用户
    @PostMapping("/save")
    public boolean save(@RequestBody Xuser xuser){
        return xuserService.save(xuser);
    }
    //修改用户信息
    @PostMapping("/mod")
    public boolean mod(@RequestBody Xuser xuser){
        return xuserService.updateById(xuser);
    }

}
