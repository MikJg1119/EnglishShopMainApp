package com.example.EnglishShopMainApp.controller;

import com.example.EnglishShopMainApp.model.UserGroup;
import com.example.EnglishShopMainApp.service.UserGroupService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/userGroup")
public class UserGroupController {
    private UserGroupService userGroupService;

    public UserGroupController(UserGroupService userGroupService) {
        this.userGroupService = userGroupService;
    }

    // REST API saveUserGroup
    @PostMapping
    public ResponseEntity<UserGroup> saveUserGroup(@RequestBody UserGroup userGroup){
        return new ResponseEntity<UserGroup>(userGroupService.saveUserGroup(userGroup), HttpStatus.CREATED);
    }
    // REST API getAllUserGroup
    @GetMapping
    public List<UserGroup> getAllUserGroup(){
     return userGroupService.getAllUserGroup();
    }
    // REST API getUserGroupByID
    @GetMapping("{id}")
    public ResponseEntity<UserGroup> getUserGroupByID(@PathVariable("id") Long id ){
        return new ResponseEntity<UserGroup>(userGroupService.getUserGroupByID(id),HttpStatus.OK);
    }
    // REST API updateUserGroup
    @PutMapping ("{id}")
    public ResponseEntity<UserGroup> updateUserGroup(@PathVariable ("id") Long id , @RequestBody UserGroup userGroup){
        return new ResponseEntity<UserGroup>(userGroupService.updateUserGroup(userGroup,id),HttpStatus.OK);
    }
    //REST API deleteUserGroup
    @DeleteMapping ("{id}")
    public ResponseEntity<String> deleteUserGroup(@PathVariable("id") Long id ){
        userGroupService.deleteUserGroup(id);
        return new ResponseEntity<String>("UserGroup is delete",HttpStatus.OK);
    }


}
