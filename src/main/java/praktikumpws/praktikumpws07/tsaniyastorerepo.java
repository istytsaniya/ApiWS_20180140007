/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package praktikumpws.praktikumpws07;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author harumanis
 */
public interface tsaniyastorerepo extends JpaRepository<tsaniyastore,String> {

    public List<tsaniyastore> findAll();
}