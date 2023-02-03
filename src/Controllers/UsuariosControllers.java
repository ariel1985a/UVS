package Controllers;

import Models.Combo;
import Models.Tables;
import Models.UsuarioDao;
import Models.Usuarios;
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

public class UsuariosControllers implements ActionListener, MouseListener, KeyListener {

    private Usuarios us;
    private UsuarioDao usDao;
    private PanelAdmin views;

    DefaultTableModel modelo = new DefaultTableModel();

    public UsuariosControllers(Usuarios us, UsuarioDao usDao, PanelAdmin views) {
        this.us = us;
        this.usDao = usDao;
        this.views = views;
        this.views.btnRegitrarUser.addActionListener(this);
        this.views.btnModificarUser.addActionListener(this);
        this.views.JMenuEliminarUsers.addActionListener(this);
        this.views.JMenuReingresarUser.addActionListener(this);
        this.views.btnNuevoUser.addActionListener(this);
        this.views.txtBuscarUsers.addKeyListener(this);
        this.views.TableUsers.addMouseListener(this);
        this.views.JLabelUsers.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegitrarUser) {
            if (views.txtUsuarioUser.getText().equals("")
                    || views.txtNombreUser.getText().equals("")
                    || String.valueOf(views.txtClaveUser.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Todo los campos son obligatorios");
            } else {
                us.setUsuario(views.txtUsuarioUser.getText());
                us.setNombre(views.txtNombreUser.getText());
                us.setClave(String.valueOf(views.txtClaveUser.getPassword()));
                Combo itemCaja = (Combo) views.cbxCajaUser.getSelectedItem();
                us.setCaja(itemCaja.getId());
                us.setRol(views.cbxRolUser.getSelectedItem().toString());
                if (usDao.registrar(us)) {
                    limpiarTable();
                    listarUsuarios();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Usuario registrado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar el usuario");
                }

            }
        } else if (e.getSource() == views.btnModificarUser) {
            if (views.txtUsuarioUser.getText().equals("")
                    || views.txtNombreUser.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todo los campos son obligatorios");
            } else {
                us.setUsuario(views.txtUsuarioUser.getText());
                us.setNombre(views.txtNombreUser.getText());
                Combo itemCaja = (Combo) views.cbxCajaUser.getSelectedItem();
                us.setCaja(itemCaja.getId());
                us.setRol(views.cbxRolUser.getSelectedItem().toString());
                us.setId(Integer.parseInt(views.txtIdUser.getText()));
                if (usDao.modificar(us)) {
                    limpiarTable();
                    listarUsuarios();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Usuario Modificado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar el usuario");
                }

            }
        } else if (e.getSource() == views.JMenuEliminarUsers) {
            if (views.txtIdUser.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
            } else {
                int id = Integer.parseInt(views.txtIdUser.getText());
                if (usDao.accion("Inactivo", id)) {
                    limpiarTable();
                    listarUsuarios();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Usuario eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar usuario");
                }
            }
        } else if (e.getSource() == views.JMenuReingresarUser) {
            if (views.txtIdUser.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar");
            } else {
                int id = Integer.parseInt(views.txtIdUser.getText());
                if (usDao.accion("Activo", id)) {
                    limpiarTable();
                    listarUsuarios();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Usuario reingresado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar usuario");
                }
            }
        }else{
            limpiar();
        }
    }

    public void listarUsuarios() {
        Tables color = new Tables();
        views.TableUsers.setDefaultRenderer(views.TableUsers.getColumnClass(0), color);
        List<Usuarios> lista = usDao.ListaUsuarios(views.txtBuscarUsers.getText());
        modelo = (DefaultTableModel) views.TableUsers.getModel();
        Object[] ob = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getUsuario();
            ob[2] = lista.get(i).getNombre();
            ob[3] = lista.get(i).getRol();
            ob[4] = lista.get(i).getCaja();
            ob[5] = lista.get(i).getNombre_caja();
            ob[6] = lista.get(i).getEstado();
            modelo.addRow(ob);
        }
        views.TableUsers.setModel(modelo);
        JTableHeader header = views.TableUsers.getTableHeader();
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
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.TableUsers) {
            int fila = views.TableUsers.rowAtPoint(e.getPoint());
            views.txtIdUser.setText(views.TableUsers.getValueAt(fila, 0).toString());
            views.txtUsuarioUser.setText(views.TableUsers.getValueAt(fila, 1).toString());
            views.txtNombreUser.setText(views.TableUsers.getValueAt(fila, 2).toString());
            views.cbxRolUser.setSelectedItem(views.TableUsers.getValueAt(fila, 3).toString());
            int id_caja = Integer.parseInt(views.TableUsers.getValueAt(fila, 4).toString());
            String caja = (views.TableUsers.getValueAt(fila, 5).toString());
            views.cbxCajaUser.setSelectedItem(new Combo(id_caja, caja));
            
            views.txtClaveUser.setEnabled(false);
        }else if(e.getSource() == views.JLabelUsers){
            views.jTabbedPane1.setSelectedIndex(3);
            limpiarTable();
            listarUsuarios();
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

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == views.txtBuscarUsers) {
            limpiarTable();
            listarUsuarios();
        }
    }
    private void limpiar(){
        views.txtIdUser.setText("");
        views.txtUsuarioUser.setText("");
        views.txtNombreUser.setText("");
        views.txtClaveUser.setText("");
    }
}
