package com.example.BasicServer;


import Implementation.loginImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.HashMap;

@RestController
@Service
public class controller {

    @Autowired
    public loginImpl login;
    @PostMapping(value = "/test")
    public ResponseEntity<String> example(@RequestBody String fromClient) throws SQLException {
        insetdata insetdata = new insetdata();
        String responseBody= "Welcome";
        return ResponseEntity.ok(responseBody);
    }

    @PostMapping(value ="/login")
    public ResponseEntity<String> getUsers(@RequestBody String userName){
        String user = login.loginMap(userName);
        return ResponseEntity.ok(user);
    }

    @PostMapping(value = "/address")
    public ResponseEntity<HashMap<String,String>> address(@RequestBody String userDetails) {
        HashMap<String,HashMap<String,String>> address = new HashMap<>();
        HashMap<String,String> stringStringHashMap = new HashMap<>();

        stringStringHashMap.put("Name","Vishnu");
        stringStringHashMap.put("Address","Hyd");
        stringStringHashMap.put("City","Hyd");
        stringStringHashMap.put("State","Telangana");
        stringStringHashMap.put("Zip","534401");

        HashMap<String,String> stringStringHashMap1= new HashMap<>();
        stringStringHashMap1.put("Name","Charan");
        stringStringHashMap1.put("Address","Hyd");
        stringStringHashMap1.put("City","Mylavaram");
        stringStringHashMap1.put("State","Ap");
        stringStringHashMap1.put("Zip","534401");
        address.put("Vishnu",stringStringHashMap);
        address.put("Charan",stringStringHashMap1);
        return ResponseEntity.ok(address.get(userDetails));
    }
}
