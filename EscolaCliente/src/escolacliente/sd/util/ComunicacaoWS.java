package escolacliente.sd.util;

import com.ifma.sd.Aluno;

/**
 *
 * @author Pedro Brito
 */
public class ComunicacaoWS {

    public static Aluno getAluno(int matricula) {
        com.ifma.sd.Escola_Service service = new com.ifma.sd.Escola_Service();
        com.ifma.sd.Escola port = service.getEscolaPort();
        return port.getAluno(matricula);
    }

    public static java.util.List<com.ifma.sd.Aluno> getTurma(java.lang.String turma) {
        com.ifma.sd.Escola_Service service = new com.ifma.sd.Escola_Service();
        com.ifma.sd.Escola port = service.getEscolaPort();
        return port.getTurma(turma);
    }
    
}
