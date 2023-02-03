package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConfiguracionDao {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;    
    
    
    public boolean modificarConf(Configuracion cof) {
        String sql = "UPDATE configuracion SET ruc = ?, nombre = ?, telefono = ?, direccion = ?, mensaje = ? WHERE id = 1";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cof.getRuc());
            ps.setString(2, cof.getNombre());
            ps.setString(3, cof.getTelefono());
            ps.setString(4, cof.getDireccion());
            ps.setString(5, cof.getMensaje());
            //ps.setInt(6, cof.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
