import java.util.List;

/**
 * Created by muyun on 2017/3/1.
 */
public class ExAggInvoice {


    private Invoice invoice;

    private List<InvoiceLine> invoiceLines;

    private List<InvoicePack> invoicePacks;

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public List<InvoiceLine> getInvoiceLines() {
        return invoiceLines;
    }

    public void setInvoiceLines(List<InvoiceLine> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }

    public List<InvoicePack> getInvoicePacks() {
        return invoicePacks;
    }

    public void setInvoicePacks(List<InvoicePack> invoicePacks) {
        this.invoicePacks = invoicePacks;
    }
}
