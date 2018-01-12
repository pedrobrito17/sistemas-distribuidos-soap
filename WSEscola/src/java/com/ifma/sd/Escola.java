package com.ifma.sd;

import com.ifma.sd.dao.AlunoDAO;
import com.ifma.sd.model.Aluno;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Pedro Brito
 */
@WebService(serviceName = "Escola")
public class Escola {

    /**
     * Operação de Web service
     * @param matricula
     * @return Aluno
     */
    @WebMethod(operationName = "getAluno")
    public Aluno getAluno(@WebParam(name = "matricula") int matricula) {
        return new AlunoDAO().getAluno(matricula);
    }

    /**
     * Operação de Web service
     * @param turma
     * @return ArrayList
     */
    @WebMethod(operationName = "getTurma")
    public ArrayList<Aluno> getTurma(@WebParam(name = "turma") String turma) {
        return new AlunoDAO().getTurma(turma);
    }
}
