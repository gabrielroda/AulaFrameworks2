
package pacote;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @since 05/10/2015
 * @author Gabriel Henrique Marcondes Roda
 */

@ViewScoped
@ManagedBean
public class Exercicio {

    private String login, senha;
    public String logar() {
        if (login.equals("usuario") && senha.equals("1234")) {
            return "logado";
        } else {
            return "erro";
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}

