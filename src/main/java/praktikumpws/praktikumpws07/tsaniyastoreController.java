/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpws.praktikumpws07;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author harumanis
 */
@CrossOrigin
@RestController
@RequestMapping("/stokhijab")

public class tsaniyastoreController {
    @Autowired
     private tsaniyastorerepo tsaniyastore;
     
     @GetMapping("/tsaniyastore")
    public List<tsaniyastore> getAllTsaniyastore(){
        return tsaniyastore.findAll();
    }
    
    @GetMapping ("/tsaniyastore/{idbarang}")
    public tsaniyastore getErialbById(@PathVariable String idbarang){
        return tsaniyastore.findById(idbarang).get();
    }
    
    @PostMapping ("/tsaniyastore")
    public tsaniyastore saveTsaniyastoreDetails(@RequestBody tsaniyastore c){
        return tsaniyastore.save(c);
    }
    
    @PutMapping("/tsaniyastore")
    public tsaniyastore updateTsaniyastore(@RequestBody tsaniyastore c){
        return tsaniyastore.save(c);
    }
    
    @DeleteMapping("/tsaniyastore/{idbarang}")
    public ResponseEntity<HttpStatus> deleteTsaniyastoreById(@PathVariable String idbarang){
        tsaniyastore.deleteById(idbarang);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
