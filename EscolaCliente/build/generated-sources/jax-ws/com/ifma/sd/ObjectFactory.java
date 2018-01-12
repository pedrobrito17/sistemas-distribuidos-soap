
package com.ifma.sd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ifma.sd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetTurmaResponse_QNAME = new QName("http://sd.ifma.com/", "getTurmaResponse");
    private final static QName _GetTurma_QNAME = new QName("http://sd.ifma.com/", "getTurma");
    private final static QName _GetAlunoResponse_QNAME = new QName("http://sd.ifma.com/", "getAlunoResponse");
    private final static QName _GetAluno_QNAME = new QName("http://sd.ifma.com/", "getAluno");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ifma.sd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAluno }
     * 
     */
    public GetAluno createGetAluno() {
        return new GetAluno();
    }

    /**
     * Create an instance of {@link GetTurma }
     * 
     */
    public GetTurma createGetTurma() {
        return new GetTurma();
    }

    /**
     * Create an instance of {@link GetTurmaResponse }
     * 
     */
    public GetTurmaResponse createGetTurmaResponse() {
        return new GetTurmaResponse();
    }

    /**
     * Create an instance of {@link GetAlunoResponse }
     * 
     */
    public GetAlunoResponse createGetAlunoResponse() {
        return new GetAlunoResponse();
    }

    /**
     * Create an instance of {@link Aluno }
     * 
     */
    public Aluno createAluno() {
        return new Aluno();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTurmaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sd.ifma.com/", name = "getTurmaResponse")
    public JAXBElement<GetTurmaResponse> createGetTurmaResponse(GetTurmaResponse value) {
        return new JAXBElement<GetTurmaResponse>(_GetTurmaResponse_QNAME, GetTurmaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTurma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sd.ifma.com/", name = "getTurma")
    public JAXBElement<GetTurma> createGetTurma(GetTurma value) {
        return new JAXBElement<GetTurma>(_GetTurma_QNAME, GetTurma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlunoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sd.ifma.com/", name = "getAlunoResponse")
    public JAXBElement<GetAlunoResponse> createGetAlunoResponse(GetAlunoResponse value) {
        return new JAXBElement<GetAlunoResponse>(_GetAlunoResponse_QNAME, GetAlunoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAluno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sd.ifma.com/", name = "getAluno")
    public JAXBElement<GetAluno> createGetAluno(GetAluno value) {
        return new JAXBElement<GetAluno>(_GetAluno_QNAME, GetAluno.class, null, value);
    }

}
