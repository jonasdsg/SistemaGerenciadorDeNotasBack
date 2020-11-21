
package edu.uni.SistemaGerenciadorDeNotas.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.uni.SistemaGerenciadorDeNotas.client package. 
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

    private final static QName _ObterTodosOsAlunos_QNAME = new QName("http://ws.SistemaGerenciadorDeNotasBack.uni.edu/", "obterTodosOsAlunos");
    private final static QName _RemoverAlunoResponse_QNAME = new QName("http://ws.SistemaGerenciadorDeNotasBack.uni.edu/", "removerAlunoResponse");
    private final static QName _RemoverAluno_QNAME = new QName("http://ws.SistemaGerenciadorDeNotasBack.uni.edu/", "removerAluno");
    private final static QName _CadastrarAluno_QNAME = new QName("http://ws.SistemaGerenciadorDeNotasBack.uni.edu/", "cadastrarAluno");
    private final static QName _CadastrarAlunoResponse_QNAME = new QName("http://ws.SistemaGerenciadorDeNotasBack.uni.edu/", "cadastrarAlunoResponse");
    private final static QName _Aluno_QNAME = new QName("http://ws.SistemaGerenciadorDeNotasBack.uni.edu/", "aluno");
    private final static QName _ObterTodosOsAlunosResponse_QNAME = new QName("http://ws.SistemaGerenciadorDeNotasBack.uni.edu/", "obterTodosOsAlunosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.uni.SistemaGerenciadorDeNotas.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Aluno }
     * 
     */
    public Aluno createAluno() {
        return new Aluno();
    }

    /**
     * Create an instance of {@link ObterTodosOsAlunosResponse }
     * 
     */
    public ObterTodosOsAlunosResponse createObterTodosOsAlunosResponse() {
        return new ObterTodosOsAlunosResponse();
    }

    /**
     * Create an instance of {@link ObterTodosOsAlunos }
     * 
     */
    public ObterTodosOsAlunos createObterTodosOsAlunos() {
        return new ObterTodosOsAlunos();
    }

    /**
     * Create an instance of {@link RemoverAlunoResponse }
     * 
     */
    public RemoverAlunoResponse createRemoverAlunoResponse() {
        return new RemoverAlunoResponse();
    }

    /**
     * Create an instance of {@link RemoverAluno }
     * 
     */
    public RemoverAluno createRemoverAluno() {
        return new RemoverAluno();
    }

    /**
     * Create an instance of {@link CadastrarAluno }
     * 
     */
    public CadastrarAluno createCadastrarAluno() {
        return new CadastrarAluno();
    }

    /**
     * Create an instance of {@link CadastrarAlunoResponse }
     * 
     */
    public CadastrarAlunoResponse createCadastrarAlunoResponse() {
        return new CadastrarAlunoResponse();
    }

    /**
     * Create an instance of {@link Avaliacao }
     * 
     */
    public Avaliacao createAvaliacao() {
        return new Avaliacao();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterTodosOsAlunos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.SistemaGerenciadorDeNotasBack.uni.edu/", name = "obterTodosOsAlunos")
    public JAXBElement<ObterTodosOsAlunos> createObterTodosOsAlunos(ObterTodosOsAlunos value) {
        return new JAXBElement<ObterTodosOsAlunos>(_ObterTodosOsAlunos_QNAME, ObterTodosOsAlunos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverAlunoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.SistemaGerenciadorDeNotasBack.uni.edu/", name = "removerAlunoResponse")
    public JAXBElement<RemoverAlunoResponse> createRemoverAlunoResponse(RemoverAlunoResponse value) {
        return new JAXBElement<RemoverAlunoResponse>(_RemoverAlunoResponse_QNAME, RemoverAlunoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverAluno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.SistemaGerenciadorDeNotasBack.uni.edu/", name = "removerAluno")
    public JAXBElement<RemoverAluno> createRemoverAluno(RemoverAluno value) {
        return new JAXBElement<RemoverAluno>(_RemoverAluno_QNAME, RemoverAluno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarAluno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.SistemaGerenciadorDeNotasBack.uni.edu/", name = "cadastrarAluno")
    public JAXBElement<CadastrarAluno> createCadastrarAluno(CadastrarAluno value) {
        return new JAXBElement<CadastrarAluno>(_CadastrarAluno_QNAME, CadastrarAluno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarAlunoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.SistemaGerenciadorDeNotasBack.uni.edu/", name = "cadastrarAlunoResponse")
    public JAXBElement<CadastrarAlunoResponse> createCadastrarAlunoResponse(CadastrarAlunoResponse value) {
        return new JAXBElement<CadastrarAlunoResponse>(_CadastrarAlunoResponse_QNAME, CadastrarAlunoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Aluno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.SistemaGerenciadorDeNotasBack.uni.edu/", name = "aluno")
    public JAXBElement<Aluno> createAluno(Aluno value) {
        return new JAXBElement<Aluno>(_Aluno_QNAME, Aluno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterTodosOsAlunosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.SistemaGerenciadorDeNotasBack.uni.edu/", name = "obterTodosOsAlunosResponse")
    public JAXBElement<ObterTodosOsAlunosResponse> createObterTodosOsAlunosResponse(ObterTodosOsAlunosResponse value) {
        return new JAXBElement<ObterTodosOsAlunosResponse>(_ObterTodosOsAlunosResponse_QNAME, ObterTodosOsAlunosResponse.class, null, value);
    }

}
