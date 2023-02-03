package Controllers;

import Models.Categorias;
import Models.CategoriasDao;
import Models.Combo;
import Models.Tables;
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

public class CategoriasControllers implements ActionListener, MouseListener, KeyListener {

    private final Categorias cat;
    private final CategoriasDao catDao;
    private final PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();

    public CategoriasControllers(Categorias cat, CategoriasDao catDao, PanelAdmin views) {
        this.cat = cat;
        this.catDao = catDao;
        this.views = views;
        this.views.btnRegitrarCat.addActionListener(this);
        this.views.btnNuevoCat.addActionListener(this);
        this.views.btnModificarCat.addActionListener(this);
        this.views.TableCat.addMouseListener(this);
        this.views.JLabelCat.addMouseListener(this);
        this.views.JMenuEliminarCat.addActionListener(this);
        this.views.JMenuReingresarCat.addActionListener(this);
        this.views.txtBuscarCat.addKeyListener(this);
        llenarCat();
        AutoCompleteDecorator.decorate(views.cbxCatPro);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegitrarCat) {
            if (views.txtNombreCat.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Rellene el campo nombre");
            } else {
                cat.setNombre(views.txtNombreCat.getText());
                if (catDao.registrar(cat)) {
                    Nuevo();
                    limpiarTable();
                    listarCategorias();
                    JOptionPane.showMessageDialog(null, "Categoria Registrado");
                } else {
                    JOptionPane.showMessageDialog(null, "La categoria ya existe");
                }
            }
        } else if (e.getSource() == views.btnModificarCat) {
            if (views.txtNombreCat.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Rellene el campo nombre");
            } else {
                cat.setNombre(views.txtNombreCat.getText());
                cat.setId(Integer.parseInt(views.txtIdCat.getText()));
                if (catDao.modificar(cat)) {
                    Nuevo();
                    limpiarTable();
                    listarCategorias();
                    JOptionPane.showMessageDialog(null, "Categoria Modificado");
                }
            }
        } else if (e.getSource() == views.JMenuEliminarCat) {
            if (views.txtIdCat.getText().equals("") || views.txtIdCat.getText() == null) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
            } else {
                int pregunta = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (pregunta == 0) {
                    int id = Integer.parseInt(views.txtIdCat.getText());
                    if (catDao.accion("Inactivo", id)) {
                        Nuevo();
                        limpiarTable();
                        listarCategorias();
                        JOptionPane.showMessageDialog(null, "Categoria Eliminado");
                    }
                }
            }
        } else if (e.getSource() == views.JMenuReingresarCat) {
            if (views.txtIdCat.getText().equals("") || views.txtIdCat.getText() == null) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar");
            } else {
                int pregunta = JOptionPane.showConfirmDialog(null, "Estas seguro de reingresar", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (pregunta == 0) {
                    int id = Integer.parseInt(views.txtIdCat.getText());
                    if (catDao.accion("Activo", id)) {
                        Nuevo();
                        limpiarTable();
                        listarCategorias();
                        JOptionPane.showMessageDialog(null, "Categoria Reingresado");
                    }
                }
            }
        } else if (e.getSource() == views.btnNuevoCat) {
            Nuevo();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.TableCat) {
            int fila = views.TableCat.rowAtPoint(e.getPoint());
            views.txtIdCat.setText(views.TableCat.getValueAt(fila, 0).toString());
            views.txtNombreCat.setText(views.TableCat.getValueAt(fila, 1).toString());
        } else if (e.getSource() == views.JLabelCat) {
            views.jTabbedPane1.setSelectedIndex(4);
            limpiarTable();
            listarCategorias();
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
        views.txtIdCat.setText("");
        views.txtNombreCat.setText("");
    }

    public void listarCategorias() {
        Tables color = new Tables();
        views.TableCat.setDefaultRenderer(views.TableCat.getColumnClass(0), color);
        List<Categorias> lista = catDao.ListarCat(views.txtBuscarCat.getText());
        modelo = (DefaultTableModel) views.TableCat.getModel();
        Object[] ob = new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getEstado();
            modelo.addRow(ob);
        }
        views.TableCat.setModel(modelo);
        JTableHeader header = views.TableCat.getTableHeader();
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
        if (e.getSource() == views.txtBuscarCat) {
            limpiarTable();
            listarCategorias();
        }
    }
    private void llenarCat(){
     List<Categorias> lista = catDao.ListarCat(views.txtBuscarCat.getText());
        for (int i = 0; i < lista.size(); i++) {
            int id = lista.get(i).getId();
            String nombre = lista.get(i).getNombre();
            views.cbxCatPro.addItem(new Combo(id, nombre));
        }  
   }

}
