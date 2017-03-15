
package parsing.generateddocumentprocessor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the parsing.generateddocumentprocessor package.
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

    private final static QName _ProcessDocumentException_QNAME = new QName("http://home.textkernel.nl/sourcebox/soap/documentProcessor", "ProcessDocumentException");
    private final static QName _ProcessDocumentResponse_QNAME = new QName("http://home.textkernel.nl/sourcebox/soap/documentProcessor", "processDocumentResponse");
    private final static QName _ProcessURLAtomic_QNAME = new QName("http://home.textkernel.nl/sourcebox/soap/documentProcessor", "processURLAtomic");
    private final static QName _ProcessDocument_QNAME = new QName("http://home.textkernel.nl/sourcebox/soap/documentProcessor", "processDocument");
    private final static QName _ProcessURLAtomicResponse_QNAME = new QName("http://home.textkernel.nl/sourcebox/soap/documentProcessor", "processURLAtomicResponse");
    private final static QName _ProcessDocumentAdvancedResponse_QNAME = new QName("http://home.textkernel.nl/sourcebox/soap/documentProcessor", "processDocumentAdvancedResponse");
    private final static QName _ProcessDocumentAdvanced_QNAME = new QName("http://home.textkernel.nl/sourcebox/soap/documentProcessor", "processDocumentAdvanced");
    private final static QName _ProcessDocumentApimap_QNAME = new QName("", "apimap");
    private final static QName _ProcessDocumentFileContent_QNAME = new QName("", "fileContent");
    private final static QName _ProcessDocumentTmfFileContent_QNAME = new QName("", "tmfFileContent");
    private final static QName _ProcessURLAtomicResponseReturn_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: parsing.generateddocumentprocessor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessDocumentException }
     * 
     */
    public ProcessDocumentException createProcessDocumentException() {
        return new ProcessDocumentException();
    }

    /**
     * Create an instance of {@link ProcessDocument }
     * 
     */
    public ProcessDocument createProcessDocument() {
        return new ProcessDocument();
    }

    /**
     * Create an instance of {@link ProcessURLAtomicResponse }
     * 
     */
    public ProcessURLAtomicResponse createProcessURLAtomicResponse() {
        return new ProcessURLAtomicResponse();
    }

    /**
     * Create an instance of {@link ProcessDocumentResponse }
     * 
     */
    public ProcessDocumentResponse createProcessDocumentResponse() {
        return new ProcessDocumentResponse();
    }

    /**
     * Create an instance of {@link ProcessURLAtomic }
     * 
     */
    public ProcessURLAtomic createProcessURLAtomic() {
        return new ProcessURLAtomic();
    }

    /**
     * Create an instance of {@link ProcessDocumentAdvanced }
     * 
     */
    public ProcessDocumentAdvanced createProcessDocumentAdvanced() {
        return new ProcessDocumentAdvanced();
    }

    /**
     * Create an instance of {@link ProcessDocumentAdvancedResponse }
     * 
     */
    public ProcessDocumentAdvancedResponse createProcessDocumentAdvancedResponse() {
        return new ProcessDocumentAdvancedResponse();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessDocumentException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://home.textkernel.nl/sourcebox/soap/documentProcessor", name = "ProcessDocumentException")
    public JAXBElement<ProcessDocumentException> createProcessDocumentException(ProcessDocumentException value) {
        return new JAXBElement<ProcessDocumentException>(_ProcessDocumentException_QNAME, ProcessDocumentException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://home.textkernel.nl/sourcebox/soap/documentProcessor", name = "processDocumentResponse")
    public JAXBElement<ProcessDocumentResponse> createProcessDocumentResponse(ProcessDocumentResponse value) {
        return new JAXBElement<ProcessDocumentResponse>(_ProcessDocumentResponse_QNAME, ProcessDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessURLAtomic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://home.textkernel.nl/sourcebox/soap/documentProcessor", name = "processURLAtomic")
    public JAXBElement<ProcessURLAtomic> createProcessURLAtomic(ProcessURLAtomic value) {
        return new JAXBElement<ProcessURLAtomic>(_ProcessURLAtomic_QNAME, ProcessURLAtomic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://home.textkernel.nl/sourcebox/soap/documentProcessor", name = "processDocument")
    public JAXBElement<ProcessDocument> createProcessDocument(ProcessDocument value) {
        return new JAXBElement<ProcessDocument>(_ProcessDocument_QNAME, ProcessDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessURLAtomicResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://home.textkernel.nl/sourcebox/soap/documentProcessor", name = "processURLAtomicResponse")
    public JAXBElement<ProcessURLAtomicResponse> createProcessURLAtomicResponse(ProcessURLAtomicResponse value) {
        return new JAXBElement<ProcessURLAtomicResponse>(_ProcessURLAtomicResponse_QNAME, ProcessURLAtomicResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessDocumentAdvancedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://home.textkernel.nl/sourcebox/soap/documentProcessor", name = "processDocumentAdvancedResponse")
    public JAXBElement<ProcessDocumentAdvancedResponse> createProcessDocumentAdvancedResponse(ProcessDocumentAdvancedResponse value) {
        return new JAXBElement<ProcessDocumentAdvancedResponse>(_ProcessDocumentAdvancedResponse_QNAME, ProcessDocumentAdvancedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessDocumentAdvanced }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://home.textkernel.nl/sourcebox/soap/documentProcessor", name = "processDocumentAdvanced")
    public JAXBElement<ProcessDocumentAdvanced> createProcessDocumentAdvanced(ProcessDocumentAdvanced value) {
        return new JAXBElement<ProcessDocumentAdvanced>(_ProcessDocumentAdvanced_QNAME, ProcessDocumentAdvanced.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "apimap", scope = ProcessDocument.class)
    public JAXBElement<byte[]> createProcessDocumentApimap(byte[] value) {
        return new JAXBElement<byte[]>(_ProcessDocumentApimap_QNAME, byte[].class, ProcessDocument.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fileContent", scope = ProcessDocument.class)
    public JAXBElement<byte[]> createProcessDocumentFileContent(byte[] value) {
        return new JAXBElement<byte[]>(_ProcessDocumentFileContent_QNAME, byte[].class, ProcessDocument.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tmfFileContent", scope = ProcessDocument.class)
    public JAXBElement<byte[]> createProcessDocumentTmfFileContent(byte[] value) {
        return new JAXBElement<byte[]>(_ProcessDocumentTmfFileContent_QNAME, byte[].class, ProcessDocument.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = ProcessURLAtomicResponse.class)
    public JAXBElement<byte[]> createProcessURLAtomicResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_ProcessURLAtomicResponseReturn_QNAME, byte[].class, ProcessURLAtomicResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "apimap", scope = ProcessDocumentAdvanced.class)
    public JAXBElement<byte[]> createProcessDocumentAdvancedApimap(byte[] value) {
        return new JAXBElement<byte[]>(_ProcessDocumentApimap_QNAME, byte[].class, ProcessDocumentAdvanced.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fileContent", scope = ProcessDocumentAdvanced.class)
    public JAXBElement<byte[]> createProcessDocumentAdvancedFileContent(byte[] value) {
        return new JAXBElement<byte[]>(_ProcessDocumentFileContent_QNAME, byte[].class, ProcessDocumentAdvanced.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tmfFileContent", scope = ProcessDocumentAdvanced.class)
    public JAXBElement<byte[]> createProcessDocumentAdvancedTmfFileContent(byte[] value) {
        return new JAXBElement<byte[]>(_ProcessDocumentTmfFileContent_QNAME, byte[].class, ProcessDocumentAdvanced.class, ((byte[]) value));
    }

}
