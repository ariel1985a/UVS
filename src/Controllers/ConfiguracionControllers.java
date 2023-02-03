package Controllers;

import Models.Configuracion;
import Models.ConfiguracionDao;
import Views.PanelAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ConfiguracionControllers implements ActionListener{
    private Configuracion conf;
    private ConfiguracionDao confDao;
    private PanelAdmin views;

    public ConfiguracionControllers(Configuracion conf, ConfiguracionDao confDao, PanelAdmin views) {
        this.conf = conf;
        this.confDao = confDao;
        this.views = views;
        this.views.btnModificarEmpresa.addActionListener(this);
    }

    public ConfiguracionControllers() {
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnModificarEmpresa) {
            if (views.txtRucEmpresa.getText().equals("")
                    || views.txtNombreEmpresa.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todo los campos son obligatorios");
            } else {
                conf.setRuc(views.txtRucEmpresa.getText());
                conf.setNombre(views.txtNombreEmpresa.getText());
                conf.setTelefono(views.txtTelefonoEmpresa.getText());
                conf.setDireccion(views.txtDireccionEmpresa.getText());
                conf.setMensaje(views.txtMensaje.getText());
                if (confDao.modificarConf(conf)) {
                    JOptionPane.showMessageDialog(null, "Usuario Modificado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar el usuario");
                }
            }
        }
    }
}
