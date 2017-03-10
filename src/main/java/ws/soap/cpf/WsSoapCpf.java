/*
 * Projeto criado e mantido pela PRODESP.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.soap.cpf;

import com.google.gson.Gson;
import java.util.ResourceBundle;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Jose Wdison de Souza <a>wdison@hotmail.com</a>
 */
@WebService(serviceName = "WsSoapCpf", portName = "WsSoapCpfPort")
public class WsSoapCpf {
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "consulta")
    public Pessoa consulta(@WebParam(name = "cpf") String cpf) {
        Pessoa result = new Pessoa(cpf);
        ResourceBundle bundle1 = ResourceBundle.getBundle("cpfSources");
        if(bundle1!=null) {
            String pessoaString = bundle1.getString(cpf);
            if (pessoaString != null && pessoaString.contains("cpf")) {
                Gson gson = new Gson();
                result = gson.fromJson(pessoaString, Pessoa.class);
            } 
        }
        return result;
    }
}
