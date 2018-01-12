
package com.ifma.sd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getAluno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getAluno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAluno", propOrder = {
    "matricula"
})
public class GetAluno {

    protected int matricula;

    /**
     * Obtém o valor da propriedade matricula.
     * 
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * Define o valor da propriedade matricula.
     * 
     */
    public void setMatricula(int value) {
        this.matricula = value;
    }

}
