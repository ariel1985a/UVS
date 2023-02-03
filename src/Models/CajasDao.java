package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CajasDao {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public List ListarCajas(String valor) {
        List<Cajas> lista = new ArrayList();
        try {
            con = cn.getConexion();
            if ("".equalsIgnoreCase(valor)) {
                String sql = "SELECT * FROM cajas ORDER BY estado ASC";
                ps = con.prepareStatement(sql);
            } else {
                String sql = "SELECT * FROM cajas WHERE nombre LIKE '%" + valor + "%' OR estado LIKE '%" + valor + "%'";
                ps = con.prepareStatement(sql);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                Cajas caja = new Cajas();
                caja.setId(rs.getInt("id"));
                caja.setNombre(rs.getString("nombre"));
                caja.setEstado(rs.getString("estado"));
                lista.add(caja);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista;
    }

    public boolean registrarCajas(Cajas caja) {
        String sql = "INSERT INTO cajas (nombre) VALUES (?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, caja.getNombre());
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean modificarCajas(Cajas caja) {

        String sql = "UPDATE cajas SET nombre = ? WHERE id = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, caja.getNombre());
            ps.setInt(2, caja.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean accion(String estado, int id) {
        String sql = "UPDATE cajas SET estado = ? WHERE id = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, estado);
            ps.setInt(2, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public String abrirCaja(double monto, int id_user) {
        String consulta = "SELECT d.*, u.nombre FROM detalle_cajas d INNER JOIN usuarios u ON d.id_user = u.id WHERE d.estado = 1";
        String sql = "INSERT INTO detalle_cajas (monto_inicial, id_user) VALUES (?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            if (rs.next()) {
                return "existe";
            } else {
                ps = con.prepareStatement(sql);
                ps.setDouble(1, monto);
                ps.setInt(2, id_user);
                ps.execute();
                return "registrado";
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return "error";
        }
    }
    
    public List ListarAperturas(String valor) {
        List<AperturaCierre> lista = new ArrayList();
        try {
            con = cn.getConexion();            
            if ("".equalsIgnoreCase(valor)) {
                String sql = "SELECT d.*, u.nombre FROM detalle_cajas d INNER JOIN usuarios u ON d.id_user = u.id ORDER BY d.fecha_apertura DESC";
                ps = con.prepareStatement(sql);
            } else {
                String sql = "SELECT d.*, u.nombre FROM detalle_cajas d INNER JOIN usuarios u ON d.id_user = u.id WHERE u.nombre LIKE '%" + valor + "%' OR d.fecha_apertura LIKE '%" + valor + "%'";
                ps = con.prepareStatement(sql);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                AperturaCierre apert = new AperturaCierre();
                apert.setFecha_apertura(rs.getString("fecha_apertura"));
                apert.setFecha_cierre(rs.getString("fecha_cierre"));
                apert.setMonto_inicial(rs.getDouble("monto_inicial"));
                apert.setMonto_final(rs.getDouble("monto_final"));
                apert.setTotal_ventas(rs.getInt("total_ventas"));
                apert.setNombre_usuario(rs.getString("nombre"));
                lista.add(apert);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista;
    }
    
    public double MontoFinal(int id_user) {
        double monto = 0.00;
        String sql = "SELECT SUM(total) AS monto_total FROM ventas WHERE id_user = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_user);
            rs = ps.executeQuery();
            if (rs.next()) {
                monto = rs.getDouble("monto_total");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return monto;
    }
    
    public int totalVentas(int id_user) {
        int total = 0;
        String sql = "SELECT COUNT(*) AS total FROM ventas WHERE id_user = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_user);
            rs = ps.executeQuery();
            if (rs.next()) {
                total = rs.getInt("total");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return total;
    }
    
    public boolean cerrarCaja(AperturaCierre apert) {
        String sql = "UPDATE detalle_cajas SET fecha_cierre = ?, monto_final = ?, total_ventas = ?, estado = ?  WHERE id_user = ? AND estado = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, apert.getFecha_cierre());
            ps.setDouble(2, apert.getMonto_final());
            ps.setDouble(3, apert.getTotal_ventas());
            ps.setDouble(4, 0);
            ps.setDouble(5, apert.getId_usuario());
            ps.setDouble(6, 1);
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
     public boolean LimpiarDatos(Ventas vent){
         String sql = "DELETE from ventas WHERE id_user = ";
         con = cn.getConexion();
         try {  
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
}
