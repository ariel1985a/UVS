package Controllers;

import Models.AperturaCierre;
import Models.Cajas;
import Models.CajasDao;
import Models.Combo;
import Models.Tables;
import Models.Ventas;
import Views.PanelAdmin;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class CajasControllers implements ActionListener, MouseListener, KeyListener {

    private final Cajas cj;
    private final CajasDao cjDao;
    private final PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();

    public CajasControllers(Cajas cj, CajasDao cjDao, PanelAdmin views) {
        this.cj = cj;
        this.cjDao = cjDao;
        this.views = views;
        this.views.btnRegitrarCaja.addActionListener(this);
        this.views.btnNuevoCaja.addActionListener(this);
        this.views.btnModificarCaja.addActionListener(this);
        this.views.TableCaja.addMouseListener(this);
        this.views.JLabelCaja.addMouseListener(this);
        this.views.JMenuEliminarCaja.addActionListener(this);
        this.views.JMenuReingresarCaja.addActionListener(this);
        this.views.txtBuscarCaja.addKeyListener(this);
        this.views.btnCajas.addActionListener(this);
        
        this.views.btnAbrirCaja.addActionListener(this);
        this.views.btnCerrarCaja.addActionListener(this);
        this.views.btnNuevoApertura.addActionListener(this);
        
        listarCajas();
        llenarCajas();
        AutoCompleteDecorator.decorate(views.cbxCajaUser);
        
        listarAperturas();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegitrarCaja) {
            registrarCaja();
        } else if (e.getSource() == views.btnModificarCaja) {
            modificarCaja();
        }else if (e.getSource() == views.JMenuEliminarCaja) {
            eliminarCaja();
        } else if (e.getSource() == views.JMenuReingresarCaja) {
            reingresarCaja();
        }else if (e.getSource() == views.btnNuevoCaja) {
            Nuevo();
        }else if (e.getSource() == views.btnCajas) {
            views.jTabbedPane1.setSelectedIndex(12);
            limpiarTable();
            listarAperturas();
        }
        //Apertura y Cierre
        else if (e.getSource() == views.btnAbrirCaja) {
            abrirCaja();
        } else if (e.getSource() == views.btnCerrarCaja) {
            cerrarCaja();
//            limpiarTable();
//            listarCajas();
        }else if (e.getSource() == views.btnNuevoApertura) {
            NuevaApertura();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.TableCaja) {
            int fila = views.TableCaja.rowAtPoint(e.getPoint());
            views.txtIdCaja.setText(views.TableCaja.getValueAt(fila, 0).toString());
            views.txtNombreCaja.setText(views.TableCaja.getValueAt(fila, 1).toString());
        } else if (e.getSource() == views.JLabelCaja) {
            views.jTabbedPane1.setSelectedIndex(11);
            limpiarTable();
            listarCajas();
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    private void Nuevo() {
        views.txtIdCaja.setText("");
        views.txtNombreCaja.setText("");
    }

    public void listarCajas() {
        Tables color = new Tables();
        views.TableCaja.setDefaultRenderer(views.TableCaja.getColumnClass(0), color);
        List<Cajas> lista = cjDao.ListarCajas(views.txtBuscarCaja.getText());
        modelo = (DefaultTableModel) views.TableCaja.getModel();
        Object[] ob = new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getEstado();
            modelo.addRow(ob);
        }
        views.TableCaja.setModel(modelo);
        JTableHeader header = views.TableCaja.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
        header.setForeground(Color.white);
    }

    public void limpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == views.txtBuscarCaja) {
            limpiarTable();
            listarCajas();
        }
    }
    //Cajas
    private void llenarCajas(){
     List<Cajas> lista = cjDao.ListarCajas(views.txtBuscarCaja.getText());
        for (int i = 0; i < lista.size(); i++) {
            int id = lista.get(i).getId();
            String nombre = lista.get(i).getNombre();
            views.cbxCajaUser.addItem(new Combo(id, nombre));
            
        }  
   }
    
    private void registrarCaja(){
        if (views.txtNombreCaja.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Rellene el campo nombre");
            } else {
                cj.setNombre(views.txtNombreCaja.getText());
                if (cjDao.registrarCajas(cj)) {
                    Nuevo();
                    limpiarTable();
                    listarCajas();
                    JOptionPane.showMessageDialog(null, "Caja Registrado");
                } else {
                    JOptionPane.showMessageDialog(null, "LEror al registrar la caja");
                }
            }
    }
    
    private void modificarCaja(){
        if (views.txtNombreCaja.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Rellene el campo nombre");
            } else {
                cj.setNombre(views.txtNombreCaja.getText());
                cj.setId(Integer.parseInt(views.txtIdCaja.getText()));
                if (cjDao.modificarCajas(cj)) {
                    Nuevo();
                    limpiarTable();
                    listarCajas();
                    JOptionPane.showMessageDialog(null, "Caja Modificado");
                }
            }
    }
    
    private void eliminarCaja(){
        if (views.txtIdCaja.getText().equals("") || views.txtIdCaja.getText() == null) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
            } else {
                int pregunta = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (pregunta == 0) {
                    int id = Integer.parseInt(views.txtIdCaja.getText());
                    if (cjDao.accion("Inactivo", id)) {
                        Nuevo();
                        limpiarTable();
                        listarCajas();
                        JOptionPane.showMessageDialog(null, "Caja Eliminado");
                    }
                }
            }
    }
    
    private void reingresarCaja(){
        if (views.txtIdCaja.getText().equals("") || views.txtIdCaja.getText() == null) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
            } else {
                int pregunta = JOptionPane.showConfirmDialog(null, "Estas seguro de reingresar", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (pregunta == 0) {
                    int id = Integer.parseInt(views.txtIdCaja.getText());
                    if (cjDao.accion("Activo", id)) {
                        Nuevo();
                        limpiarTable();
                        listarCajas();
                        JOptionPane.showMessageDialog(null, "Caja Reingresada");
                    }
                }
            }
    }
    
    //Apertura y cierre
    private void abrirCaja(){
        if (views.txtMontoInicial.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese el monto inicial");
            } else {
            double monto = Double.parseDouble(views.txtMontoInicial.getText());
            int id_user = Integer.parseInt(views.txtIdUsuario.getText());
            String resultado = cjDao.abrirCaja(monto, id_user);
                if ("existe".equalsIgnoreCase(resultado)) {
                    JOptionPane.showMessageDialog(null, "La caja ya esta abierta");
                } else if("registrado".equalsIgnoreCase(resultado)){
                    limpiarTable();
                    listarAperturas();
                    NuevaApertura();
                    JOptionPane.showMessageDialog(null, "Caja abierta");
                }else{
                    JOptionPane.showMessageDialog(null, "Error al abrir la caja");
                }
            }
    }
    
    private void cerrarCaja(){
        Ventas vent = null;
        int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de cerrar la caja");
        if (pregunta == 0) {
            double monto_final = cjDao.MontoFinal(Integer.parseInt(views.txtIdUsuario.getText()));
            System.out.println(monto_final);
            int totalventas = cjDao.totalVentas(Integer.parseInt(views.txtIdUsuario.getText()));
            System.out.println(monto_final);
            AperturaCierre apert = new AperturaCierre();
            apert.setFecha_cierre("2022-07-27 21:38:54");
            
            apert.setMonto_final(monto_final);
            apert.setTotal_ventas(totalventas);
            apert.setId_usuario(Integer.parseInt(views.txtIdUsuario.getText()));
            if (cjDao.cerrarCaja(apert)) {
                JOptionPane.showMessageDialog(null, "Caja cerrada");
                limpiarTable();
                listarAperturas();
                
            }else{
                JOptionPane.showMessageDialog(null, "Error al cerrar la caja");
            }
        }
    }
    
    private void NuevaApertura(){
        views.txtMontoInicial.setText("");
        views.txtBuscarApertura.setText("");
    }
    
      public void listarAperturas() {
//        Tables color = new Tables();
//        views.TableApertura.setDefaultRenderer(views.TableApertura.getColumnClass(0), color);
        List<AperturaCierre> lista = cjDao.ListarAperturas(views.txtBuscarApertura.getText());
        modelo = (DefaultTableModel) views.TableApertura.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getFecha_apertura();
            ob[1] = lista.get(i).getFecha_cierre();
            ob[2] = lista.get(i).getMonto_inicial();
            ob[3] = lista.get(i).getMonto_final();
            ob[4] = lista.get(i).getTotal_ventas();
            ob[5] = lista.get(i).getNombre_usuario();
            modelo.addRow(ob);
        }
        views.TableApertura.setModel(modelo);
        JTableHeader header = views.TableApertura.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
        header.setForeground(Color.white);
    }

}
