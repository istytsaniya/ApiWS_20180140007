/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpws.praktikumpws07;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author harumanis
 */
@Entity
@Table(name="hijab")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class tsaniyastore {
    @Id
    private String idbarang;
    private String namabarang;
    private String warna;
    private String harga;
}
