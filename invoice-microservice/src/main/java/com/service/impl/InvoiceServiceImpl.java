import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

/**
 * Created by muyun on 2017/3/1.
 */
public class InvoiceServiceImpl implements InvoiceService {

//    @Autowired
//    private InvoiceDao invoiceDao;


    @Override
    public Invoice getInvoiceById(String id) {
        return null;
    }

    @Override
    public InvoiceLine getInvoiceLineById(String id) {
        return null;
    }

    @Override
    public InvoicePack getInvoicePackById(String id) {
        return null;
    }

    @Override
    public List<Invoice> getInvoicesByIds(Set<String> ids) {
        return null;
    }

    @Override
    public List<InvoiceLine> getInvoiceLinesByIds(Set<String> ids) {
        return null;
    }

    @Override
    public List<InvoicePack> getInvoicePacksByIds(Set<String> ids) {
        return null;
    }

    @Override
    public List<InvoiceLine> getInvoiceLinesByInvoiceId(String id) {
        return null;
    }
}
