import java.util.List;
import java.util.Set;

/**
 * Created by muyun on 2017/3/1.
 */
public interface InvoiceService {

    public Invoice getInvoiceById(String id);

    public InvoiceLine getInvoiceLineById(String id);

    public InvoicePack getInvoicePackById(String id);

    public List<Invoice> getInvoicesByIds(Set<String> ids);

    public List<InvoiceLine> getInvoiceLinesByIds(Set<String> ids);

    public List<InvoicePack> getInvoicePacksByIds(Set<String> ids);

    public List<InvoiceLine> getInvoiceLinesByInvoiceId(String id);



}
